
/*--查询表中数据--*/
select * from chat;
select * from chatPicture;

/*--帖子表--*/
insert into chat values(1,2,'蒜蓉粉丝蒸虾、玉米红萝卜煎薯饼、银耳红枣枸杞羹～好好吃');
insert into chat values(2,2,'刚刚烤的肉松卷、味道不错哦。我们要像花儿一样，无论身在何处，不管周遭环境如何，都依然潇洒的绽放自己的美丽，活出自己的精彩。');
insert into chat values(3,2,'一款大米，红薯淀粉和糯米做的中式小点心。清蒸的做法，好吃不油腻。趁热淋入糖桂花，好吃。');
insert into chat values(4,3,'蒸蛋中添加适量食材，简单的做法，营养却更丰富。早安。');
insert into chat values(5,3,'开放三明治+坚果燕麦酸奶。相对于技巧，倾注的心意才最值得回味，早安！');
insert into chat values(6,3,'我们都知道生活里，有时也会有不如意的地方。希望我们，即使阴天，内心也装满阳光。纵使生活再难，也不害怕。不管在怎样的处境里，都热爱生活。努力过得更开心，更舒适～');






/*--帖子图片表--*/
insert into chatPicture values(1,'../img/chat/chat1_1.jpg');
insert into chatPicture values(1,'../img/chat/chat1_2.jpg');
insert into chatPicture values(1,'../img/chat/chat1_3.jpg');
insert into chatPicture values(2,'../img/chat/chat2_1.jpg');
insert into chatPicture values(2,'../img/chat/chat2_2.jpg');
insert into chatPicture values(2,'../img/chat/chat2_3.jpg');
insert into chatPicture values(3,'../img/chat/chat3_1.jpg');
insert into chatPicture values(3,'../img/chat/chat3_2.jpg');
insert into chatPicture values(3,'../img/chat/chat3_3.jpg');
insert into chatPicture values(4,'../img/chat/chat4_1.jpg');
insert into chatPicture values(4,'../img/chat/chat4_2.jpg');
insert into chatPicture values(4,'../img/chat/chat4_3.jpg');
insert into chatPicture values(5,'../img/chat/chat5_1.jpg');
insert into chatPicture values(5,'../img/chat/chat5_2.jpg');
insert into chatPicture values(5,'../img/chat/chat5_3.jpg');
insert into chatPicture values(6,'../img/chat/chat6_1.jpg');
insert into chatPicture values(6,'../img/chat/chat6_2.jpg');
insert into chatPicture values(6,'../img/chat/chat6_3.jpg');
insert into chatPicture values(6,'../img/chat/chat6_4.jpg');

--提交
commit;

delete from chat where chatId=7;


---------------
insert into chat values(7,3,'昨天做的紫玫瑰馒头……也是紫甘蓝榨汁调色，面团里加了些紫甘蓝泥，颜色粉紫，美美哒');
insert into chat values(8,3,'要时时保持一种爱，学会欣赏美，唯有爱和美才是心灵的故乡。早安亲们');
insert into chat values(9,3,'这个世界上每个人都有各自生活的不易，愿每份心酸都有人心疼，愿所有人都能被温柔相待。早餐--薯饼（空气炸锅版）、蛋煎馒头片、陈皮绿豆沙');
insert into chat values(10,4,'小菜几碟，白饭几碗，人世间平凡生活中的至美…');
insert into chat values(11,4,'彩椒奶酪焗饭');

insert into chatPicture values(7,'../img/chat/chat7_1.jpg');
insert into chatPicture values(7,'../img/chat/chat7_2.jpg');
insert into chatPicture values(8,'../img/chat/chat8_1.jpg');
insert into chatPicture values(8,'../img/chat/chat8_2.jpg');
insert into chatPicture values(9,'../img/chat/chat9_1.jpg');
insert into chatPicture values(9,'../img/chat/chat9_2.jpg');
insert into chatPicture values(9,'../img/chat/chat9_3.jpg');
insert into chatPicture values(9,'../img/chat/chat9_4.jpg');
insert into chatPicture values(10,'../img/chat/chat10_1.jpg');
insert into chatPicture values(11,'../img/chat/chat11_1.jpg');
insert into chatPicture values(11,'../img/chat/chat11_2.jpg');
insert into chatPicture values(11,'../img/chat/chat11_2.jpg');
