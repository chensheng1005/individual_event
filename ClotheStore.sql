drop database if exists ClotheStore;
create database ClotheStore;
use ClotheStore;

drop table if exists `user`;
#用户
create table `user`
(
	user_id int primary key auto_increment comment '用户编号',
	user_account_number varchar(20) not null comment '用户账号',
	user_nickname varchar(20) comment '用户昵称',
	user_photo varchar(50) comment '用户头像',
	user_password varchar(16) not null comment '用户密码',
	user_name varchar(20) not null comment '用户姓名',
	user_id_card varchar(18) not null comment '用户身份证',
	user_phone varchar(11) not null comment '用户联系电话',
	user_state int comment '用户状态'
)default charset = utf8;


drop table if exists admin;
#管理员
create table admin
(
	admin_id int primary key auto_increment comment '管理员编号',
	admin_account_number varchar(20) not null comment '管理员账号',
	admin_nickname varchar(20) comment '管理员昵称',
	admin_password varchar(16) not null comment '管理员密码'
)default charset = utf8;


drop table if exists clothes_brand;
#服装的品牌
create table clothes_brand
(
	brand_id int primary key auto_increment comment '品牌编号',
	brand_name varchar(20) comment '品牌名称'	
)default charset = utf8;


drop table if exists clothes_kind;
#服装的性别分类
create table clothes_kind
(
	kind_id int primary key auto_increment comment '类型编号',
	kind_name varchar(20) comment '类型名称'
)default charset = utf8;

insert into clothes_kind(kind_name) values('男装'),('女装');
select kind_id,kind_name from clothes_kind;

drop table if exists clothes_tag;
#服装的标签
create table clothes_tag
(
	tag_id int primary key auto_increment comment '标签编号',
	tag_name varchar(20) comment '标签名称',
	kind_id int comment '服装类型',
	foreign key(kind_id) references clothes_kind(kind_id)
)default charset = utf8;



drop table if exists clothes;
#服装的详细信息
create table clothes
(
	clothes_id int primary key auto_increment comment '服装编号',
	clothes_describe varchar(255) comment '服装描述',
	clothes_price decimal(10,2) comment '衣服价格',
	clothes_img varchar(255) comment '服装图片',
	brand_id int comment '服装品牌',
	tag_id int comment '服装标签',
	foreign key(brand_id) references clothes_brand(brand_id),
	foreign key(tag_id) references clothes_tag(tag_id)
)default charset = utf8;


drop table if exists clothes_photo;
#服装的颜色和对应图片
create table clothes_photo
(
	photo_id int primary key auto_increment comment '照片编号',
	photo_name varchar(50) comment '颜色',
	photo_url varchar(255) comment '图片路径'
)default charset = utf8;


drop table if exists clothes_size;
create table clothes_size
(
	size_id int primary key auto_increment comment '尺寸编号',
	size_name varchar(20) comment '尺寸名称'
)default charset = utf8;

drop table if exists clothes_photo_size_relation;
create table clothes_photo_size_relation
(
	relation_id int primary key auto_increment comment '关系编号',
	relation_clothes_id int not null comment '服装编号',
	relation_photo_id int not null comment '照片颜色编号',
	realtion_size_id int not null comment '尺寸编号',
	clothes_count int default 0 comment '库存'
)default charset = utf8;


select clothes_id,clothes_describe,clothes_price,brand_name,tag_name,COALESCE(sum(clothes_count),0) clothes_count,clothes_img from clothes c 
inner join clothes_brand b
on c.brand_id = b.brand_id
inner join clothes_tag g
on c.tag_id = g.tag_id
left join clothes_photo_size_relation s
on c.clothes_id = s.relation_clothes_id group by c.clothes_id;

select * from clothes l
inner join clothes_photo_size_relation r
on l.clothes_id = r.relation_clothes_id
inner join clothes_photo c
on c.photo_id = relation_photo_id
inner join clothes_size s
on s.size_id = r.realtion_size_id 
inner join clothes_brand b
on b.brand_id = l.brand_id
where l.clothes_id = 1;

drop table if exists evaluation;
create table evaluation
(
	evaluation_id int primary key auto_increment comment '评论编号',
	evaluation_good_poor varchar(4) comment '好差评'
)default charset = utf8;



drop table if exists recipient;
create table recipient
(
	recipient_id int primary key auto_increment comment '收件编号',
	recipient_user_account_number varchar(20) comment '用户账号',
	recipient_person varchar(20) comment '收件人',
	recipient_address varchar(50) comment '收货地址',
	recipient_person_phone varchar(11) comment '收件人电话'
)default charset = utf8;

drop table if exists `order`;
create table `order`
(
	order_id varchar(20) primary key comment '订单编号',
	order_time datetime comment '生成订单时间',
	order_address_id int comment '订单收件详细编号',
	order_state int comment '订单状态',
	evaluation_id int comment '订单评价',
	foreign key(order_address_id) references recipient(recipient_id),
	foreign key(evaluation_id) references evaluation(evaluation_id)
)default charset =utf8;

drop table if exists shop_cart;
create table shop_cart
(
	shop_id int primary key auto_increment comment '购物车编号',
	relation_id int comment '服装关系编号',
	shop_user_account_number varchar(20) comment '用户账号',
	shop_order int comment '订单编号',
	shop_state int comment '购物商品状态',
	foreign key(relation_id) references clothes_photo_size_relation(relation_id)
)default charset = utf8;

