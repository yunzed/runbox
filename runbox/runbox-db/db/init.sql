CREATE DATABASE `runbox` DEFAULT CHARACTER SET utf8mb4;

use runbox;

CREATE TABLE `project` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'project id',
  `owner` bigint(20),
  `name` varchar(256) NOT NULL,
  `desc` text(65536),
  `tenant` int COMMENT '数据源',
  `status` int NOT NULL DEFAULT '1' COMMENT '项目状态',
  `cts` datetime DEFAULT NULL,
  `uts` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8;

CREATE TABLE `task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'task id',
  `owner` bigint(20),
  `project` bigint(20),
  `parent` bigint(20),
  `name` varchar(256) NOT NULL,
  `desc` text(65536),
  `status` int NOT NULL DEFAULT '1' COMMENT '项目状态',
  `cts` datetime DEFAULT NULL,
  `uts` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8;

CREATE TABLE `milestone` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'task id',
  `owner` bigint(20),
  `name` varchar(256) NOT NULL,
  `desc` text(65536),
  `status` int NOT NULL DEFAULT '1' COMMENT '项目状态',
  `sts` bigint(20),
  `ets` bigint(20),
  `cts` datetime DEFAULT NULL,
  `uts` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8;

CREATE TABLE `project_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'project user id',
  `uid` bigint(20),
  `project` bigint(20),
  `cts` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8;



