create table researcher(
studentId int NOT NULL,
fname varchar(20) NOT NULL,
lname varchar(20) NOT NULL,
loginid varchar(10) NOT NULL,
address varchar(20),
sex char(1),
password varchar(15) NOT NULL,
dept_num int,
constraint  pk_researcher PRIMARY KEY(studentId)
);


create table skills(
sId int,
skill varchar(20) NOT NULL,
constraint pk_skills PRIMARY KEY(sId,skill)
);


create table department(
dname varchar(20) NOT NULL,
dnum int NOT NULL,
hodId int,
constraint pk_department PRIMARY KEY (dnum)
);


create table dlabs(
dno int,
labname varchar(20) NOT NULL,
labNum int NOT NULL,
constraint pk_dlabs PRIMARY KEY(labNum)
);


create table professor(
profId int,
name varchar(30) NOT NULL,
login varchar(20) NOT NULL,
pass varchar(20) NOT NULL,
profDept int,
constraint  pk_professor PRIMARY KEY(profId)
);



create table project(
projId int,
name varchar(20) NOT NULL,
email varchar(20) NOT NULL,
progress int,
estimatedCost int,
start_date date NOT NULL,
headId int,
projDept int,
constraint pk_project PRIMARY KEY(projId)
);


create table projectkey(
projectId int,
keyword varchar(20) NOT NULL,
constraint pk_projectkey PRIMARY KEY(projectId,keyword)
);


create table works_on(
resId int,
projNo int,
constraint pk_works_on PRIMARY KEY(resId,projNo)
);


create table entrepreneur(
name varchar(20) NOT NULL,
amt int,
projnum int NOT NULL,
CONSTRAINT pk_entrepreneur PRIMARY KEY(name,projnum)
);
