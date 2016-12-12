/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

public static void main(String[] args) {


int m;
int d;
int h;
int a;

Metodos datos=new Metodos();

a = datos.pedirDatos();
m = (a*12);
d = (a*365);
h = (d*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " ,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de ",JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de ",JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
