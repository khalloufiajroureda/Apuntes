Nivel 1: INNER JOIN Básicos

--1. Muéstrame las Personas y sus coches (solo los que tengan algun coche)
select nombre, marca, modelo from coches inner join personas on personas.id = coches.id_dueño;
--2. Coches con información de dueños como su nombre y su provincia
select marca , nombre, provincia from coches inner join personas on personas.id = coches.id_dueño;
--3. Personas que tienen coches y su estado civil
select nombre, marca, estado_civil from coches inner join personas on personas.id =
coches.id_dueño group by nombre, marca, estado_civil;
--4. Coches de personas ricas (niv socioeconomico alto)
select nombre, marca, nivel_socioeconomico from coches inner join personas on personas.id = coches.id_dueño where nivel_socioeconomico = "alto";
--5. Ocupaciones de dueños de coches mayores de 30 años

---

Nivel 2: LEFT JOIN

--6. Todas las personas y sus coches (incluyendo sin coches)
select nombre, marca from coches inner join personas on personas.id = coches.id_dueño;
--7. Personas sin coches registrados
select nombre, count(coches.id) as numero_coches_persona
from personas
left join coches on personas.id = coches.id_dueño
group by nombre
having count(coches.id) = 0;
--8. Provincias con y sin representación de coches

--9. Nivel de estudios de las personas sin coche

--10. Personas jubiladas con sus vehículos

---

Nivel 3: JOINS con Agregaciones

--11. Número de coches por persona
select nombre, count(*) as numero_coches_persona from coches 
inner join personas on personas.id = coches.id_dueño
group by nombre;
--12. Marca más común entre personas de cada provincia

--13. Promedio de edad de dueños por marca de coche

--14. Total de ingresos de dueños por color de coche

--15. Municipios con más coches

---

Nivel 4: JOINS Complejos 

--16. Padres e hijos y sus coches

--17. Parejas con algún hijo y sus coches

--18. Personas de la misma familia con más de dos coches