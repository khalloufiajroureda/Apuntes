const noticias = document.getElementsByClassName("noticia")
const emojis = document.getElementsByClassName("noticia")
for (const noticia of noticias) {
    noticia.style.backgroundColor = "lightgray"
}
for (let emoji of emojis) {
    emoji.innerHTML = "🔥" + emoji.innerHTML;
    }