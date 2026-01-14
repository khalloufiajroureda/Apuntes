    //Cambio el nombre de las variables y de la funcion para que el programa sea mas legible
    // y se entienda mejor.
    function calculoAcumulativo(arrayNumeros, numeroCondicional) {
        let acumulado = 0
        for (let i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] > numeroCondicional) {
                acumulado = acumulado + arrayNumeros[i]
            }
        }
        return acumulado
    }
    
