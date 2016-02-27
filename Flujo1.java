package flujo1;

import java.util.Scanner;

/**
 *
 * @author Andrés García y Laura Molina
 */
public class Flujo1 {

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int mayq ( int a,int b,int c){ //función que compara el tamaño de los tres números
if ((a > b) && (a > c)){
    return a;
}
else{
    if ((b > a) && (b > c))
        return b;


    else{
            return c;
            }


}


}
    
    /**
     *
     * @param args
     */
    public  static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    System.out.print(" Inserte el primer numero: ");
    int a= numero.nextInt(); //primer numero a comparar
    System.out.print (" Inserte el segundo numero: ");
    int b=numero.nextInt(); //segundo numero a comparar
    System.out.print (" Inserte el ultimo numero: ");
    int c=numero.nextInt(); //tercer numero a comparar
    int d= mayq( a, b, c); // se invoca la funcion que retorna el numero mayor
    System.out.print (" El numero mayor es: ");
    System.out.print (d);
    System.out.print ("\n");
    }
   

}

