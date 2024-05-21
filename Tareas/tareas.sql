CREATE TABLE categorias(
	id serial primary key,
	nombre varchar(45) not null

);

INSERT INTO categorias(nombre) values('Hogar'),('Trabajo'),('Ocio')
select * from categorias

drop table tareas;

CREATE TABLE tareas(
    id serial primary key,
    texto varchar(255) not null,
    completada boolean default false,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    categoria_id integer references categorias(id)
);

select * from tareas join categorias ON categorias.id = tareas.categoria_id;