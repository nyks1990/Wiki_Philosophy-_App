package wiki.models.common.contracts;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import wiki.models.OrderMode;

public interface ICrudOperations<T extends Serializable, ID extends Serializable> {
	T save(final T entity);

	T findOne(final ID id);

	<Y extends Comparable<? super Y>> T findByProperty(String url, String value);

	List<T> findAll();

	<Y extends Comparable<? super Y>> List<T> findAll(Date updatedAt, OrderMode orderMode);

	Boolean exists(final ID id);

	T update(final T entity);

	void delete(final T entity);

	void deleteById(final ID id);
}
