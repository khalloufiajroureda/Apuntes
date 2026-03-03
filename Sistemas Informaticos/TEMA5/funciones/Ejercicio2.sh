#!/bin/bash

validar_parametros() {
    if [ $# -ne $(( $1 + 1 )) ]; then
        echo "Hay que pasar $1 parametros"
        return 1
    else
        return 0
    fi
}

archivos_mas_grandes() {
    validar_parametros 1 "$@" || return 1

    if [ ! -d "$1" ]; then
        echo "La carpeta no existe"
        return 1
    fi

    max=$(ls -l "$1" | awk 'NR>1 {print $5}' | sort -n | tail -1)

    ls -l "$1" | awk -v m=$max 'NR>1 && $5==m {print $9}'
}

archivos_mas_grandes "$1"