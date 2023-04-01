--Удаление базы данных Jaegers если она существует
DROP DATABASE IF EXISTS Jaegers;

--Создание базы данных Jaegers
CREATE DATABASE Jaegers;

--Удаление таблицы Jaegers если она существует
DROP TABLE IF EXISTS Jaegers;

--Создание таблицы Jaegers
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height INTEGER,
    weight INTEGER,
    status CHAR(9),
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);

\ir init_db.sql
\ir queries.sql