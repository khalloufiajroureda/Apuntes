mayorDeTres() {
    numero1=$1
    numero2=$2
    numero3=$3

    if ((numero1 > numero2 && numero1 > numero3)); then
        echo "El numero mas grande es: " $numero1
    elif ((numero2 > numero1 && numero2 > numero3)); then
        echo "El numero mas grande es: " $numero2
    else
        echo "El numero mas grande es: " $numero3
    fi
}

mayorDeTres $1 $2 $3