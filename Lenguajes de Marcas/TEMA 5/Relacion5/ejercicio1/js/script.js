
function añadirUnElemento() {
    const nuevoElemento = document.createElement("li")
    nuevoElemento.textContent = "Elemento" 
    const contarLista = lista.childElementCount
    lista.appendChild(nuevoElemento)
}




let añadirElemento = document.getElementById("btnAniadir")
const borrarElemento = document.getElementById("btnBorrar")
const editarElemento = document.getElementById("btnEditar")
const lista = document.getElementById("lista")

añadirElemento.addEventListener("click", añadirUnElemento)