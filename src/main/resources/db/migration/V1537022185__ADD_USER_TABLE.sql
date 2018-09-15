CREATE TABLE app_user (
  id                      BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
  created_local_date_time TIMESTAMP    NOT NULL,
  updated_local_date_time TIMESTAMP    NOT NULL,
  user_name               VARCHAR(255) NOT NULL,
  first_name              VARCHAR(255) NOT NULL,
  last_name               VARCHAR(255),
  email                   VARCHAR(255) NOT NULL,
  password                VARCHAR(255) NOT NULL,
  UNIQUE (user_name)
);

CREATE TABLE user_roles (
  user_id BIGINT,
  roles   VARCHAR(255),
  FOREIGN KEY (user_id) REFERENCES app_user (id)
);