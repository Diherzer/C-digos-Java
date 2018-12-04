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
public class Jogador {
    
    Tabuleiro tabuleiro = new Tabuleiro();
    Menu menu = new Menu();
    
    private int qtd;
    private int id;
    
    
    
    Jogador( int id_jogador){
    
    
    }
    
    public int getId(){
    
        return id;
    }
    
    //Método do jogador humano
    public void jogada(Tabuleiro tabuleiro, int linha, int coluna){
         boolean jogada = true;
      do{
         
        if(tabuleiro.getPosicao(linha,coluna) == null){
            tabuleiro.setPosicao(linha, coluna, "X");
            jogada = false;
            
        //Caso a posiçao inserida pelo jogador já  esteja  preenchida o mesmo é notificado  
        }else{
            System.out.println("Esta posição já foi preenchida ! Faça uma nova jogada");
        }
        
      }while(jogada);
    }
    
    
    //Método do jogador computador
    public  void jogada(Tabuleiro tabuleiro){
        boolean jogada = true;
      do{
        
        //Variaveis auxiliares 
        int coluna = menu.lerColuna();
        int linha = menu.lerLinha();
        
        //Caso a posiçao inserida pelo jogador esteja vazia a posição é preenchida
        if(tabuleiro.getPosicao(linha,coluna) == null){
            tabuleiro.setPosicao(linha, coluna, "O");
            jogada = false;
            
        //Caso a posiçao inserida pelo jogador já  esteja  preenchida o mesmo é notificado  
        }else{
            System.out.println("Esta posição já foi preenchida ! Faça uma nova jogada");
        }
      }while(jogada);     
    }
}



