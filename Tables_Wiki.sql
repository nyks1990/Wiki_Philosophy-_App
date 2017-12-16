CREATE TABLE `article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `short_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1899 DEFAULT CHARSET=utf8;

CREATE TABLE `visited_article` (
  `wiki_philosophy_route_id` bigint(20) NOT NULL,
  `visited_article_id` bigint(20) NOT NULL,
  `article_order_index` int(11) NOT NULL,
  PRIMARY KEY (`wiki_philosophy_route_id`,`article_order_index`),
  UNIQUE KEY `UK6acg51nsgbigooxrx96t5xy2i` (`wiki_philosophy_route_id`,`visited_article_id`),
  KEY `FKoa1f7yaaj6eeorgghw21wjgvf` (`visited_article_id`),
  CONSTRAINT `FKdseuy4fn1r12smkmiq5x703nn` FOREIGN KEY (`wiki_philosophy_route_id`) REFERENCES `wiki_philosophy_router` (`id`),
  CONSTRAINT `FKoa1f7yaaj6eeorgghw21wjgvf` FOREIGN KEY (`visited_article_id`) REFERENCES `article` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `wiki_philosophy_router` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `total_hops` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
