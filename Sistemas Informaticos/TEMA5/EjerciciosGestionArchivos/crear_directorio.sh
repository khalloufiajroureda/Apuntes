validar_argumentos() {
    if [ "$#" -ne "$1" ]; then
        echo "Error: Número incorrecto."
        echo "Uso: crear_directorio /ruta/al/directorio"
        return 1
    fi
    return 0
}