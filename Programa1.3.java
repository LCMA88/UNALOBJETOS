/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author  Laura Molina Ávila y Santiago García Álvarez 
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        int i, j; //contadores en los ciclos
        int sum=0;//inicializador para operación suma 
        int aux, aux2; //enteros que permiten reorganizar posiciones en un ciclo 
        double aux3; // double para reorganizar porcentajes en un ciclo 
        java.util.Scanner lectura=new java.util.Scanner (System.in);
        System.out.print ("Ingrese el número de municipios: ");
        int muni=lectura.nextInt(); //municipios, ingresado por el usuario
        System.out.print ("Ingrese el número de candidatos por municipio: ");
        int cand=lectura.nextInt(); //candidatos ingresado por el usurio         
        int[][] mat= new int[muni][cand]; //matriz de municipios x candidatos
         int [] ar=new int[cand]; //arreglo para las posiciones de candidatos
        double []por=new double[cand]; //arreglo para almacenar porcentajes
        int []mm=new int[cand]; //arreglo de transición
        int []pos=new int[cand]; //arreglo final de posiciones
        for(i=0;i<muni;i++){ //ciclo que lee los votos 
            for(j=0;j<cand;j++){
            System.out.print (" Digite la cantidad de votos en el municipio ");
            System.out.print(i+1);
            System.out.print (" del candidato ");
            System.out.print(j+1);
            System.out.print (": ");
            mat[i][j]=lectura.nextInt();
            
            }
            
        }
        for(i=0;i<mat.length;i++){ //ciclo para mostrar los votos en pantalla
            System.out.print ("Municipio ");
            System.out.print (i+1);
            System.out.print("|");
            for(j=0;j<mat[i].length;j++){
            System.out.print (mat [i][j]);
            if (j!=mat[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        for(i=0;i<cand;i++){ //ciclo para crear arreglo con los votos de los candidatos e iniciarlos en 0
            ar[i] = 0;
        }

        for(i=0;i<cand;i++){ //ciclo para hallar el numero de votos de cada candidato 
            for(j=0;j<muni;j++){
                ar[i] = ar[i] + mat[j][i];
            }
            pos[i] = i+1;
            }

        for(i=0;i<cand;i++){//ciclo de transicion
            sum = sum + ar[i];
        }

        for(i=0;i<cand;i++){// ciclo para hallar el promedio de votos de cada candidato
            por[i] = (ar[i]*100)/sum;
        }
        for(i=0;i<cand;i++){
            mm[i] = ar[i];
        }

        for(i=0;i<cand-1;i++){ //ciclo para organizar a los canditdatos por numero de votos 
            for(j=(i+1);j<cand;j++){
                if(mm[i]<mm[j]){
                    aux = mm[i];
                    mm[i] = mm[j];
                    mm[j] = aux;
                    aux2 = pos[i];
                    pos[i] = pos[j];
                    pos[j] = aux2;
                    aux3 = por[i];
                    por[i] = por[j];
                    por[j] = aux3;
            }
        }
    }

    System.out.print ("El(los) candidato(s) con mayor votacion fue(ron): \n");
    System.out.print ("El candidato ");
    System.out.print (pos[0]);
    System.out.print (" con un ");
    System.out.print (por[0]);
    System.out.print ("% del total de los votos \n");
    if(por[0]>=50){
        System.out.print ("El candidato ");
        
    }
    for(i=1;i<cand-1;i++){
        if(por[0]==por[i]){
        System.out.print ("El candidato ");
        System.out.print (pos[i]);
        System.out.print (" con un ");
        System.out.print ( por[i]);
        System.out.print ("% del total de los votos \n");
        }
        else{
        i=cand;
        }
    }

    System.out.print ("El candidato con menor votacion fue: \n"); 
    System.out.print ("El candidato "); 
    System.out.print (pos[cand-1]); 
    System.out.print (" con un "); 
    System.out.print ( por[cand-1]); 
    System.out.print ("% del total de los votos \n");
    

    for(i=0;i<cand;i++){
        System.out.print ("El candidato ");
        System.out.print ( pos[i]); 
        System.out.print (" tuvo el ");
        System.out.print (i+1);
        System.out.print (" lugar con un ");
        System.out.print ( por[i]);
        System.out.print ("% del total de votos \n");
        
    }

        }
        // TODO code application logic here
    }
    

