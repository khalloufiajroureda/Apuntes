const animales = document.getElementsByClassName("animal")
for (const animal of animales) {
    animal.style.backgroundColor = "lightyellow"
}

const boton = document.querySelector("#resaltarAnimales")
boton.addEventListener("click", function() {
    for (const animal of animales) {
    animal.style.color = "green"
    animal.style.fontSize = "100px"
}
})