    //1.1. Indicaciones generales

    //No cambies el comportamiento del programa.
    //No añadas nueva funcionalidad.
    //Mejora los nombres de variables y funciones.
    //Aplica una convención de nomenclatura coherente.
    //Ordena el código si es necesario.
    //Elimina ambigüedades y mejora la claridad general.
    //No añadas comentarios innecesarios para explicar lo obvio.
    //Indicaciones generales

    //Cambio el nombre de las variables y de la funcion para que el programa sea mas legible
    // y se entienda mejor.
    function calculoNumeros(numero1, numero2, numero3) {
        let operacion = 0

        if (numero1 > 0) {
            if (numero2 > 0) {
                operacion = numero1 + numero2
            } else {
                operacion = numero1 - numero3
            }
        } else {
            if (numero3 > 0) {
                operacion = numero2 + numero3
            } else {
                operacion = 0
            }
        }
        return operacion
    }
