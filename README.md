# springPractice
myself practice of spring

#mysql sql
CREATE DATABASE sampledb DEFAULT CHARACTER SET utf8;

CREATE TABLE t_user(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	user_name VARCHAR(30),
	credits INT,
	passwd VARCHAR(30),
	last_visit DATETIME,
	last_ip VARCHAR(23)
)ENGINE=INNODB


CREATE TABLE t_login_log(
	login_log_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT,
	ip VARCHAR(23),
	login_datetime DATETIME
	
)ENGINE=INNODB

INSERT INTO t_user(user_name,passwd) VALUE('admin','123456');
