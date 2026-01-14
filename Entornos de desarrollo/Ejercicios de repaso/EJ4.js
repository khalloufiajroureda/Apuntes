
    /**
     * @param {number} arrayNumeros 
     * @param {number} suma
     * Cambio el nombre de las variable, array y el de la funcion.
     */
    function sumaNumeros(arrayNumeros) {
        let suma = 0
        for (let i = 0; i < arrayNumeros.length; i++) {
            suma = suma + arrayNumeros[i]
        }
        return suma / arrayNumeros.length
    }
