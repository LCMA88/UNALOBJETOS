/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;
import java.util.Scanner;
/**
 *
 * @author personal
 */
public class Supermercado {
final static int MX=50;


    static int codigo[]; 
    static String producto[]; 
    static  String Descripcion[];
    static  double Precio_unitario[];
    static String Nombre_vendedor[]; 
    static int Formapago[];
    static int Cantidad[];
    static int Ventas[];
    static int dia[];
    static int mes[]; 
    static int año[]; 
    static double hora[]; 
    static String cedula[]; 
    static Scanner sc; 

    
    
    public static void main(String[] args) {
     codigo=new int [MX]; 
    Descripcion= new String[MX];
    Precio_unitario= new double[MX];
     Nombre_vendedor= new String[MX]; 
     Formapago=new int[MX];
     Cantidad= new int[MX];
     Ventas= new int [MX];
     mes= new int [MX]; 
     año= new int[MX]; 
     hora= new double[MX]; 
     producto=new String[MX];
     cedula= new String [MX]; 

     sc = new Scanner( System.in );
		
		
		
		int opcion;
		do {
                    
                    System.out.print("Bienvenido a Superadministrador"); 
                System.out.print('\n');
		System.out.print("Seleccione ingresando el numero de la opción a la que desea acceder"); 
                 System.out.print('\n');
		System.out.print("1.Realizar una venta");
                 System.out.print('\n');
 	       	System.out.print("2. actualizar códigos,precios y productos"); 
                 System.out.print('\n');
		System.out.print("3.Productos vendidos a clientes con tarjeta debito");  
                 System.out.print('\n');
		System.out.print ( "4.Producto vendido por determinado vendedor");
                 System.out.print('\n');
		System.out.print ("5.Monto total de ventas realizadas");
                 System.out.print('\n');
		 System.out.print("6Mayor precio de venta realizada con tarjeta de credito"); 
                 System.out.print('\n');
                  
     
			System.out.println( "Imprimir menu" );
			opcion = sc.nextInt( );
			switch( opcion ) {
				case 1:
					realizar_venta(); 
					break;
				case 2:
                                     actualizar();
					break;
				case 3:ventas_debito();
					
					break;
				case 4: Vendedorxproductoy();                                   
                                        
					break;
				case 5:Total_ventas();
                                       
					break;
				case 6: Credito(); 
                                        break;
				    
                              
                                        
				default: 
					System.out.println( "Opcion invalida" );
					break;
			}
		} while( opcion != 8);
	}
    
    
    
    
    
    
    public static void actualizar(){
        for(int i=0; i<MX;i++){
        System.out.println("Ingrese primero el codigo y luego presione Enter, luego ingrese el nuevo nombre del producto seguido de Enter y por ultimo su descripcion presionando Enter de nuevo");
        codigo[i]=sc.nextInt();
        producto[i]=sc.nextLine();
        Descripcion[i]=sc.nextLine();
   System.out.println("Los nuevos datos son" + producto[i] + codigo[i] + Descripcion[i]);
   break;
        }
         
    }
    
    public static void Credito(){
       int Mayor[]=new int [0]; 
        for(int i=0; i<MX;i++){
        if(Formapago[i]==2){
            if(Precio_unitario[i]>Precio_unitario[i+1]){
                System.out.println("La venta mas grande por tarjeta de credito fue hecha por"+ Nombre_vendedor[i]+ "por el precio de" + Precio_unitario[i]);
                System.out.println("Fue hecha en"+dia[i]+"/"+ mes[i]+"/"+año[i]+"Del articulo"+ producto[i]); 
                
            }
            
        }
          break; 
            
        }
        
        
        
    }
    
    public static void Vendedorxproductoy(){
      String xproducto=sc.nextLine();
      String yvendedor=sc.nextLine(); 
      for(int i=0; i<MX; i++){
          if(yvendedor.equals(Nombre_vendedor[i])&&  xproducto.equals(producto[i])){
         System.out.println("El vendedor realizó la venta es"+Nombre_vendedor[i]+ "en la fecha"+ dia[i]+"/"+mes[i]+"/"+año[i]);
         System.out.println("El artículo vendido es"+producto[i] + "de codigo"+ codigo[i] + Descripcion[i] + "que tiene como precio" +Precio_unitario[i]);
        
          }else{
              System.out.println("No se realizo la venta correspondiente"); 
          }
          
          break; 
          
      }
        
        
        
        
        
        
    }
    
     
        public static void ventas_debito(){
            for(int i=0; i<MX; i++){
                if(Formapago[i]==1){
                  System.out.println("El vendedor"+ Nombre_vendedor[i]); 
                  System.out.println(" vendio"+Cantidad[i]+" unidades del producto"+producto[i]+"cuyo precio unitario es"+Precio_unitario[i]+"por la forma de pago debito"); 
                   break; 
                }
                 
            }
    }
        
        public static void Total_ventas(){
            double ventatotal=0;
            for(int i=0;i<MX; i++){
            ventatotal+=Ventas[i];
            }
            
           System.out.println("La venta total fue"  +  ventatotal);
        }
        
        
        
        
        
        public static void realizar_venta(){
          for(int i=0; i<MX;i++){   
            System.out.println("Ingrese los siguientes datos seguidos de la tecla Enter");
            System.out.println("dia");
            System.out.println("mes");
            System.out.println("año");
            System.out.println("hora");        
             System.out.println("1.Nombre y apellido del vendedor");
             System.out.println("2.Ingrese la cedula del vendedor");
            System.out.println("3.Nombre del producto");
            System.out.println("4. Codigo del producto");
            System.out.println("5.Brinde una descripcion general del producto");
            System.out.println("6.Indique la cantidad del producto que desea llevar");
            System.out.println("7.Escriba el precio del producto");

             mes[i]=sc.nextInt(); 
             año[i]=sc.nextInt();
             hora[i]=sc.nextDouble();
            Nombre_vendedor[i]=sc.nextLine(); 
            cedula[i]=sc.nextLine(); 
            producto[i]=sc.nextLine(); 
            codigo[i]=sc.nextInt();
            Descripcion[i]=sc.nextLine();
            Cantidad[i]=sc.nextInt();
            Precio_unitario[i]=sc.nextDouble();
            
              System.out.println("Esta es su factura");
             System.out.println("Vendedor"+ Nombre_vendedor[i]);
             System.out.println("Documento"+ cedula[i]);
            System.out.println(producto[i]);
            System.out.println(codigo[i]);
            System.out.println(Descripcion[i]);
            System.out.println(Cantidad[i]);
            System.out.println(Precio_unitario[i]);
            break; 
            
            
           
          }
            
            
            
            
        }
        
        
   
    
}
