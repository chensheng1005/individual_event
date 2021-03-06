use ClotheStore;

insert into `user`(user_account_number,user_nickname,user_photo,user_password,user_name,user_id_card,user_phone,user_state) values
('ysy','颠三倒四','cs.jpg','123456','陈胜','46262219981005085X','18307768657',0),
('chen','多年以后','cs.jpg','123456','陈胜','46262219981005085X','13005768719',0);
select user_id,user_account_number,user_photo,user_nickname,user_password,user_name,user_id_card,user_phone,user_state from `user`;


insert into admin(admin_account_number,admin_nickname,admin_password) values('admin','店长','123456');
select admin_id,admin_account_number,admin_nickname,admin_password from admin;


insert into clothes_brand(brand_name) values
('安踏'),
('鸿星尔克'),
('七匹狼'),
('乔丹'),
('耐克'),
('特步'),
('阿迪达斯'),
('361°'),
('匹克'),
('南极人'),
('Moncler'),
('花花公子'),
('其他');
select brand_id,brand_name from clothes_brand;



insert into clothes_tag(tag_name,kind_id) values
('外套',1),
('夹克',1),
('卫衣',1),
('T恤',1),
('休闲裤',1),
('牛仔裤',1),
('风衣',1),
('西装',1),
('马甲',1),
('衬衫',1),
('运动裤',1),
('运动套装',1),
('羽绒服',1),
('九分裤	',1),
('毛衣',1),
('棒球服',1),

('连衣裙',2),
('羽绒服',2),
('衬衫',2),
('运动裤',2),
('运动套装',2),
('西装',2),
('牛仔裤',2),
('外套',2),
('毛衣',2),
('休闲裤',2),
('短外套',2),
('半身裙',2),
('长袖连衣裙',2),
('阔腿裤',2),
('时尚套装',2),
('卫衣',2),
('短裙',2),
('小脚裤',2),
('连体裤',2),
('背带裤',2),
('T恤',2);

select tag_id,tag_name,kind_id from clothes_tag;


#男服装
insert into clothes(clothes_describe,clothes_price,clothes_img,brand_id,tag_id) values
('南极人冬季男士羽绒服男加厚中长款爸爸装外套中年中老年人40岁50',498.00,'1.1.jpg',10,1),
('男士外套春秋装2018新款韩版潮流修身帅气休闲加绒加厚冬季夹克男',99.00,'2.1.jpg',10,1),
('南极人棉衣男冬季中年爸爸装中老年外套加绒加厚棉袄男士羽绒棉服',158.00,'3.1.jpg',10,1),
('折扣！正品Moncler羽绒服男 MAYA连帽修身经典短款外套陈奕迅同款',3500.00,'4.1.jpg',11,1),
('正品Moncler羽绒服男18新款经典蒙口maya黑色连帽外套陈奕迅同款',2500.00,'5.1.jpg',11,1),
('海龟与红翼 Moncler ACORUS蒙口薄款秋冬立领外套男羽绒服',3680.00,'6.1.jpg',11,1),


('花花公子夹克男秋冬季2018新款中年羊绒立领爸爸羊毛呢子男装外套',400.00,'7.1.jpg',12,2),
('花花公子男士外套春秋2018新款韩版潮流修身帅气秋季休闲夹克',108.00,'8.1.jpg',12,2),
('花花公子男士外套男2018春秋季青年薄款透气休闲连帽夹克韩版修身',138.00,'9.1.jpg',12,2),
('花花公子冬季加绒加厚外套男士皮衣立领修身机车皮夹克男韩版潮流',239.00,'10.1.jpg',12,2),


('卫衣男士休闲三件套装韩版潮流加绒运动连帽衣服秋冬季金丝绒外套',278.00,'11.1.jpg',13,3),
('男士卫衣套装加绒款连帽冬季潮流中学生衣服休闲上衣运动外套秋季',227.00,'12.1.jpg',13,3),


('香港IT代购潮牌男装星座卫衣男太空印花长袖大码圆领情侣T恤外套',338.00,'13.1.jpg',13,4),
('秋冬加绒纯色男士半高领T恤修身长袖男紧身高领T恤百搭弹力打底衫',68.00,'14.1.jpg',13,4),
('男士高领打底衫冬季纯棉卫衣保暖内衣长袖t恤上衣服加绒加厚秋衣',99.00,'15.1.jpg',13,4),


('南极人加绒牛仔裤加厚保暖秋冬款弹力休闲宽松直筒裤子男士冬季',128.00,'16.1.jpg',10,5),
('花花公子秋季男士牛仔裤男宽松直筒弹力商务休闲裤子中年冬装加绒',158.00,'17.1.jpg',12,5),
('Adidas阿迪达斯长裤男加绒运动裤秋冬季休闲束脚裤潮收口小脚裤子',198.00,'18.1.jpg',7,5),


('七匹狼牛仔裤男 2018秋装新款男士休闲韩版潮流修身男装裤子 3904',219.00,'19.1.jpg',3,6),
('大码牛仔裤男加肥加大秋季宽松直筒 胖子肥佬超大号烟灰色200斤潮',108.00,'20.1.jpg',3,6),
('秋季牛仔裤男宽松直筒男裤青年男士商务休闲长裤复古大码裤子男潮',219.00,'21.1.jpg',3,6),


('南极人毛呢大衣男羊毛绒中长款冬季加厚呢子外套韩版修身男士风衣',369.00,'22.1.jpg',10,7),
('冬季海宁真皮皮衣男哑光头层牛皮中长款风衣蚕丝内胆加厚带帽外套',1980.00,'23.1.jpg',13,7),
('秋季毛呢大衣男士中长款韩版风衣青年休闲盘扣唐装立领汉服外套男',258.00,'24.1.jpg',13,7),


('罗蒙西服男套装休闲西装男新郎服装结婚礼服伴郎服装男士正装西装',1099.00,'25.1.jpg',13,8),
('西装男套装修身韩版英伦风秋冬新款职业正装结婚新郎男士西服休闲',359.00,'26.1.jpg',13,8),
('花花公子男士西服上衣休闲单西羊毛呢子便西外套韩版修身小西装男',399.00,'27.1.jpg',12,8),


('炉品秋冬潮款加厚迷彩工装马甲男美式潮牌保暖棉马甲双面穿外套男',198.00,'28.1.jpg',13,9),
('冬季新款休闲背心马甲男士加肥大码胖子宽松无袖外套韩版潮流男装',96.00,'29.1.jpg',13,9),
('BJHG冬加厚工装棉马甲潮牌男日系宽松纯色魔术贴开叉保暖无袖外套',238.00,'30.1.jpg',13,9),


('冬季白色加绒衬衫男长袖修身保暖打底休闲加厚男士纯棉青年衬衣潮',108.00,'31.1.jpg',13,10),
('2018秋冬加绒加厚格子衬衫男韩版潮流青年宽松休闲长袖衬衣外套男',148.00,'32.1.jpg',13,10),
('正品潮牌MADNESS MDNS字母长袖休闲衬衫男余文乐同款纯色百搭衬衣',296.00,'33.1.jpg',13,10),


('安踏男子针织运动长裤',149.00,'34.1.jpg',1,11),
('秋冬季男士运动裤潮流加绒束脚裤休闲裤宽松哈伦裤小脚裤收口卫裤',98.00,'35.1.jpg',13,11),
('花花公子冬季羊羔绒加厚休闲裤男士加绒运动宽松卫裤长裤保暖裤子',139.00,'36.1.jpg',12,11),


('安踏男装2018冬季新款运动套装男休闲开衫跑步男士运动服套装正品',259.00,'37.1.jpg',1,12),
('安踏运动套装男长袖长裤2018秋冬季新款跑步休闲健身外套运动服男',329.00,'38.1.jpg',1,12),
('安踏运动套装男春秋2018新款篮球运动服卫衣两件套长袖休闲跑步服',199.00,'39.1.jpg',1,12),


('南极人中长款羽绒服2018新款韩版加厚保暖青年连帽休闲大码加长潮',598.00,'40.1.jpg',10,13),
('冬季羽绒服男士加厚中长款韩版修身帅气2018冬装潮流保暖大码外套',439.00,'41.1.jpg',13,13),
('羽绒服男中长款冬季新款韩版潮流帅气2018轻薄款加厚男装冬装外套',398.00,'42.1.jpg',13,13),


('九分裤男士休闲裤男弹力韩版修身小脚裤加厚加绒秋季9分潮流裤子',158.00,'43.1.jpg',13,14),
('九分裤男士休闲裤男弹力韩版修身小脚裤加厚加绒秋季9分潮流裤子',139.00,'44.1.jpg',13,14),
('秋冬款男士九分破洞牛仔裤韩版潮流修身小脚宽松休闲加绒裤裤子男',99.00,'45.1.jpg',13,14),


('南极人高领毛衣男加绒2018新款冬季针织衫男士修身韩版线衣打底衫',89.00,'46.1.jpg',10,15),
('花花公子羊毛衫男圆领加厚套头毛衣男装青年韩版修身保暖线衣冬季',198.00,'47.1.jpg',12,15),
('花花公子毛衣男秋冬季韩版潮流打底衫修身男士针织衫加厚加绒衣服',139.00,'48.1.jpg',12,15),


('花花公子春秋季卫衣男连帽韩版潮流男装2018新款男士外套男上衣服',149.00,'49.1.jpg',12,16),
('男士2018春秋季新款外套韩版潮流休闲夹克大码帅气加绒学生冬厚装',128.00,'50.1.jpg',13,16),
('外套男士夹克牛仔褂子秋冬工装棒球服韩版潮流修身帅气休闲上衣服',158.00,'51.1.jpg',13,16);

select * from clothes;


insert into clothes_photo(photo_name,photo_url) values
('黑色','1.1.jpg'),
('军绿色','1.2.jpg'),
('灰色','1.3.jpg'),
('棕色','1.4.jpg'),

('黑色','2.1.jpg'),
('白色','2.2.jpg'),
('深蓝色','2.3.jpg'),
('灰色','2.4.jpg'),
('军绿色','2.5.jpg'),

('黑色','3.1.jpg'),
('军绿色','3.2.jpg'),
('深蓝色','3.3.jpg');

insert into clothes_size(size_name) values('XS'),('S'),('M'),('L'),('XL'),('XXL'),('XXXL');

insert into clothes_photo_size_relation(relation_clothes_id,relation_photo_id,realtion_size_id,clothes_count) values
(1,1,3,20),
(1,1,4,20),
(1,1,5,20),
(1,1,6,20),
(1,1,7,20),

(1,2,3,20),
(1,2,4,20),
(1,2,5,20),
(1,2,6,20),
(1,2,7,20),


(1,3,3,20),
(1,3,4,20),
(1,3,5,20),
(1,3,6,20),
(1,3,7,20),

(1,4,3,20),
(1,4,4,20),
(1,4,5,20),
(1,4,6,20),
(1,4,7,20);

