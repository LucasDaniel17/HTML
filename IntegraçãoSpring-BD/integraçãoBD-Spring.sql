create database teste_db;

use teste_db;

create table usuario (
	idUsuario int not null auto_increment primary key,
    loginUsuario varchar(50) not null unique,
    senhaUsuario varchar(50) not null
);

create index IDX_IDUSUARIO on usuario(idUsuario);
create index IDX_LOGINUSUARIO on usuario(loginUsuario);

insert into usuario (loginUsuario, senhaUsuario) values
	("Lucas", "123"),
    ("Fulano", "1234"),
    ("Daniel", "54321");

select * from usuario;