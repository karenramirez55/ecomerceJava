-- Crear la base de datos que contenera tooodo, NO es necesario una base para cada cosa

CREATE DATABASE IF NOT EXISTS ecomerce;

-- Usar la base de datos

USE ecomerce;

-- Crear la tabla de clientes

CREATE TABLE IF NOT EXISTS Clientes(

id INT AUTO_INCREMENT PRIMARY KEY,

nombre VARCHAR(100) NOT NULL,

apellido VARCHAR(100) NOT NULL,

email VARCHAR(255) UNIQUE NOT NULL,

telefono VARCHAR(20),

direccion VARCHAR(255),

ciudad VARCHAR(100),


pais VARCHAR(100)

);


-- Crear la tabla de Productos

CREATE TABLE IF NOT EXISTS Productos(

id INT AUTO_INCREMENT PRIMARY KEY,

producto VARCHAR(100) NOT NULL


);

-- Crear la tabla de Productos

CREATE TABLE IF NOT EXISTS Ventas(

id INT AUTO_INCREMENT PRIMARY KEY,

venta VARCHAR(100) NOT NULL


);