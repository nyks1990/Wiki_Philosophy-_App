package wiki.services;

import wiki.models.WikiPhilosophyRouter;
import wiki.services.common.IGenericRawService;

public interface IWikiPhilosophyRouterService extends IGenericRawService<WikiPhilosophyRouter, Long> {
	WikiPhilosophyRouter saveOrUpdate(final WikiPhilosophyRouter entity);
}
