drop database if exists UserDB;
Create database UserDB;
use UserDB;
/*create table slider*/
create table slider(
slider_id int(10) PRIMARY KEY AUTO_INCREMENT
);
/*create table user*/
create table `user`(
user_id int(10) PRIMARY KEY AUTO_INCREMENT,
full_name varchar(50),
email varchar(50),
mobile varchar(11),
`password` varchar(20),
`status` varchar(50)
);

/*create table role*/
create table role(
role_id int(10) PRIMARY KEY AUTO_INCREMENT,
`name` varchar(50),
`desc` varchar(50)
);

/*create table user_role*/
create table user_role(
user_id int(10) NOT NULL,
role_id int(10) NOT NULL,
`status` varchar(50),
created_at datetime default now(),
updated_at datetime,
PRIMARY KEY(user_id, role_id)
);

/*create table menu */
create table menu(
menu_id int(10) AUTO_INCREMENT PRIMARY KEY,
`name` varchar(50),
`desc` varchar(50),
controller varchar(50),
`function` varchar(50)
);

/*create table role_menu*/
create table role_menu(
role_id int(10) AUTO_INCREMENT,
menu_id int(10),
`status` varchar(50),
primary key(role_id,menu_id)
);

/*create table permission*/
create table permission(
permission_id int(10) AUTO_INCREMENT PRIMARY KEY,
`name` varchar(50),
`desc` varchar(50),
`controller` varchar(50),
`function` varchar(50)
);

/*create table role_permission*/
create table role_permission(
permission_id int(10),
role_id int(10),
`status` varchar(50),
PRIMARY KEY (permission_id,role_id)
);

/*create table news*/
create table news(
news_id int(10) AUTO_INCREMENT PRIMARY KEY,
url varchar(100),
title varchar(50),
`desc` varchar(50),
content varchar(50),
`status` varchar(50),
is_hot boolean default 0,
user_id int(10),
approver_id int(10) null,
created_at datetime default now(),
updated_at datetime,
approved_at datetime
);

alter table user_role add constraint FK_userID_user foreign key(user_id) references `user`(user_id);
alter table user_role add constraint FK_roleID_userRole foreign key(role_id) references `role`(role_id);
alter table role_permission add constraint FK_permissionID foreign key(permission_id) references `permission`(permission_id);
alter table role_permission add constraint FK_roleID_rolePermission foreign key(role_id) references `role`(role_id);
alter table role_menu add constraint FK_roleID_roleMenu foreign key(role_id) references `role`(role_id);
alter table role_menu add constraint FK_menuID foreign key(menu_id) references `menu`(menu_id);
alter table news add constraint FK_userID_news foreign key(user_id) references `user`(user_id);
alter table news add constraint FK_approverID foreign key(approver_id) references `user`(user_id);

insert into user(full_name,email,mobile,`password`,`status`) values ("Nguyen Thi My Duyen","ntmduyen@cmc.com.vn","0906523717","123456",NULL);
insert into user(full_name,email,mobile,`password`,`status`) values ("Pham Thi Phuong","ptphuong@cmc.com.vn","0902428283","123456",NULL);
insert into user(full_name,email,mobile,`password`,`status`) values ("Vu Van Dong","vvdong@cmc.com.vn","0900723777","123456",NULL);
insert into user(full_name,email,mobile,`password`,`status`) values ("Nguyen Duc Van","ndvan@cmc.com.vn","0955556517","123456",NULL);
insert into user(full_name,email,mobile,`password`,`status`) values ("Giam Doc Hai","gdhai@cmc.com.vn","0906523888","123456",NULL);
insert into user(full_name,email,mobile,`password`,`status`) values ("Nguyen Hung","nhung@cmc.com.vn","095553717","123456",NULL);
insert into user(full_name,email,mobile,`password`,`status`) values ("Vuong Sy Son","vsson@cmc.com.vn","0886523337","123456",NULL);

insert into role(`name`,`desc`) values ("Admin",NULL);
insert into role(`name`,`desc`) values ("Normal User",NULL);
insert into role(`name`,`desc`) values ("VIP User",NULL);
insert into role(`name`,`desc`) values ("Guest",NULL);
