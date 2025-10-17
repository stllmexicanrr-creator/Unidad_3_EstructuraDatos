/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1.datos;

/**
 *
 * 
 * @author (M.Stll) 
 * 
 */
public class KardexDatos { // Esta clase me permite mantener la informacion entre las ventanas
    public static String [][] datos=
            new String [10][3];
    public static int index=0; // Llevar El Conteo
    
public static double calcularPromedio() {
    if (KardexDatos.index == 0) return 0;

    double suma = 0;
    for (int i = 0; i < KardexDatos.index; i++) {
        suma += Double.parseDouble(KardexDatos.datos[i][2]);
    }
    return suma / KardexDatos.index;
    
    // Este metodo calcula el promedio conforme se va actualizando
}
public static int  buscar(String dato){
    int a=0;
    for (int i=0;i<datos.length;i++){
        if (dato.equals(datos[i][0])){
             a=i;
        }
        else {
            a=-1;           
        }
     
    }
    return a;
} 
}
