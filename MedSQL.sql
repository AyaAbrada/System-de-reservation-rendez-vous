create database RendezVous;
use RendezVous;

create table parient(
id_patient int primary key,
username varchar(30),
email varchar(30),
telephone int,
motif varchar(200)
);

create table medecin(
id_medecin int primary key,
nom varchar(30)
);

create table RendezVous(
id int auto_increment primary key,
id_patient int,
id_medecin int,
foreign key (id_patient) references parient(id_patient),
foreign key (id_medecin) references medecin(id_medecin),
Date date,
status varchar(200)
);
