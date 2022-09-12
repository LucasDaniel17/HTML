create database bdTarefa;

use bdTarefa;

create table tarefa (
	id int not null auto_increment primary key,
    descricao varchar(100) not null,
    data_criacao date not null, 
    data_conclusao date not null,
    status int not null
);

insert into tarefa (descricao, data_criacao, data_conclusao, status) 
	values ("Lançamento de notas", "2022-02-10", "2022-02-17", 1),
		   ("Realizar matriculas", "2022-03-22", "2022-04-01", 1),
           ("Financiamento", "2022-05-14", "2022-05-21", 0);

select * from tarefa;
