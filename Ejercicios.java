/* 7.6 Complete las siguientes oraciones:
a) Un arreglo unidimensional p contiene cuatro elementos. Los nombres de esos elementos son: p[ 0 ]
p[ 1 ], p[ 2 ] y p[ 3 ] 
b) Al proceso de nombrar un arreglo, declarar su tipo y especificar el número de dimensiones se le conoce
como  declarar      el arreglo.

7.7 Conteste con verdadero o falso a cada una de las siguientes proposiciones; en caso de ser falso,
explique por qué.
a) Para referirse a una ubicación o elemento específico dentro de un arreglo, especificamos el nombre del
arreglo y el valor del elemento específico. FALSO Por que para saber su ubicación es necesario saber
su indice
b) La declaración de un arreglo reserva espacio para el mismo. VERDADERO
c) Para indicar que deben reservarse 100 ubicaciones para el arreglo entero p, debe escribir la declaración
p[100]  FALSO por que lo correcto sería:  int[] p = new int[100];
d) Una aplicación que inicializa con cero los elementos de un arreglo con 15 elementos debe contener al
menos una instrucción for. VERDADERO

7.8 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
a) Mostrar el valor del elemento 6 del arreglo f.
int[] f = new int[10];
System.out.printf(“%5d",f[5]);
b) Inicializar con 8 cada uno de los cinco elementos del arreglo entero unidimensional g.



*/
package ejercicios;


public class Ejercicios {

  
    public static void main(String[] args) {
      
  int[] arreglo = new int[5]; // crea el objeto arreglo
 for (int contador = 0; contador < arreglo.length; contador++)
 System.out.println(8);

 
 }
}
    
    

