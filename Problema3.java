package problema3;

/**
 *
 * @author inteldemo
 */
public class Problema3 {

    /**
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static int funcionveh (int a, int b, int c){//funcion para calcular valor a pagar
        return (a*(c-b)); 
    }
    
    
    public static void main(String[] args) {
       java.util.Scanner lectura= new java.util.Scanner(System.in); 
    
    
    int i; //contador
    String[]names=new String[87];//arreglo para almacenar placas
    int [] horas=new int[87];//arreglo para almacenar horas de llegada 
    System.out.print ("Ingrese la tarifa fijada: ");
            int tar=lectura.nextInt ();//tarifa fija del parqueadero
    for (i=0;i<87;i++){//ciclo para llenar el arreglo de horas con 0
        horas[i]=0;
    }        
    for(i=0; i<names.length; i++){ //ciclo para introducir las placas y las horas de llegada 
        lectura.nextLine();
        System.out.print ("\n Bienvenido al parqueadero \n Ingrese la placa de su vehiculo: ");
         names [i]=lectura.nextLine();
         System.out.print ("\n El parqueadero admite llegadas entre las 6 y las 20 hrs\n INGRESE LA HORA DE LLEGADA: ");
         horas [i]=lectura.nextInt();
         while (horas[i]<6||horas[i]>20){
             System.out.print ("Ingrese una hora valida,aproxime la hora de llegada: ");
             horas [i]=lectura.nextInt();
         }
         System.out.print ("Se le ha asignado el parqueadero ");
         System.out.print(i+1);
         System.out.print ("\n Ingrese la opción \n 1.Desea ingresar más vehículos \n 2.Desea retirar un vehiculo \n 3.Desea calcular los ingresos del parqueadero \n ");
         int cont = lectura.nextInt ();
         if (cont==1){//continuar al principio del ciclo
            
         }
         if (cont==2){//retirar vehiculo
             System.out.print ("\n Ingrese el numero de parqueadero donde se encuentra su vehiculo: ");
                     int veh=lectura.nextInt();
             System.out.print ("\n Ingrese la hora actual (entre 7 y 21 hrs: ");
             int hora=lectura.nextInt();
             while (hora<7||hora>21){//verificacion de horas validas
             System.out.print ("Ingrese una hora valida,aproxime la hora de salida: ");
             hora=lectura.nextInt();
                }
             System.out.print ("El valor a pagar es: ");
             int z=horas[veh-1];
             int sal=funcionveh (tar,z,hora);//se invoca la funcion del valor a pagar 
             System.out.print (sal);
             horas [veh-1]=0;//se vacia el parqueadero
         }
         if (cont==3) {//calcular ingresos 
             System.out.print ("\n Ingrese la hora actual: ");
             int hf=lectura.nextInt();
             int suma=0;
             for (i=0;i<87;i++){//ciclo que suma los valores a pagar de cada vehiculo 
                 int t;
                 if(horas[i]==0){
                     t=0;
                 }
                 else{
                    t=funcionveh (tar,horas[i],hf); 
                 }
                 suma=suma+t;
             }
             System.out.print ("\n las ganancias del dia son al momento: " + suma);
         }
         
           // TODO code application logic here
    }
    System.out.print ("\n Esquema de visualizacion del parqueadero, los 1 representan parqueaderos ocupados: ");    
    
    for(i=0;i<87;i++){
        if(horas[i]!=0){
            horas[i]=1;
        }
        else{
            horas[i]=0;
        }
    }
    int n= (int)Math.sqrt(horas.length);//variable para convertir el arreglo en matriz
    int taula[][] = new int[n][n];//matriz que representa al arreglo 
    int cont = 0;//contador
    for (int x = 0; x < n; x++) {//ciclo que convierte el arrelgo en matriz
      for (int y = 0; y < n; y++) {
        taula[y][x] = horas[cont];
        cont++;
      }
    }
    
    MostrarTaula(taula, n);// invoca la funcion 
    for(i=81;i<87;i++){//mostrar los ultimos 6 puestos 
        System.out.print (horas[i]);
        System.out.print ("\t");
    }
}
    
    private static void MostrarTaula(int[][] taula, int n) {//funcion para mostrar la matriz
    System.out.println("\n Parqueadero:");
    String str = "";
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        str += taula[j][i] + "\t";
      }
      System.out.println(str);
      str = "";
    }
  }

}

