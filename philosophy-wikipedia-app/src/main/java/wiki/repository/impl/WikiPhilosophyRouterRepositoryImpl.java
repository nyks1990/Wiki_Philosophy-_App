package wiki.repository.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import wiki.models.Article;
import wiki.models.OrderMode;
import wiki.models.WikiPhilosophyRouter;
import wiki.repository.IWikiPhilosophyRouterRepository;
import wiki.repository.common.impl.AbstractRawRepository;

@Repository
public class WikiPhilosophyRouterRepositoryImpl extends AbstractRawRepository<WikiPhilosophyRouter, Long>
		implements IWikiPhilosophyRouterRepository {

	@Override
	protected Class<WikiPhilosophyRouter> getPersistentClass() {
		return WikiPhilosophyRouter.class;
	}

	@Override
	public WikiPhilosophyRouter findOne(final Article src, final Article destn) {
		final CriteriaBuilder builder = em.getCriteriaBuilder();
		final CriteriaQuery<WikiPhilosophyRouter> query = builder.createQuery(getPersistentClass());

		final Root<WikiPhilosophyRouter> root = query.from(getPersistentClass());
		query.select(root);

		// query.where(builder.equal(WikiPhilosophyRouter.sourceArticle, src),
		// builder.equal(WikiPhilosophyRouter.destinationArticle, destn));

		final List<WikiPhilosophyRouter> resultList = em.createQuery(query).setMaxResults(1).getResultList();

		return resultList.size() > 0 ? resultList.get(0) : null;
	}

	@Override
	public <Y extends Comparable<? super Y>> WikiPhilosophyRouter findByProperty(String url, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <Y extends Comparable<? super Y>> List<WikiPhilosophyRouter> findAll(Date updatedAt, OrderMode orderMode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WikiPhilosophyRouter> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
