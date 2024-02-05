-- Crear la base de datos que contenera tooodo, NO es necesario una base para cada cosa

CREATE DATABASE IF NOT EXISTS ecomerce;

-- Usar la base de datos

USE ecomerce;

-- Crear la tabla de clientes

CREATE TABLE IF NOT EXISTS Clientes(

idClientes INT AUTO_INCREMENT PRIMARY KEY,

nombre VARCHAR(100) NOT NULL,

apellido VARCHAR(100) NOT NULL,

email VARCHAR(255) UNIQUE NOT NULL,

telefono VARCHAR(20),

direccion VARCHAR(255),

ciudad VARCHAR(100),

pais VARCHAR(100)

);

--CREE ID CON SUS NOMBRES PARA CADA PRIMARY KEY
-- Crear la tabla de Productos

CREATE TABLE IF NOT EXISTS Productos(

idProductos INT AUTO_INCREMENT PRIMARY KEY,

producto VARCHAR(100) NOT NULL


);

-- Crear la tabla de ventas

CREATE TABLE IF NOT EXISTS Ventas(

idVentas INT AUTO_INCREMENT PRIMARY KEY,

idProductos INT NOT NULL,

idClientes INT NOT NULL

);