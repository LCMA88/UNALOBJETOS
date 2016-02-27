/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujoo3;

/**
 *
 * @author Laura Molina Ávila y Santiago García Álvarez
 */
   /**
     * @param args the command line arguments
     */
   import java.util.Scanner;

public class Flujoo3 {
public static double sumatoria (double a, double b){ //función que suma dos raacionales
    double c= a+b;
    return c;
}


public static double resta (double a, double b){//función que resta dos racionales
double d= a-b;
return d;
}


 public static void main(String[] args) {
        // TODO code application logic here
    Scanner numero = new Scanner(System.in);    
    double suma, diferencia,a,b; //nombres asignados a las variabes importantes
    System.out.print ("Ingrese el primer numero: ");
    a= numero.nextDouble();
     System.out.print ("ingrese el segundo numero: ");
    b=numero.nextDouble();
    suma= sumatoria (a,b); //función 1 invocacion
     System.out.print ("la suma de los valores es: " + suma);
    diferencia= resta (a,b);//lunción 2 invocacion
     System.out.print ("la resta entre el primer valor y el segundo: " + diferencia);
   
}
 
    }
    

