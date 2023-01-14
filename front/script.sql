create sequence seqgenre start with 1;
create table genre(
    idGenre int primary key default nextval('seqgenre'::regclass),
    nom varchar(200)
);
create sequence seqniv start with 1;
create table Niveau_etude(
    idNiveau int primary key default nextval('seqniv'::regclass),
    nom varchar(200)
);
create sequence seqSpec start with 1;
create table Specialites(
    idSpecialites int primary key default nextval('seqSpec'::regclass),
    nom varchar(200)
);
create sequence seqemp start with 1;
create table Employe(
    idEmp int default nextval('seqemp'::regclass),
    nom varchar(200),
    prenom varchar(200),
    idGenre int references genre(idGenre),
    ddn date,
    idNiveau int references Niveau_etude(idNiveau),
    idSpecialites int references Specialites(idSpecialites)
);


insert into genre values (default,'homme'),(default,'femme');
insert into Niveau_etude values (default,'bacc'),(default,'licence'),(default,'master');
insert into Specialites values (default,'vidange'),(default,'soudure');