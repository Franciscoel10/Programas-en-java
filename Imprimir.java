
package imprimir;

import javax.swing.JOptionPane;
public class Imprimir {

    
    public static void main(String[] args) {
     int nf = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas:"));
     int nc = Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas:"));
     int matriz[][]=new int [nf][nc];
     for(int i=0;i<nf;i++){
        for(int j=0;j<nc;j++){
            matriz [i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ["+(i+1)+","+(j+1)+"]de la matriz"));
        }
    }
     String resultado = "";
     for(int i=0;i<nf;i++){
        for(int j=0;j<nc;j++){
            resultado += matriz[i][j];
            resultado +="   ";
        }
        resultado +="\n";
    }
     JOptionPane.showMessageDialog(null, resultado);
    }  
}
