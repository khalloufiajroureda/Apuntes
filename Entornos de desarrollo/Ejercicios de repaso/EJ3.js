    /**
     * @param {number} arrayNumeros 
     * @param {number} numero1
     * Cambio el nombre de las variables y de la funcion 
    para que el programa sea mas legible y se entienda mejor.
     */
    
    function g(arrayNumeros, numero1) {
        let nuevoArray = []
        for (let i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] > numero1) {
                nuevoArray.push(arrayNumeros[i])
            }
        }
        return nuevoArray
    }



