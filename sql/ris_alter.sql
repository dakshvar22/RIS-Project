alter table researcher
	add constraint fk_dept_num FOREIGN KEY(dept_num)
REFERENCES department(dnum);

alter table skills
	add constraint fk_sId FOREIGN KEY(sId)
REFERENCES researcher(studentId);

alter table department
	add constraint fk_hodId FOREIGN KEY(hodId)
REFERENCES professor(profId);

alter table dlabs
	add constraint fk_dno FOREIGN KEY(dno)
REFERENCES department(dnum);

alter table professor
	add constraint fk_profDept FOREIGN KEY(profDept)
REFERENCES department(dnum);

alter table project
	add constraint fk_headId FOREIGN KEY(headId)
REFERENCES professor(profId);

alter table project
	add constraint fk_projDept FOREIGN KEY(projDept)
REFERENCES department(dnum);


alter table projectkey
	add constraint fk_projectId FOREIGN KEY(projectId)
REFERENCES project(projId);

alter table works_on
	add constraint fk_resId FOREIGN KEY(resId)
REFERENCES researcher(studentId);

alter table works_on
	add constraint fk_projNo FOREIGN KEY(projNo)
REFERENCES project(projId);

alter table entrepreneur
	add constraint fk_projnum FOREIGN KEY(projnum)
REFERENCES project(projId);
