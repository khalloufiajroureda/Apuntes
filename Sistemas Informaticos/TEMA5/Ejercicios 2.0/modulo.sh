modulo() {
    resultado=$(($1%$2))
    echo $resultado
}

modulo $1 $2
