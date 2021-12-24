create sequence hibernate_sequence start with 1 increment by 1;
create table department_project (id integer not null, department_id integer not null, project_id integer not null, primary key (id));
create table departments (id integer not null, depart_code varchar(255), name varchar(255), primary key (id));
create table employees (id integer not null, emp_code varchar(255), name varchar(255), primary key (id));
create table projects (id integer not null,name varchar(255),project_code varchar(255), primary key (id));
create table employee_department (id integer not null,department_id varchar(255),employee_id varchar(255), primary key (id));
create table employee_project (id integer not null,project_id varchar(255),employee_id varchar(255),IS_ACTIVE bit, primary key (id));
create table Counter (id integer not null,module varchar(255),value integer, primary key (id));

alter table employee_project add constraint UNIQUE_KEY unique (is_active, employee_id, project_id);

alter table employee_project add constraint FK_Employee_Id foreign key (employee_id) references employees;
alter table employee_project add constraint FK_Employee_PROJECT_ID foreign key (project_id) references projects;



alter table employee_department add constraint FK_EmployeeDepartment_Employee_Id foreign key (employee_id) references employees;
alter table employee_department add constraint FK_EmployeeDepartment_PROJECT_ID foreign key (department_id) references departments;



alter table department_project add constraint FK_DEPARTMENT_ID foreign key (department_id) references departments;
alter table department_project add constraint FK_PROJECT_ID foreign key (project_id) references projects;

