-- liquibase formatted sql

-- changeset system:1654085380396-1
CREATE TABLE Customer(
    [id] [int] IDENTITY(1,1) NOT NULL,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    CONSTRAINT PK_customerId PRIMARY KEY(id)
    );
