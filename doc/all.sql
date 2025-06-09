

CREATE DATABASE test_new
CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;

CREATE TABLE test (
                      id BIGINT NOT NULL COMMENT 'id',
                      name VARCHAR(50) COMMENT '名称',
                      password VARCHAR(50) COMMENT '密码',
                      PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测试';


INSERT INTO test (id, name, password)
VALUES (1, 'Alice', 'password123'), (2, 'Bob', 'securepass456');


CREATE TABLE ebook (
                       id BIGINT NOT NULL COMMENT 'id',
                       name VARCHAR(50) COMMENT '名称',
                       category1_id BIGINT COMMENT '分类1',
                       category2_id BIGINT COMMENT '分类2',
                       description VARCHAR(200) COMMENT '描述',
                       cover VARCHAR(200) COMMENT '封面',
                       doc_count INT COMMENT '文档数',
                       view_count INT COMMENT '阅读数',
                       vote_count INT COMMENT '点赞数',
                       PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='电子书';

INSERT INTO ebook (id, name, description) VALUES
                                              (1, 'SpringBoot入门教程', '零基础入门Java开发，企业级应用开发最佳首选框架'),
                                              (2, 'Vue入门教程', '零基础入门Vue开发，企业级应用开发最佳选择');
insert into ebook (id, name, description) values
                                              (3, 'Python入门教程', '零基础入门Python开发，企业级应用开发最佳首选框架'),
                                              (4, 'Mysql入门教程', '零基础入门Mysql开发，企业级应用开发最佳首选框架'),
                                              (5, 'Oracle入门教程', '零基础入门Oracle开发，企业级应用开发最佳首选框架');