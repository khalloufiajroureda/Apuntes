#!/bin/bash 

area_circulo() {
    pi=3.14
    resultado=$(echo "$pi * ($1 * $1)" | bc)

    echo "El area del circulo es: $resultado"
}

area_circulo $1