package wiki.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wiki.models.Article;
import wiki.models.OrderMode;
import wiki.repository.IArticleRepository;
import wiki.repository.common.ICrudRepository;
import wiki.services.IArticleService;
import wiki.services.common.impl.AbstractRawService;

@Service
public class ArticleService extends AbstractRawService<Article, Long> implements IArticleService {

	@Autowired
	IArticleRepository repository;

	@Override
	protected ICrudRepository<Article, Long> getRepository() {
		return repository;
	}

	@Override
	public Article saveOrUpdate(final Article article) {
		final Article _article = findByProperty(Article.url, article.getUrl());
		if (_article == null) {
			return save(article);
		} else {
			article.setId(_article.getId());
			return update(article);
		}
	}

	@Override
	public <Y extends Comparable<? super Y>> List<Article> findAll(Date updatedAt, OrderMode orderMode) {
		// TODO Auto-generated method stub
		return null;
	}

}
