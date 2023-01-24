create table Usuarios(
id_usuario int primary key identity(1,1),
nombre varchar(30) not null,
edad int
)

create table Pacientes(
id_paciente int primary key identity(1,1),
nombre_paciente varchar(30) not null,
a_paterno varchar(30),
a_materno varchar(30),
municipio varchar(30),
telefono varchar(10)
)

create table Medicos(
id_medico int primary key identity(1,1),
nombre_medico varchar(30),
especialidad varchar(30),
area varchar(30),
consultorio int
)

insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Hugo Pérez Rea Méndez', 'Algologo', 'Algologia', 3)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Adrian Raymond Murillo Cuevas', 'Anestesiologia', 'Anestesiologo', 1)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Brenda Guadalupe Castillo Trej', 'Audiologia', 'Audiologo', 24)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Coral Olguín Arias', 'Cardiologia', 'Cardiologo', 12)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Julian Ruíz Anguas', 'Cirugia de Torax', 'Cirujano Toracico', 17)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Erick Gonzales Bautista', 'Ecocardiografia', 'Cardiologo Ecocardiografista', 5)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Benjamín Gonzales Manzo', 'Gastroenterologia', 'Gastroenterologo', 15)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Edgar Jesus LLovera Hernandez', 'Ginecologia', 'Ginecologo', 21)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Melesio Eduardo Palazuelos Lop', 'Neurocirugia', 'Neurocirujano', 16)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Oliver Guillermo Perez Bautist', 'Oftalmologia', 'Oftalmologo', 6)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Karina Guadalupe Moreno Gonzal', 'Ortopedia', 'Ortopedista', 20)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Maria Alejandra Monstserrat Ac', 'Pediatria', 'Pediatra', 19)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Samanta Garcia Ramirez', 'Radiologia Intervencionista', 'Radiologa', 2)
insert into Medicos(nombre_medico,especialidad,area, consultorio) values('Yessica Edith Ochoa Rangel', 'Terapia Intensiva', 'Medica Intensivista', 14)
