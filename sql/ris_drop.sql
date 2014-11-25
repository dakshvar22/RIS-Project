alter table researcher
	drop FOREIGN KEY fk_dept_num;
	
alter table skills
	drop FOREIGN KEY fk_sId;
	
alter table department
	drop FOREIGN KEY fk_hodId;

alter table dlabs
	drop FOREIGN KEY fk_dno;

alter table professor
	drop FOREIGN KEY fk_profDept;

alter table project
	drop FOREIGN KEY fk_headId;

alter table project
	drop FOREIGN KEY fk_projDept;

alter table projectkey
	DROP foreign key fk_projectId;

alter table works_on
	drop foreign key fk_resId;

alter table works_on
	drop foreign key fk_projNo;

alter table entrepreneur
	drop foreign key fk_projnum;
	
drop table researcher;
drop table skills;
drop table department;
drop table dlabs;
drop table professor;
drop table project;
drop table projectkey;
drop table works_on;
drop table entrepreneur;
