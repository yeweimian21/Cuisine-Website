select * from recipe;



/*--今日推荐表--*/

select * from recommendation;

insert into Recipe values(16,'排骨煮水面筋','../img/recipe/recommendation1.jpg','水面筋是一种植物性蛋白质，有麦胶蛋白质和麦谷蛋白质组成。水面筋的结构类似肌纤维，经适当处理后，可用以制成素鸡、素鹅等素仿荤菜式。水面筋这一食材通过合理的调配可以制成多种美食，可以说是一种绿色健康食品。面筋塞肉在苏州一带十分盛行，一到夏天基本上家家喜欢吃，面筋的气孔里包裹着很多汤汁，一口咬下去全是汁哦，而且味道特鲜，面筋又很有嚼劲，沉淀好的面浆可以制作凉皮，真是一举两得，也不浪费食材。',1,1,1,2,1,2,9);
insert into Recipe values(17,'灌汤豆腐','../img/recipe/recommendation2.jpg','灌汤豆腐',1,1,1,2,1,2,9);
insert into Recipe values(18,'金汤豆腐','../img/recipe/recommendation3.jpg','端午节到了，各单位都会发一些咸鸭蛋，枇杷，粽子等等。端午要吃咸鸭蛋，是苏州习俗。我总觉得咸鸭蛋太咸，所以花了点心思，做了这款金汤豆腐。蛋黄煮成浓汤，放入嫩豆腐一起炖煮，豆腐吸收蛋黄的咸香鲜，加上蛋黄汤略有沙沙口感，别有一番风味。',1,1,1,2,1,2,9);


insert into recommendation values(1,16);
insert into recommendation values(2,17);
insert into recommendation values(3,18);

/*--最新上线--*/

select * from latest;

insert into Recipe values(19,'五花肉金针菇卷','../img/recipe/latest1.jpg','撸串的季节当然少不了这道五花肉金针菇卷，有的烤肉店也用培根来卷，无论哪种金针菇卷我都是很喜欢吃的。今天咱们就在家自制这道健康美味的金针菇卷，腌制过的五花肉和金针菇卷起来，表面又刷了蒜蓉辣椒酱、撒了黑胡椒粉，是不是想想都流口水了，那就赶紧行动起来吧。',1,1,1,2,1,2,9);
insert into Recipe values(24,'孜然羊肉卷','../img/recipe/latest2.jpg','最爱烤串，在家自制烤肉串，即卫生又实在美味。',1,1,1,2,1,2,9);




insert into latest values(1,19);
insert into latest values(2,24);

/*--最热菜谱--*/

select * from hottest;



insert into Recipe values(20,'椒盐豆腐','../img/recipe/hottest1.jpg','豆腐是一种以黄豆为主要原料的食物，有高蛋白，低脂肪，降血压，降血脂，降胆固醇的功效，因此深受人们的喜爱。',1,1,1,2,1,2,9);
insert into Recipe values(21,'酱汁烤鸡翅','../img/recipe/hottest2.jpg','自配的酱汁加入了番茄酱很浓郁，肉汁非常鲜嫩。这个酱汁用来蘸其它肉类味道也很棒。',1,1,1,2,1,2,9);
insert into Recipe values(22,'青椒爆猪皮','../img/recipe/hottest3.jpg','青椒爆猪皮',1,1,1,2,1,2,9);
insert into Recipe values(23,'酿丝瓜','../img/recipe/hottest4.jpg','撸串的季节当然少不了这道五花肉金针菇卷，有的烤肉店也用培根来卷，无论哪种金针菇卷我都是很喜欢吃的。',1,1,1,2,1,2,9);
insert into Recipe values(25,'干煸四季豆','../img/recipe/hottest5.jpg','干煸四季豆',1,1,1,2,1,2,9);
insert into Recipe values(26,'港式叉烧','../img/recipe/hottest6.jpg','喜欢吃叉烧，加入了南乳汁调色，味道和口感都非常不错。梅头肉是去骨后的肩胛肉，肉质细腻，有间隙肥肉，最适合做叉烧了',1,1,1,2,1,2,9);




insert into hottest values(1,20);
insert into hottest values(2,21);
insert into hottest values(3,22);
insert into hottest values(4,23);
insert into hottest values(5,25);
insert into hottest values(6,26);



commit;
