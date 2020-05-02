create table students
(
    ID integer not null AUTO_INCREMENT,
    FIRST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255),
    LAST_NAME varchar(255) not null,
    primary key (ID)
);