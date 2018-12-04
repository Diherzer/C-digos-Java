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
public class Tabuleiro {
    
    //Matriz 3*3 - que armazena String 
    String[][] posicao = new String[3][3];
    
    
    //Contrutor de tabuleiro
    public Tabuleiro(){
    
        
    }
    
    //Método que acessa a linha e coluna  da Matriz e retorna o elementro dentro dela
    public String getPosicao(int linha, int coluna){
         
        String elemento = posicao[linha][coluna];
        
        return elemento;
    }
    
    
    //Método que irá inserir o valor dentro da Matriz
    public void setPosicao(int linha, int coluna, String valor){
        posicao[linha][coluna] = valor;
    }
    
    
    //Método que verifica se o "X" ou "O" ganhou 
    public boolean verificaVitoria(String simbolo){
        //variavel auxiliar
       
        for(int i = 0; i < 3; i++){
            //Checa Colunas
            if(posicao[i][0] == simbolo && posicao[i][1] == simbolo && posicao[i][2] == simbolo){
                return true;
            }
            //Checa Linhas
            if(posicao[0][i] == simbolo && posicao[1][i] == simbolo && posicao[2][i] == simbolo){
                return true;
            }
            
        }
        
        //Checa Diagonal
        if(posicao[0][0] == simbolo && posicao[1][1] == simbolo && posicao[2][2] == simbolo){
                return true;
        }
        //Checa Diagonal
        if(posicao[0][2] == simbolo && posicao[1][1] == simbolo && posicao[2][0] == simbolo){
                return true;
        }
        
        return false;
    }  
    
}
