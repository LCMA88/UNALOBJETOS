/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

/**
 *
 * @author personal
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura= new java.util.Scanner(System.in); 
        int answer=(int)Math.floor((Math.random()*100)+1); 
        int guess; 
        int numguesses=1; 
    
        do{
            System.out.print("Enter the guess number");
            guess=lectura.nextInt();
            if(guess<answer){
                System.out.print("Higher...");
            }else if(guess>answer){
                    System.out.print("Lower");
            }else if(guess==answer){
                    System.out.print("You Win");
            }
            numguesses=numguesses+1;      
            
     
           }while(numguesses>7 || (guess==answer)); 
           if(numguesses>7){
                   System.out.print("You Lose :( ");   
           }
        
        // TODO code application logic here
    
    
    }}