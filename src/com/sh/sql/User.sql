
/*--查询表中数据--*/
select * from t_user;

/*--用户表--*/

insert into t_user values(1,'admin','111','0',20,'河北省','15610293578','Peter@qq.com');
insert into t_user values(2,'Kim','111','1',20,'河北省','15612293578','Kim@qq.com');
insert into t_user values(3,'Tom','111','0',20,'河北省','15613293578','Tom@qq.com');
insert into t_user values(4,'Alen','111','0',20,'河北省','15616293578','Alen@qq.com');
insert into t_user values(5,'Susan','111','1',20,'河北省','15617293578','Susan@qq.com');

--提交
commit;

/*--序列--*/

drop sequence Useridsequence;

create sequence userIdSequence 
start with 10 
nocache;
