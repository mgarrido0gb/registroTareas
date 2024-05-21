CREATE TABLE tareas(
	id serial primary key,
	texto varchar(255) not null,
	completada boolean default false,
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);

drop table tareas;

INSERT INTO tareas(texto) VALUES('Hacer la Cama'),('Lavar Loza');

select * from tareas;
