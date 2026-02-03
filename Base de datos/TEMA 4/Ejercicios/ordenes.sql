DROP DATABASE IF EXISTS andalucia_db;
CREATE DATABASE IF NOT EXISTS andalucia_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE andalucia_db;

-- Crear la tabla personas con estructura adecuada
CREATE TABLE personas (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    sexo ENUM('M', 'H') NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    provincia VARCHAR(100) NOT NULL,
    municipio VARCHAR(150) NOT NULL,
    nivel_estudios VARCHAR(50),
    situacion_laboral VARCHAR(50),
    ingresos_anuales INT,
    estado_civil VARCHAR(20),
    num_hijos INT,
    nivel_socioeconomico VARCHAR(20),
    ocupacion VARCHAR(50),
    madre INT NULL,
    padre INT NULL
);

SET FOREIGN_KEY_CHECKS=0;

LOAD DATA INFILE '/var/lib/mysql-files/data_andalucia.csv' INTO TABLE personas FIELDS TERMINATED BY ','  ENCLOSED BY '"' ESCAPED BY '\\' LINES TERMINATED BY '\r\n' IGNORE 1 ROWS (id, nombre, apellido, sexo, fecha_nacimiento, provincia, municipio, nivel_estudios, situacion_laboral, ingresos_anuales, estado_civil, num_hijos, nivel_socioeconomico, ocupacion, @madre, @padre) SET madre = NULLIF(@madre, 'NULL'), padre = NULLIF(@padre, 'NULL');

alter table personas add foreign key (padre) references personas(id);
alter table personas add foreign key (madre) references personas(id);

SET FOREIGN_KEY_CHECKS=1;

-- 1 dime el nombre y apellido de los cinco malagueños (provincia) de más edad

-- 2 dime el maximo de ingresos anuales que tiene una persona con estudios primarios.
select MAX(ingresos_anuales) AS maximo_ingresos from personas where nivel_estudios = "primarios";
-- 3  dime la edad media de las personas cuya ocupación comience por la letra A
select avg(extract(year from now()) - extract(year from fecha_nacimiento)) AS edad_media from personas where ocupacion LIKE 'A%';
-- 4  Dime las 3 primeras letras del estado civil de las personas de Dos Hermanas (pueblo, no que tengan hermanas).

-- 5  Cuenta el numero de personas que son padre siendo mujer o madre siendo hombre
select count(padre) from personas where sexo = "M";
-- 6  Dime la moda del estado civil
SELECT estado_civil, COUNT(*) AS moda FROM personas GROUP BY estado_civil HAVING COUNT(*) = (SELECT MAX(moda) FROM (SELECT COUNT(*) AS moda FROM personas GROUP BY estado_civil) AS sub);
-- 7  Dime cuantos municipios diferentes de la provincia de Cádiz aparecen en la base de datos. 

-- 8  Dime la media de ingresos_anuales agrupada por estado_civil.
select avg(ingresos_anuales) as media_ingresos_anuales, estado_civil from personas group by estado_civil;
-- 9  Dime los abuelos de la persona con id 1144

-- 10 Dime los nietos de la persona con id 1093

-- 11 Dime la media de numero de hijos por mujer.

-- 12 Dime los 5 granadinos (provincia) que más cobran ordenados por la longitud en letras de su ocupacion. 

-- 13 Dime la provincia con menos ingresos anuales de media.

-- 14 Dime la provincia que tiene a los jubilados con menores ingresos anuales de media.

-- 15 Dime el municipio con mas ingresos anuales sin contar a las personas que no cobran nada.

-- 16 dime la media de edad de las personas con algun hijo con nombre empezando por la L.

-- 17 Dime la edad media de las personas que sean hermanas (de padre o de madre) de las personas de Málaga municipio.

-- 18 Dime la media de salarios anuales agrupados por el dia del mes en el que nacieron.
select avg(ingresos_anuales) as media_salarios_anuales from personas group by extract(day from fecha_nacimiento);
-- 19 Muestra la fecha de nacimiento en dia, mes y año de los jubilados que viven en Córdoba.

-- 20 Muestra la cantidad de personas que nacieron en cada década del siglo XX.

-- 21. Muestra las 3 provincias con más edad media entre las personas casadas.

-- 22. Muestra el municipio (o municipios) con más personas paradas.

-- 23. Muestra cada municipio junto con el valor máximo de ingresos_anuales de entre las personas que son padres.