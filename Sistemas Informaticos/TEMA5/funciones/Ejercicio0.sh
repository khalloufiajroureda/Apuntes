#!/bin/bash

validar_parametros() {
    if [ $# -ne $(( $1 + 1 )) ]; then
        echo "Hay que pasar $1 parametros"
        return 1
    else
        return 0
    fi
}

validar_parametros 2 "$@" || exit 1