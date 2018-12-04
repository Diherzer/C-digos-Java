/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Graciele Matsuda
 */
import java.util.Scanner;

public class Menu {
    
    //Scanner teclado 
    Scanner teclado = new Scanner(System.in);
    
    Tabuleiro tabuleiro = new Tabuleiro();
    
    
    //COntrutor de Menu 
    public Menu(){
	
    }
    
    
    //Método que recebe um  tabuleiro e o imprime 
    
    public void imprimeTabuleiro(Tabuleiro tabuleiro){
        
        System.out.println(); //Pular linha
        for(int i=0 ; i<3 ; i++){
            
            for(int j=0 ; j<3 ; j++){
                
                if(tabuleiro.posicao[i][j]== null){
                    System.out.print("[ " +" ]");
                }
                if("X".equals(tabuleiro.posicao[i][j])){
                    System.out.print("[X "+"]");
                }
                if("O".equals(tabuleiro.posicao[i][j])){
                    System.out.print("[O "+"]");
                }
            } 
            System.out.println();
        }
        System.out.println();
    }
        
        
    
    
    
    //Método Ler Linha 
    public int lerLinha(){
        System.out.println("Insira a linha : ");
        int linha = teclado.nextInt();
    
        return linha;
    }
    
    
    
    
    //Método ler Coluna
    public int lerColuna(){
    System.out.println("Insira a coluna : ");
    int coluna = teclado.nextInt();
    
        return coluna;      
    }

   
    
}
