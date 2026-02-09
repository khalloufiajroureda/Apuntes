#!/bin/bash 

perimetro() {
    pi=3.14
    dos=2
    resultado=$( echo "$dos * $pi * $1" | bc )

    echo "EL perimetro es: $resultado"
}
perimetro $1