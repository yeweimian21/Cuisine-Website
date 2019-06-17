/*--查询表中数据--*/

select * from t_Category;

select * from CostTime;

select * from Craft;

select * from Cuisine;

select * from Difficulty;

select * from Taste;

/*--口味表--*/

insert into Taste values(1,'微辣');
insert into Taste values(2,'麻辣');
insert into Taste values(3,'酸辣');
insert into Taste values(4,'酸甜');
insert into Taste values(5,'酸咸');
insert into Taste values(6,'甜味');
insert into Taste values(7,'清淡');
insert into Taste values(8,'五香');

/*--工艺表--*/

insert into Craft values(1,'烧');
insert into Craft values(2,'炒');
insert into Craft values(3,'爆');
insert into Craft values(4,'焖');
insert into Craft values(5,'炖');
insert into Craft values(6,'蒸');

update recipe set craftId=2 where recipeId=13;
update recipe set craftId=2 where recipeId=7;

/*--耗时表--*/

insert into CostTime values(1,'10分钟');
insert into CostTime values(2,'20分钟');
insert into CostTime values(3,'30分钟');
insert into CostTime values(4,'45分钟');
insert into CostTime values(5,'1小时');
insert into CostTime values(6,'数小时');

/*--难度表--*/

insert into Difficulty values(1,'简单');
insert into Difficulty values(2,'普通');
insert into Difficulty values(3,'高级');
insert into Difficulty values(4,'神级');

/*--菜谱类别表--*/

insert into t_Category values(1,'热菜');
insert into t_Category values(2,'凉菜');
insert into t_Category values(3,'主食');
insert into t_Category values(4,'小吃');
insert into t_Category values(5,'汤羹');
insert into t_Category values(6,'饮品');

update recipe set categoryId=2 where recipeId=8;
update recipe set categoryId=3 where recipeId=9;

/*--菜系表--*/

insert into Cuisine values(1,'川菜');
insert into Cuisine values(2,'鲁菜');
insert into Cuisine values(3,'闽菜');
insert into Cuisine values(4,'粤菜');
insert into Cuisine values(5,'湘菜');

--提交
commit;

