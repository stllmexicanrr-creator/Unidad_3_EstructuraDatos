/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos.reto1;

/**
 *
 * @author (M.Stll).
 */
public class Pregunta13 {
    


    /**
     * El método principal (main) para iniciar la ejecución del programa.
     * Aquí se establece el punto de partida para la cuenta regresiva.
     */
    public static void main(String[] args) {
        // Establece el número de inicio. Puedes cambiar este valor.
        int numeroInicio = 7; 
        
        System.out.println(" Iniciando cuenta regresiva desde " + numeroInicio + " hasta 0:");
        
        // Llamada a la función recursiva
        imprimirNumerosInversos(numeroInicio);
    }

    // -------------------------------------------------------------------

    /**
     * Imprime los números enteros desde el 'n' dado hasta 0, usando recursión.
     * * @param n El número entero desde donde comenzará la cuenta regresiva.
     */
    public static void imprimirNumerosInversos(int n) {
        // Caso Base: La condición que detiene la recursión.
        // Cuando n es menor que 0, la función simplemente retorna sin hacer nada más.
        if (n < 0) {
            return;
        } 
        
        // Acción (Impresión): Imprime el número actual.
        System.out.print(n);

        // Formato para separar los números con comas, excepto para el último.
        if (n > 0) {
            System.out.print(", ");
        } else {
             System.out.println(" (Fin de la cuenta)."); // Agrega un salto de línea al llegar a 0
        }
        
        // Llamada Recursiva: La función se llama a sí misma con un argumento 
        // decrementado (n - 1), acercándose al caso base.
        imprimirNumerosInversos(n - 1);
    }
}
    

/*

Explicación de la Recursión
La recursión es una técnica donde una función se llama a sí misma para resolver un problema. En este caso:

Caso Base (n<0): Es la condición de salida fundamental. Si el número llega a ser negativo, la función se detiene para evitar un bucle infinito (Stack Overflow).

Acción (System.out.print(n)): Se realiza la tarea que queremos (imprimir el número actual).

Llamada Recursiva (imprimirNumerosInversos(n - 1)): La función se llama nuevamente, pero con un número menor. Esto asegura que en cada llamada, estamos avanzando hacia el caso base, logrando el efecto de cuenta regresiva.

Ejemplo con el número 4:

Llamada n=4: Imprime 4, llama a n=3.

Llamada n=3: Imprime 3, llama a n=2.

Llamada n=2: Imprime 2, llama a n=1.

Llamada n=1: Imprime 1, llama a n=0.

Llamada n=0: Imprime 0, llama a n=−1.

Llamada n=−1: Cumple el Caso Base (n<0), y retorna, terminando el proceso.

*/