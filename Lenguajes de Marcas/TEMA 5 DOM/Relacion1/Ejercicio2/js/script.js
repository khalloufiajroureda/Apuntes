let frutas = document.getElementsByTagName("li")
let emojis = document.getElementsByTagName("li")

const boton = document.getElementById("marcarFrutas")

for (let fruta of frutas) {
fruta.style.border = "2px dotted orange"
}
boton.addEventListener("click", function() {
    for (let fruta of frutas) {
    fruta.style.backgroundColor = "pink"
    }
    
    for (let emoji of emojis) {
        if (!emoji.textContent.includes("✅")) {
            emoji.textContent += "✅"
        }
    }
})