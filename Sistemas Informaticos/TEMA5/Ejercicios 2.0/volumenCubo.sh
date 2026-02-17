volumenCubo() {
    elevado=$1
    resultado=1

    for ((i=1; i<=elevado; i++)); do 
        resultado=$((resultado * elevado)) 
    done

    echo $resultado
}

volumenCubo $1