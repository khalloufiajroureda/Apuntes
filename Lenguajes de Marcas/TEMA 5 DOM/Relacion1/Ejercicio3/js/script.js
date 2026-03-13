let colorBoton = document.querySelector(".boton")
colorBoton.style.backgroundColor = "red"

let coloresBotones = document.querySelectorAll(".boton")
let bordesBotones = document.querySelectorAll(".boton")

const boton = document.getElementById("cambiarEstilo")
boton.addEventListener("click", function() {
    for (let colorBoton of coloresBotones) {
    colorBoton.style.backgroundColor = "pink"
    }
    for (let bordeBoton of bordesBotones) {
    bordeBoton.style.border = "2px solid black"
    }
})