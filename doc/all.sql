

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
