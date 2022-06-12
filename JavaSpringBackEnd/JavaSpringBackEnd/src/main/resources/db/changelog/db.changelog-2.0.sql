-- liquibase formatted sql

-- changeset martin:1
CREATE TABLE Product(
    [id] [int] IDENTITY(1,1) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price VARCHAR(255) NOT NULL,
    imageUrl VARCHAR(255) NOT NULL,
    CONSTRAINT PK_ProductId PRIMARY KEY(id)
    );
