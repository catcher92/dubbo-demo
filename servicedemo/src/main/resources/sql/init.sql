DROP TABLE IF EXISTS `biz_dept`;
CREATE TABLE `biz_dept` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `delete_status` tinyint(1) unsigned DEFAULT '0' COMMENT '删除状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

DROP TABLE IF EXISTS `biz_resource`;
CREATE TABLE `biz_resource` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '资源名',
  `delete_status` tinyint(1) unsigned DEFAULT '0' COMMENT '删除状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表';

DROP TABLE IF EXISTS `biz_role`;
CREATE TABLE `biz_role` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `delete_status` tinyint(1) unsigned DEFAULT '0' COMMENT '删除状态 0未删除，1已删除',
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

DROP TABLE IF EXISTS `biz_role_resource_link`;
CREATE TABLE `biz_role_resource_link` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` int(11) unsigned NOT NULL COMMENT '角色id',
  `resource_id` bigint(20) unsigned NOT NULL COMMENT '资源id',
  `delete_status` tinyint(1) unsigned DEFAULT '0' COMMENT '删除状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色资源关联表';

DROP TABLE IF EXISTS `biz_user`;
CREATE TABLE `biz_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `lock_status` tinyint(1) unsigned DEFAULT '0' COMMENT '锁定状态 0未锁定，1已锁定',
  `delete_status` tinyint(1) unsigned DEFAULT '0' COMMENT '删除状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

DROP TABLE IF EXISTS `biz_user_dept_role_link`;
CREATE TABLE `biz_user_dept_role_link` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `dept_id` int(11) DEFAULT NULL COMMENT '部门id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `is_parttime` tinyint(1) unsigned DEFAULT NULL COMMENT '是否兼职 0主职，1兼职',
  `delete_status` tinyint(1) unsigned DEFAULT '0' COMMENT '删除状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户部门角色关联表';
SET FOREIGN_KEY_CHECKS=1;