verificarPar() {
    numero=$1

    if ((numero % 2 == 0)); then
    echo "El numero es Par"
    else
    echo "El numero es Impar"
    fi
}

verificarPar $1