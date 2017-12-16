package wiki.services.common.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import wiki.models.OrderMode;
import wiki.models.common.lang.NotFoundException;
import wiki.models.common.utils.ValidatorUtil;
import wiki.repository.common.ICrudRepository;
import wiki.services.common.IGenericRawService;

@Transactional(value = "transactionManager") // is inherited {@Inherited}
public abstract class AbstractRawService<T extends Serializable, ID extends Serializable>
		implements IGenericRawService<T, ID> {
	@Autowired
	Validator validator;

	protected abstract ICrudRepository<T, ID> getRepository();

	@Override
	public T save(final T entity) {
		ValidatorUtil.validateEntityFields(validator, entity);
		return getRepository().save(entity);
	}

	@Override
	public T findOne(final ID id) {
		final T entity = getRepository().findOne(id);
		if (entity == null) {
			throw new NotFoundException(String.format("%s with id %s not found",
					getRepository().getEntityClass().getSimpleName(), String.valueOf(id)));
		}
		return entity;
	}

	@Override
	public <Y extends Comparable<? super Y>> T findByProperty(final String url, final String value) {
		return getRepository().findByProperty(url, value);
	}

	@Override
	public List<T> findAll() {
		return getRepository().findAll();
	}

	public <Y extends Comparable<? super Y>> List<T> findAll(final Date orderAttribute, final OrderMode orderMode) {
		return getRepository().findAll(orderAttribute, orderMode);
	}

	@Override
	public Boolean exists(final ID id) {
		return getRepository().exists(id);
	}

	@Override
	public T update(final T entity) {
		return getRepository().update(entity);
	}

	@Override
	public void delete(final T entity) {
		getRepository().delete(entity);
	}

	@Override
	public void deleteById(final ID id) {
		getRepository().deleteById(id);
	}
}