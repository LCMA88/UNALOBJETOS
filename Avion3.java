/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion3;
import java.util.Scanner;

/**
 *
 * @author personal
 */
public class Avion3 {


	final static int MX = 51;
	
	static int tipo[ ];
	static boolean estado[ ];
	static String nombre[ ];
	static String cedula[ ];
	
	static Scanner sc;

	public static void main(String[] args) {
		
		tipo = new int[ MX ];
		estado = new boolean[ MX ];
		nombre = new String[ MX ];
		cedula = new String[ MX ];
		
		/*
		 * 1 - Ejecutivo ( ventana ).
		 * 2 - Ejecutivo ( centro ).
		 * 3 - Economico ( ventana ).
		 * 4 - Economico ( centro ).
		 */
		tipo[ 1 ] = 1; tipo[ 2 ] = 2; tipo[ 3 ] = 2; tipo[ 4 ] = 1;
		tipo[ 5 ] = 1; tipo[ 6 ] = 2; tipo[ 7 ] = 2; tipo[ 8 ] = 1;
		tipo[ 9 ] = 3; tipo[ 10 ] = 4; tipo[ 11 ] = 5; tipo[ 12 ] = 5; tipo[ 13 ] = 4; tipo[ 14 ] = 3; 
		tipo[ 15 ] = 3; tipo[ 16 ] = 4; tipo[ 17 ] = 5; tipo[ 18 ] = 5; tipo[ 19 ] = 4; tipo[ 20 ] = 3; 
		tipo[ 21 ] = 3; tipo[ 22 ] = 4; tipo[ 23 ] = 5; tipo[24] = 5; tipo[ 25 ] = 4; tipo[ 26 ] = 3; 
  		tipo[ 27 ] = 3; tipo[ 28 ] = 4; tipo[ 29 ] = 5; tipo[ 30 ] = 5; tipo[ 31 ] = 4; tipo[ 32 ] = 3; 
		tipo[ 33 ] = 3; tipo[ 34 ] = 4; tipo[ 35 ] = 5; tipo[ 36 ] = 5; tipo[ 37 ] = 4; tipo[ 38 ] = 3; 
		tipo[ 39 ] = 3; tipo[ 40 ] = 4; tipo[ 41 ] = 5; tipo[ 42 ] = 5; tipo[ 43 ] = 4; tipo[ 44 ] = 3; 
		tipo[ 45 ] = 3; tipo[ 46 ] = 4; tipo[ 47 ] = 5; tipo[ 48 ] = 5; tipo[ 49 ] = 4; tipo[ 50 ] = 3; 		
		for( int i = 0; i < MX; i++ ) {
			estado[ i ] = false;
			nombre[ i ] = null;
			cedula[ i ] = null;
		}
		
		sc = new Scanner( System.in );
		
		/*
		 * 1. Reservar puesto.
		 * 2. Contar sillas
		 * 3. Localizar silla pasajero con cedula.
		 * 4. Anular reserva.
		 * 5. Contar disponibles en clase economica
		 * 6. Nombres iguales en la clase economica	
		 * 7. 	
		 */
		
		int opcion;
		do {
                    
                    System.out.print("Bienvenido a aero-reservas virtual"); 
                System.out.print('\n');
		System.out.print("Seleccione ingresando el numero de la opción a la que desea acceder"); 
                 System.out.print('\n');
		System.out.print("1.Reservar puesto");
                 System.out.print('\n');
 	       	System.out.print("2. Numero total de sillas disponibles"); 
                 System.out.print('\n');
		System.out.print ("3. Localizar silla pasajero con cedula");
                 System.out.print('\n');
		System.out.print("4. Anular reserva");   
                 System.out.print('\n');
		System.out.print ( "5. Contar disponibles en clase economica");
                 System.out.print('\n');
		System.out.print ("06. Nombres iguales en la clase economica"); 
                 System.out.print('\n');
		  System.out.print("7. Salir"); 
                 System.out.print('\n');
                  
     
			System.out.println( "Imprimir menu" );
			opcion = sc.nextInt( );
			switch( opcion ) {
				case 1:
					reservarSilla( );
					break;
				case 2:
                                        Contar(); 
					break;
				case 3:
					LocalizarSilla(); 
					break;
				case 4:
                                        anularReserva( );
					break;
				case 5:
                                       Contaec(); 
					break;
				case 6:
                                        Nombresiguales(); 
					break;
				case 7:
                                        Contar2(); 
					break;
                              
				default: 
					System.out.println( "Opcion invalida" );
					break;
			}
		} while( opcion != 7 );
	}
	
	public static void reservarSilla( ) {
		System.out.println( "1. Ejecutivo ( ventana )." );
		System.out.println( "2. Ejecutivo ( centro )." );
		System.out.println( "3. Economico ( ventana )." );
		System.out.println( "4. Economico ( centro )." );
		int tipoAsiento = sc.nextInt( );
                sc.nextLine( );
		for( int i = 1; i < MX; i++ ) {
			if( tipo[ i ] == tipoAsiento && estado[ i ] == false ) {
                                System.out.println("Ingrese su nombre, pulse enter y luego su numero de cedula" );
				String nombreUsuario = sc.nextLine( ), cedulaUsuario = sc.nextLine( );
     				estado[ i ] = true;
				nombre[ i ] = nombreUsuario;
				cedula[ i ] = cedulaUsuario;
                                System.out.println( "Usted reservo el asiento"+tipo[i]);
                                break;
			}
		}
	}
	
	public static void anularReserva( ) {
		String cedulaUsuario = sc.nextLine( );
		for( int i = 1; i < MX; i++ ) {
			if( cedula[ i ].equals( cedulaUsuario ) == true ) {
				estado[ i ] = false;
				nombre[ i ] = null;
				cedula[ i ] = null;
                                System.out.println(" Usted elimino su reserva del asiento" + tipo[i]);
				return ;
			}
		}
	}


	public static void LocalizarSilla(){
                //String cedulaUsuario="";
                sc.nextLine( );
                String cedulaUsuario = sc.nextLine( );
                //System.out.println(cedulaUsuario);
                
		int tipoAsiento; 
	for(int i=0; i<MX;i++){
	if(cedula[i].equals(cedulaUsuario)==true){		
		if(tipo[i]==3){
		System.out.print("Usted se encuentra en el puesto"+i+" de la clase economica, ubicacion: ventana"); 
		}else if(tipo[i]==4){
		System.out.print("Usted se encuentra en el puesto"+i+" de la clase economica, ubicacion:centro");
		}else if(tipo[i]==5){
		System.out.print("Usted se encuentra en el puesto"+i+" de la clase economica, ubicacion: pasillo");
		}else if(tipo[i]==1){
		System.out.print("Usted se encuentra en el puesto"+i+" de la clase ejecutiva, ubicacion: ventana");
		}else if(tipo[i]==2){
		System.out.print("Usted se encuentra en el puesto"+i+" de la clase ejecutiva, ubicacion: pasillo"); 
		}else{System.out.print("Usted no se encuentra ubicado en nuestras sillas, reserve una"); 

	}
        }
        }
        }

        public static void Contar(){
            int contotal=0;  
            for(int i=0; i<MX;i++){
              if(estado[i]==false){
                  contotal= contotal +1;       
              }
         
        }
             if(contotal > 0) {
                 System.out.println("Hay "+contotal+" sillas disponibles");  
             }else{
                System.out.print("No hay sillas disponibles en el avion");
             }
             
             sc.nextLine( );
             sc.nextLine( );
        }
        public static void Contar2(){
            int contotal=0; 
            int contecv=0; 
            int conteje=0; 
            for(int i=0; i<MX;i++){
              if(estado[i]==false){
          
            if(tipo[i]==1 || tipo[i]==2){
                      conteje=conteje+1; 
                      System.out.print("El numero total de sillas disponibles en clase ejecutiva es:"+conteje);
                  } 
                  }else{
                  System.out.print("No hay sillas disponibles en la clase ejecutiva");
              }
              }
            }
         
        
        
    public static void Contaec(){
    int conteco=0; 
    for(int i=0; i<MX; i++){
        if(tipo[i]==3|| tipo[i]==4 || tipo[i]==5){
            conteco=conteco+1; 
        }else{conteco=0; }
 }
    System.out.println("Hay"+conteco+"sillas disponibles");
    }   
    
    public static void Nombresiguales(){
        String nombreusuario; 
        nombreusuario=sc.nextLine(); 
        for(int i=0; i<MX; i++){
            if(nombre[i].equals(nombreusuario)){
                System.out.print("Existen dos nombres iguales en el sistema"); 
            }else{
                System.out.print("No existe registro de su nombre"); 
            }
        }
                       
    }
}    


	


