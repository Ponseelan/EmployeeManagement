create sequence hibernate_sequence start with 1 increment by 1;
create table counter (id integer not null, module varchar(255), value integer not null, primary key (id));
create table department_project (id integer not null, department_id integer not null, project_id integer not null, primary key (id));
create table departments (id integer not null, depart_code varchar(255), name varchar(255), primary key (id));
create table employee_department (id integer not null, department_id integer, employee_id integer, primary key (id));
create table employee_project (id integer not null, employee_id integer not null, is_active boolean not null, project_id integer not null, primary key (id));
create table employees (id integer not null, emp_code varchar(255), name varchar(255), primary key (id));
create table projects (id integer not null, name varchar(255), project_code varchar(255), primary key (id));
alter table employee_project add constraint UKn3q0ooygd0ayehpncf5wdffvj unique (is_active, employee_id, project_id);
create sequence hibernate_sequence start with 1 increment by 1;
create table counter (id integer not null, module varchar(255), value integer not null, primary key (id));
create table department_project (id integer not null, department_id integer not null, project_id integer not null, primary key (id));
create table departments (id integer not null, depart_code varchar(255), name varchar(255), primary key (id));
create table employee_department (id integer not null, department_id integer, employee_id integer, primary key (id));
create table employee_project (id integer not null, employee_id integer not null, is_active boolean not null, project_id integer not null, primary key (id));
create table employees (id integer not null, emp_code varchar(255), name varchar(255), primary key (id));
create table projects (id integer not null, name varchar(255), project_code varchar(255), primary key (id));
alter table employee_project add constraint UKn3q0ooygd0ayehpncf5wdffvj unique (is_active, employee_id, project_id);
