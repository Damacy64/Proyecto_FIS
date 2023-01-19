create table Usuarios(
id_usuario int primary key identity(1,1),
nombre varchar(30) not null,
edad int
)

create table pacientes(
id_paciente int primary key identity(1,1),
nombre_paciente varchar(30) not null,
municipio varchar(30),
telefono int
)

create table medicos(
id_medico int primary key identity(1,1),
id_paciente int,
nombre_medico varchar(30),
especialidad varchar(30),
area varchar(30),
consultorio int,
foreign key (id_paciente) references pacientes(id_paciente) on delete cascade on update cascade
)

insert into medicos(nombre_medico,especialidad,area, consultorio) values('Hugo Pérez Rea Méndez', 'Algologo', 'Algologia', 3)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Adrian Raymond Murillo Cuevas', 'Anestesiologia', 'Anestesiologo', 1)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Brenda Guadalupe Castillo Trej', 'Audiologia', 'Audiologo', 24)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Coral Olguín Arias', 'Cardiologia', 'Cardiologo', 12)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Julian Ruíz Anguas', 'Cirugia de Torax', 'Cirujano Toracico', 17)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Erick Gonzales Bautista', 'Ecocardiografia', 'Cardiologo Ecocardiografista', 5)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Benjamín Gonzales Manzo', 'Gastroenterologia', 'Gastroenterologo', 15)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Edgar Jesus LLovera Hernandez', 'Ginecologia', 'Ginecologo', 21)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Melesio Eduardo Palazuelos Lop', 'Neurocirugia', 'Neurocirujano', 16)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Oliver Guillermo Perez Bautist', 'Oftalmologia', 'Oftalmologo', 6)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Karina Guadalupe Moreno Gonzal', 'Ortopedia', 'Ortopedista', 20)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Maria Alejandra Monstserrat Ac', 'Pediatria', 'Pediatra', 19)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Samanta Garcia Ramirez', 'Radiologia Intervencionista', 'Radiologa', 2)
insert into medicos(nombre_medico,especialidad,area, consultorio) values('Yessica Edith Ochoa Rangel', 'Terapia Intensiva', 'Medica Intensivista', 14)
