/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos.reto1;

/**
 *
 * @author (M.Stll)
 */
public class Pregunta12 {
    
    public static int getNumeroMenor(int a, int b, int c) {
    int menor = a; // Asumimos que 'a' es el menor inicialmente.

    // Comprobamos si 'b' es menor que el valor actual de 'menor'.
    if (b < menor) {
        menor = b; // Si es así, 'b' es el nuevo menor.
    }

    // Comprobamos si 'c' es menor que el valor actual de 'menor'.
    if (c < menor) {
        menor = c; // Si es así, 'c' es el nuevo menor.
    }

    return menor;
}
}
