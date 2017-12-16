package wiki.repository.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import wiki.models.Article;
import wiki.models.OrderMode;
import wiki.repository.IArticleRepository;
import wiki.repository.common.impl.AbstractRawRepository;

@Repository
public class ArticleRepositoryImpl extends AbstractRawRepository<Article, Long> implements IArticleRepository {

	@Override
	protected Class<Article> getPersistentClass() {
		return Article.class;
	}

	@Override
	public <Y extends Comparable<? super Y>> Article findByProperty(String url, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <Y extends Comparable<? super Y>> List<Article> findAll(Date updatedAt, OrderMode orderMode) {
		// TODO Auto-generated method stub
		return null;
	}

}
