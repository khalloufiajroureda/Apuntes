#!/bin/bash

volumen_esfera() {
    pi=3.14
    tres=3
    cuatro=4
    division=1.33
    resultado=$( echo "$division * $pi * ($1 * $1 * $1)" | bc )
    
    echo "El volumen de la esfera es: $resultado"
}

volumen_esfera $1