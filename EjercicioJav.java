//c) Sumar el total de los 100 elementos del arreglo c .
package ejerciciojav;


public class EjercicioJav {

  
    public static void main(String[] args) {
      {
int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 58, 25, 12, 14, 59, 23,14, 14, 36, 56,
1,2,7,4,1,2,5,3,1,4,7,5,69,36,54,25,12,14,14,12,47,48,15,45,48,69,36,14,12,14,14,14,14,25,58,69,36,58,47,
47,25,47,58,69,36,58,47,14,25,47,12,4,7,5,6,8,2,5,4,7,2,5,4,7,4,1,2,47,58,69,36,58,25,14,14,47,58,15,59 };
 int total = 0;

 // suma el valor de cada elemento al total
 for (int contador = 0; contador < arreglo.length; contador++)
 total += arreglo[contador];

 System.out.println(total);
 }
 }
    
} 

