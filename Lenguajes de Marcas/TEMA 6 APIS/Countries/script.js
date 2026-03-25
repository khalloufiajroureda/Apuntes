const apiUrl = "https://restcountries.com/v3.1/name/";

// Evento del formulario
document.getElementById("form-nombre").addEventListener("submit", function(e) {
    e.preventDefault();

    const nombre = document.getElementById("input-nombre").value;
    obtenerPais(nombre);
});

// Función para obtener datos de un país
async function obtenerPais(nombre) {
    try {
        const respuesta = await fetch(`${apiUrl}${nombre}`);
        if (!respuesta.ok) {
            throw new Error("No se encontró el país");
        }

        const datos = await respuesta.json();
        mostrarPais(datos[0]);
    } catch (error) {
        console.error("Error al obtener el país:", error);
    }
}

// Mostrar datos
function mostrarPais(pais) {
    const contenedor = document.getElementById("resultado-nombre");
    const lenguas = Object.values(pais.languages || {});
    const monedas = Object.values(pais.currencies || {})
        .map(m => m.symbol);

    contenedor.innerHTML = `
        <p><strong>Bandera:</strong> ${pais.flag}</p>
        <p><strong>Nombre:</strong> ${pais.name.common}</p>
        <p><strong>Nombre oficial:</strong> ${pais.name.official}</p>
        <p><strong>Capital:</strong> ${pais.capital}</p>
        <p><strong>Region:</strong> ${pais.region}</p>
        <p><strong>Subregion:</strong> ${pais.subregion}</p>
        <p><strong>Poblacion:</strong> ${pais.population}</p>
        <p><strong>Idiomas:</strong> ${lenguas}</p>
        <p><strong>Monedas:</strong> ${monedas}</p>
    `;
}

const apiUrl2 = "https://restcountries.com/v3.1/region/";
const botones = document.querySelectorAll(".btn-region");

botones.forEach(boton => {
    boton.addEventListener("click", () => {
        const region = boton.dataset.region;
        obtenerPorRegion(region);
    });
});

async function obtenerPorRegion(region) {
    try {
        const respuesta = await fetch(`${apiUrl2}${region}`);
        if (!respuesta.ok) {
            throw new Error("No se encontró la región");
        }

        const datos = await respuesta.json();
        mostrarRegiones(datos);
    } catch (error) {
        console.error("Error:", error);
    }
}

function mostrarRegiones(paises) {
    const contenedor = document.getElementById("resultado-region");

    contenedor.innerHTML = "";

    paises.forEach(pais => {
        const tarjeta = document.createElement("div");
        tarjeta.classList.add("tarjeta");

        tarjeta.innerHTML = `
            <img src="${pais.flags.png}" width="100">
            <h3>${pais.name.common}</h3>
            <p><strong>Capital:</strong> ${pais.capital?.[0] || "N/A"}</p>
            <p><strong>Población:</strong> ${pais.population}</p>
        `;

        contenedor.appendChild(tarjeta);
    });
}
