-- 部门表
DROP TABLE IF EXISTS `biz_dept`;
CREATE TABLE `biz_dept` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `delete_status` tinyint(1) unsigned DEFAULT NULL COMMENT '锁定状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

-- 用户表
DROP TABLE IF EXISTS `biz_user`;
CREATE TABLE `biz_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `dept_id` bigint(20) unsigned DEFAULT NULL COMMENT '部门id',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `lock_status` tinyint(1) unsigned DEFAULT '0' COMMENT '锁定状态 0未锁定，1已锁定',
  `delete_status` tinyint(1) unsigned DEFAULT NULL COMMENT '锁定状态 0未删除，1已删除',
  `create_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(50) NOT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';