
/*--查询表中的数据--*/

select * from Material;
select * from Materialcategory;

/*--食材表--*/

insert into Material values(1,'排骨',1);
insert into Material values(2,'里脊',1);
insert into Material values(3,'猪蹄',1);
insert into Material values(4,'五花肉',1);
insert into Material values(5,'牛肉',1);
insert into Material values(6,'牛排',1);
insert into Material values(7,'羊肉',1);
insert into Material values(8,'鸡肉',1);
insert into Material values(40,'鸡蛋',1);

update recipe set materialId=7 where recipeId=24;

insert into Material values(9,'鲤鱼',2);
insert into Material values(10,'鲫鱼',2);
insert into Material values(11,'带鱼',2);
insert into Material values(12,'鲈鱼',2);
insert into Material values(13,'黄花鱼',2);
insert into Material values(37,'鳕鱼',2);
insert into Material values(38,'虾',2);
insert into Material values(39,'扇贝',2);

insert into Material values(14,'白菜',3);
insert into Material values(15,'油菜',3);
insert into Material values(16,'芹菜',3);
insert into Material values(17,'莴笋',3);
insert into Material values(18,'土豆',3);
insert into Material values(19,'红薯',3);
insert into Material values(20,'萝卜',3);
insert into Material values(21,'西红柿',3);
insert into Material values(41,'木耳',3);
insert into Material values(42,'高瓜',3);

insert into Material values(22,'菠萝',4);
insert into Material values(23,'草莓',4);
insert into Material values(24,'花生',4);
insert into Material values(25,'核桃',4);
insert into Material values(26,'芝麻',4);
insert into Material values(27,'红枣',4);
insert into Material values(28,'莲子',4);

insert into Material values(29,'糯米',5);
insert into Material values(30,'小米',5);
insert into Material values(31,'玉米',5);
insert into Material values(32,'红豆',5);
insert into Material values(33,'绿豆',5);
insert into Material values(34,'黄豆',5);
insert into Material values(35,'豆腐',5);
insert into Material values(36,'粉丝',5);
insert into Material values(43,'面粉',5);

update recipe set materialId=35 where recipeId=17;
update recipe set materialId=35 where recipeId=18;
update recipe set materialId=35 where recipeId=20;

/*--食材种类表--*/

insert into MaterialCategory values(1,'禽肉类');
insert into MaterialCategory values(2,'水产品类');
insert into MaterialCategory values(3,'蔬菜类');
insert into MaterialCategory values(4,'果品类');
insert into MaterialCategory values(5,'米面豆乳');

--提交
commit;

insert into Recipe values(27,'青辣椒炒排骨','../img/recipe/material1_1_1.jpg','青辣椒炒排骨',1,1,1,1,1,2,1);
insert into Recipe values(28,'香酥爆鱼花','../img/recipe/material2_1_1.jpg','炸好的鱼块，趁热时可以直接食用，剩余的可以回锅炖着吃。这次做时，一改以前用花椒粉，用了胡椒粉腌制，关键是秘密添加干红葡萄酒（孩子若知道恐怕不喜）。因为忙，所以腌了24小时，很入味。',1,1,1,1,1,2,9);


update recipe set materialId=40 where recipeId=7;
update recipe set materialId=41 where recipeId=8;
update recipe set materialId=34 where recipeId=9;
update recipe set materialId=42 where recipeId=10;
update recipe set materialId=29 where recipeId=11;
update recipe set materialId=43 where recipeId=12;
update recipe set materialId=14 where recipeId=13;
update recipe set materialId=35 where recipeId=14;


