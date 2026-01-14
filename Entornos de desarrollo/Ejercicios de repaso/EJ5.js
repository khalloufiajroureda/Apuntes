/**
 * 
 * @param {number} numero1 - Primer numero
 * @param {number} numero2 - Segundo numero
 * @param {number} numero3 - Tercer numero
 * @returns 
 */

function mayorQue(numero1, numero2, numero3) {
    if (numero1 === numero2 || numero1 === numero3 || numero2 === numero3) {
        return false;
    }
    if (numero1 > numero2 && numero1 > numero3) {
        return numero1;
    }
    if (numero2 > numero1 && numero2 > numero3) {
        return numero2;
    }
        return numero3;
}
