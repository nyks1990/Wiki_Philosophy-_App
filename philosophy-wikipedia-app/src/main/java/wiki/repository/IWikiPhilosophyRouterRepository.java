package wiki.repository;

import wiki.models.Article;
import wiki.models.WikiPhilosophyRouter;
import wiki.repository.common.ICrudRepository;

public interface IWikiPhilosophyRouterRepository extends ICrudRepository<WikiPhilosophyRouter, Long> {
	WikiPhilosophyRouter findOne(Article src, Article destn);
}
