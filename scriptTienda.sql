-- Crear la tabla Persona
CREATE TABLE Persona (
  cedula INT PRIMARY KEY,
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  direccion VARCHAR(100),
  telefono VARCHAR(20)
);

-- Agregar elementos a la tabla Persona
INSERT INTO Persona (cedula, nombre, apellido, direccion, telefono)
VALUES (1, 'Juan', 'Pérez', 'Calle 123', '1234567890');

INSERT INTO Persona (cedula, nombre, apellido, direccion, telefono)
VALUES (2, 'María', 'González', 'Avenida 456', '0987654321');

-- Mostrar la información de la tabla Persona
SELECT * FROM Persona;

-- Crear la tabla Proveedor que hereda de Persona
CREATE TABLE Proveedor (
  cedula INT PRIMARY KEY,
  empresa VARCHAR(100),
  FOREIGN KEY (cedula) REFERENCES Persona(cedula)
);

-- Agregar elementos a la tabla Proveedor
INSERT INTO Proveedor (cedula, empresa)
VALUES (1, 'Empresa A');

INSERT INTO Proveedor (cedula, empresa)
VALUES (2, 'Empresa B');

-- Mostrar la información de la tabla Proveedor
SELECT * FROM Proveedor;

-- Crear la tabla Empleado que hereda de Persona
CREATE TABLE Empleado (
  cedula INT PRIMARY KEY,
  cargo VARCHAR(50),
  FOREIGN KEY (cedula) REFERENCES Persona(cedula)
);

-- Agregar elementos a la tabla Empleado
INSERT INTO Empleado (cedula, cargo)
VALUES (1, 'Gerente');

INSERT INTO Empleado (cedula, cargo)
VALUES (2, 'Asistente');

-- Mostrar la información de la tabla Empleado
SELECT * FROM Empleado;

-- Crear la tabla Orden_Compra
CREATE TABLE Orden_Compra (
  fecha DATE,
  precio_total DECIMAL(10,2),
  precio_proveedor DECIMAL(10,2),
  estado VARCHAR(50),
  numero INT PRIMARY KEY
);

-- Agregar elementos a la tabla Orden_Compra
INSERT INTO Orden_Compra (fecha, precio_total, precio_proveedor, estado, numero)
VALUES ('2023-06-01', 100.00, 90.00, 'Pendiente', 1);

INSERT INTO Orden_Compra (fecha, precio_total, precio_proveedor, estado, numero)
VALUES ('2023-06-02', 200.00, 180.00, 'Completada', 2);

-- Mostrar la información de la tabla Orden_Compra
SELECT * FROM Orden_Compra;

-- Crear la tabla Producto
CREATE TABLE Producto (
  codigo INT PRIMARY KEY,
  nombre VARCHAR(100),
  numero INT,
  fecha_caducidad DATE
);

-- Agregar elementos a la tabla Producto
INSERT INTO Producto (codigo, nombre, numero, fecha_caducidad)
VALUES (1, 'Producto A', 10, '2024-01-01');

INSERT INTO Producto (codigo, nombre, numero, fecha_caducidad)
VALUES (2, 'Producto B', 20, '2023-12-31');

-- Mostrar la información de la tabla Producto
SELECT * FROM Producto;

-- Crear la tabla Orden_Pedido
CREATE TABLE Orden_Pedido (
  fecha DATE,
  numero INT PRIMARY KEY,
  cantidad INT,
  codigo INT,
  FOREIGN KEY (codigo) REFERENCES Producto(codigo)
);

-- Agregar elementos a la tabla Orden_Pedido
INSERT INTO Orden_Pedido (fecha, numero, cantidad, codigo)
VALUES ('2023-06-01', 1, 5, 1);

INSERT INTO Orden_Pedido (fecha, numero, cantidad, codigo)
VALUES ('2023-06-02', 2, 3, 2);

-- Mostrar la información de la tabla Orden_Pedido
SELECT * FROM Orden_Pedido;

-- Crear la tabla Local
CREATE TABLE Local (
  nombre VARCHAR(100),
  codigo_postal VARCHAR(10),
  telefono VARCHAR(20),
  direccion VARCHAR(100)
);

-- Agregar elementos a la tabla Local
INSERT INTO Local (nombre, codigo_postal, telefono, direccion)
VALUES ('Local A', '12345', '1234567890', 'Calle Principal 123');

INSERT INTO Local (nombre, codigo_postal, telefono, direccion)
VALUES ('Local B', '54321', '0987654321', 'Avenida Secundaria 456');

-- Mostrar la información de la tabla Local
SELECT * FROM Local;