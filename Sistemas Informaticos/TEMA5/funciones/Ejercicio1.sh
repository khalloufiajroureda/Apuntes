#!/bin/bash

maximo() {
    if [ $# -eq 0 ]; then
        echo "Error: debes pasar numeros."
        return 1
    fi

    max=$1
    shift

    while [ $# -gt 0 ]; do
        if [ $1 -gt $max ]; then
            max=$1
        fi
        shift
    done

    echo "El numero mas grande es: " $max
    }
    
    maximo "$@"