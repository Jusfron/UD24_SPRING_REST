DROP table IF EXISTS empleados;

create table empleados(
    id int auto_increment,
    nombre varchar(250),
    apellido varchar(250),
    trabajo varchar(250),
    salario double
);

insert into empleados (nombre, apellido,trabajo,salario)values('Jose','Marin','Programador',10000.00);
insert into empleados (nombre, apellido,trabajo,salario)values('Juan','Lopez','Analista',20000.00);
insert into empleados (nombre, apellido,trabajo,salario)values('Pedro','Guillem','Jefe',30000.00);
insert into empleados (nombre, apellido,trabajo,salario)values('Jordi','Martin','Programador',10000.00);
insert into empleados (nombre, apellido,trabajo,salario)values('Jonatan','Vicente','Diseñador',15000.00);