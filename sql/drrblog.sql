DROP DATABASE IF EXISTS `drrblog`;
CREATE DATABASE `drrblog`;
USE drrblog;


DROP TABLE IF EXISTS `drrblog_doc`;
CREATE TABLE `drrblog_doc`
(
    `id`            bigint(20)      NOT NULL AUTO_INCREMENT     COMMENT '文章ID 主键',
    `title`         VARCHAR(255)    DEFAULT NULL                COMMENT '文章标题',
    `summary`       VARCHAR(255)    DEFAULT NULL                COMMENT '文章摘要',
    `category_id`   int(11)         DEFAULT NULL                COMMENT '文章分类ID',
    `tags`          VARCHAR(255)    DEFAULT NULL                COMMENT '文章标签',
    # 字符串形式存储tags，doc和tags的对应信息存放在TABLE drrblog_doc_tag 中
    `content`       longtext                                    COMMENT '文章正文，txt',
    `content_html`  longtext                                    COMMENT '文章正文，HTML',
    `create_time`   datetime        NOT NULL                    COMMENT '创建时间',
    `update_time`   datetime        NOT NULL                    COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `key_category_id` (category_id)
)   ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARSET = utf8          COMMENT = '文章表';

INSERT INTO `drrblog_doc`
VALUES (1,'wjwdrr','drr',1,'标签1','王佳雯大肉肉','<h2>王佳雯大肉肉<h2>',
        '2018-07-03 15:21:08', '2018-07-06 15:21:08');
INSERT INTO `drrblog_doc`
VALUES (2,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
        '2018-07-03 15:21:08', '2018-07-06 15:21:08');
# INSERT INTO `drrblog_doc`
# VALUES (3,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
#         '2018-07-03 15:21:08', '2018-07-06 15:21:08');
# INSERT INTO `drrblog_doc`
# VALUES (4,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
#         '2018-07-03 15:21:08', '2018-07-06 15:21:08');
# INSERT INTO `drrblog_doc`
# VALUES (5,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
#         '2018-07-03 15:21:08', '2018-07-06 15:21:08');
# INSERT INTO `drrblog_doc`
# VALUES (6,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
#         '2018-07-03 15:21:08', '2018-07-06 15:21:08');
# INSERT INTO `drrblog_doc`
# VALUES (7,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
#         '2018-07-03 15:21:08', '2018-07-06 15:21:08');
# INSERT INTO `drrblog_doc`
# VALUES (8,'wjwdrr2','drr2',2,'标签1,标签2','王佳雯大肉肉2','<h2>王佳雯大肉肉2<h2>',
#         '2018-07-03 15:21:08', '2018-07-06 15:21:08');

DROP TABLE IF EXISTS `drrblog_category`;
CREATE TABLE `drrblog_category`
(
    `id`            int(11)         NOT NULL AUTO_INCREMENT     COMMENT '分类ID 主键',
    `name`          varchar(64)     DEFAULT NULL                COMMENT '分类名称',
    `avatar`        varchar(255)    DEFAULT NULL                COMMENT '分类图标',
    `description`   varchar(255)    DEFAULT NULL                COMMENT '分类描述',
    `create_time`   datetime        NOT NULL                    COMMENT '创建时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`name`)
)   ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARSET = utf8          COMMENT = '文章的分类表';

INSERT INTO `drrblog_category`
VALUES (1,'分类1','','这是分类1','2019-07-06 15:21:08');
INSERT INTO `drrblog_category`
VALUES (2,'分类2','','这是分类2','2019-07-06 15:21:08');

DROP TABLE IF EXISTS `drrblog_tag`;
CREATE TABLE `drrblog_tag`
(
    `id`            int(11)         NOT NULL AUTO_INCREMENT     COMMENT '标签ID 主键',
    `name`          varchar(64)     DEFAULT NULL                COMMENT '标签名称',
    `avatar`        varchar(255)    DEFAULT NULL                COMMENT '标签图标',
    `description`   varchar(255)    DEFAULT NULL                COMMENT '标签描述',
    `create_time`   datetime        NOT NULL                    COMMENT '创建时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`name`)
)   ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARSET = utf8          COMMENT = '文章的标签表';
INSERT INTO `drrblog_tag`
VALUES (1,'标签1','','这是标签1','2019-07-06 15:21:08');
INSERT INTO `drrblog_tag`
VALUES (2,'标签2','','这是标签2','2019-07-06 15:21:08');


# doc与tag是 M:N 的关系，单独建表存储关系
DROP TABLE IF EXISTS `drrblog_doc_tag`;
CREATE TABLE `drrblog_doc_tag`
(
    `id`            bigint(20)      NOT NULL AUTO_INCREMENT     COMMENT '主键ID',
    `doc_id`        bigint(20)      NOT NULL                    COMMENT '文章ID',
    `tag_id`        int(11)         NOT NULL                    COMMENT '标签ID',
    PRIMARY KEY (`id`),
    KEY `key_tagId` (`tag_id`),
    KEY `key_docId` (`doc_id`)
)   ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARSET = utf8          COMMENT = '文章与标签的对应表';
INSERT INTO `drrblog_doc_tag`
VALUES (1,1,1);
INSERT INTO `drrblog_doc_tag`
VALUES (2,2,1);
INSERT INTO `drrblog_doc_tag`
VALUES (3,2,2);
