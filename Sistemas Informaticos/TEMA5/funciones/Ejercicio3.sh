#!/bin/bash

    borrar_archivos_grandes() {
    if [ $# -ne 1 ]; then
        echo "Hay que pasar 1 parametro"
        return 1
    fi

    max=$(ls -l "$1" | awk 'NR>1 {print $5}' | sort -n | tail -1)

    ls -l "$1" | awk -v m=$max 'NR>1 && $5==m {print $9}'
    }

    borrar_archivos_grandes "$1"