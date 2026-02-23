factorial() {
    numero1=$1
    resultado=1
    for ((i=1; i<=numero1; i++)); do 
        resultado=$(($resultado * $i)) 
    done

    echo $resultado
}
factorial $1