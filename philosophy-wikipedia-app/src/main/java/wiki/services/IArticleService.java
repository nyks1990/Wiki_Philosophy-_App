package wiki.services;

import wiki.models.Article;
import wiki.services.common.IGenericRawService;

public interface IArticleService extends IGenericRawService<Article, Long> {
	Article saveOrUpdate(Article article);
}
