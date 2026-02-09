#!/bin/bash 

division_entera() {
    resultado=$(($1 / $2))
    echo $resultado
}

division=$(division_entera 10 2)
echo "La division es: $division"