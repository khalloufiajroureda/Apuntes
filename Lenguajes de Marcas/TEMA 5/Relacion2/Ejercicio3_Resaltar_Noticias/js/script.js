const noticias = document.getElementsByClassName("noticia")

    for (let i = 0; i < noticias.length; i++) {
        if (i % 2 == 0) {
            noticias[i].style.backgroundColor = "lightgray"
        } else {
            noticias[i].style.backgroundColor = "blue"
        }
        noticias[i].textContent = "🔥" + noticias[i].textContent
    }
