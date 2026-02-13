let coloresFondos = document.getElementsByTagName("li")
let emojis = document.getElementsByTagName("li")

const boton = document.getElementById("marcarFrutas")
boton.addEventListener("click", function() {
    for (let colorFondo of coloresFondos) {
    colorFondo.style.backgroundColor = "pink"
    }
    for (let emoji of emojis) {
    emoji.textContent += "✅"
    }
})