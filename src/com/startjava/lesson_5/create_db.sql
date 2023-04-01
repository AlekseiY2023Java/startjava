--�������� ���� ������ Jaegers ���� ��� ����������
DROP DATABASE IF EXISTS Jaegers;

--�������� ���� ������ Jaegers
CREATE DATABASE Jaegers;

--�������� ������� Jaegers ���� ��� ����������
DROP TABLE IF EXISTS Jaegers;

--�������� ������� Jaegers
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