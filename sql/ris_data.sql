insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(1,'John','Smith','john','731 Fondren, Houston, TX','M','1', NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(2,'Franklin','Wong','franklin','638 Voss, Houston, TX','M','2',NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(3,'Alicia','Zelaya','alicia','3321 Castle, Spring, TX','F','3',NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(4,'Jennifer','Wallace','jennifer','291 Berry, Bellaire, TX','F','4', NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(5,'Ramesh','Narayan','ramesh','975 Fire Oak, Humble, TX','M','5',NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(6,'Joyce','English','joyce','5631, Rice, Houston, TX','M','6',NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(7,'Ahmad','Jabbar','ahmad','980, Dullas, Houston, TX','M','7',NULL);

insert into researcher(studentID,fname, lname, loginid, address,sex, password, dept_num)
VALUES(8,'James','Borg','james','450, Stone, Houston, TX','M','8',NULL);

insert into professor(profId,name,login,pass,profDept)
values(1234,'Sheldon Cooper','sc','spock',null);

insert into professor(profId,name,login,pass,profDept)
values(1235,'Leonard Hofstader','lh','penny',null);

insert into professor(profId,name,login,pass,profDept)
values(1236,'Chandler Bing','cb','woopah',null);

insert into professor(profId,name,login,pass,profDept)
values(1237,'Joseph Tribbiani','jt','pizza',null);

insert into professor(profId,name,login,pass,profDept)
values(1238,'Ross Geller','rg','unagi',null);

insert into department(dname,dnum,hodId)
VALUES('Physics',1,null);

insert into department(dname,dnum,hodId)
VALUES('Chemistry',2,null);

insert into department(dname,dnum,hodId)
VALUES('Maths',3,null);

insert into dlabs(dno,labname,labnum)
VALUES(null,'PHY_1',1);

insert into dlabs(dno,labname,labnum)
VALUES(null,'PHY_2',4);

insert into dlabs(dno,labname,labnum)
VALUES(null,'Chem_1',2);

insert into dlabs(dno,labname,labnum)
VALUES(null,'Math_1',3);


insert into project(projId,name,email,progress,estimatedCost,start_date,headId,projDept)
VALUES(1,'ProductX', 'project1@boo', 0,10000,'12-2-2013',null,null);



insert into works_on(resId,projNo)
VALUES(1,1);
insert into works_on(resId,projNo)
VALUES(2,1);
insert into works_on(resId,projNo)
VALUES(3,1);
insert into works_on(resId,projNo)
VALUES(4,1);

insert into projectkey(projectId,keyword)
VALUES(1,"Algorithms");

update researcher
set dept_num=1
where studentId=1;

update researcher
set dept_num=1
where studentId=2;

update researcher
set dept_num=2
where studentId=3;

update researcher
set dept_num=3
where studentId=4;

update researcher
set dept_num=3
where studentId=5;

update researcher
set dept_num=1
where studentId=6;

update researcher
set dept_num=2
where studentId=7;

update researcher
set dept_num=2
where studentId=8;

update professor
set profDept=1
where profId=1234;

update professor
set profDept=2
where profId=1235;

update professor
set profDept=3
where profId=1236;

update professor
set profDept=2
where profId=1237;

update professor
set profDept=1
where profId=1238;

update department
set hodId=1234
where dnum=1;

update department
set hodId=1236
where dnum=2;

update department
set hodId=1234
where dnum=1;

update department
set hodId=1235
where dnum=3;

update dlabs
set dno=1
where labnum=1;

update dlabs
set dno=1
where labnum=4;

update dlabs
set dno=2
where labnum=2;

update dlabs
set dno=3
where labnum=3; 

update project
set headId=1235, projDept=2
where projId=1;
