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
public class JogoDaVelha {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Tabuleiro tabuleiro = new Tabuleiro();
		int linha, coluna, contador=0;
		Jogador jogador1;
		Jogador jogador2;
		boolean vitoriaX=false, vitoriaO=false;

    	//Identifica o jogador 1 como humano ( usando id 1 )
		jogador1 = new Jogador(1);
		jogador2 = new Jogador(2);

		//Impressão inicial para começar o jogo
		menu.imprimeTabuleiro(tabuleiro);
                
               
                
		do{
                        //Anuncia a vez do jogador 1
                        System.out.println("jogador 1 é a sua vez. Faça a sua jogada! ");
			//Faz a jogada do primeiro jogador, considerando o método para usuário humano
			jogador1.jogada(tabuleiro, menu.lerLinha(), menu.lerColuna());
			//contabiliza a jogada com sucesso, visto que os métodos já garantem que a jogada sempre acontecerá com sucesso
			contador++;
			//Imprime o tabuleiro para o usuário ver a situação atual
			menu.imprimeTabuleiro(tabuleiro);
			//Verifica se alguém venceu
			vitoriaX = tabuleiro.verificaVitoria("X");
			vitoriaO = tabuleiro.verificaVitoria("O");
			//Caso ngm tenha vencido ainda e não tenha acabado as jogadas, o segundo jogador joga.
			if(vitoriaX == false && vitoriaO == false && contador < 9){
				//Faz a jogada do primeiro jogador, considerando o método para usuário computador
                                //Anuncia a vez do jogador 2
                                System.out.println("jogador 2 é a sua vez.  Faça a sua jogada! ");
				jogador2.jogada(tabuleiro);
				//contabiliza a jogada com sucesso, visto que os métodos já garantem que a jogada sempre acontecerá com sucesso
				contador++;
				//Imprime o tabuleiro para o usuário ver a situação atual
				menu.imprimeTabuleiro(tabuleiro);	
				//Verifica se alguém venceu		
				vitoriaX = tabuleiro.verificaVitoria("X");
				vitoriaO = tabuleiro.verificaVitoria("O");
			}
			//Repete a estrutura enquanto ngm vencer e houver jogadas disponíveis.
		}while(vitoriaX == false && vitoriaO == false && contador < 9);

		//Verifica se o jogador 1 ganhou
		if (vitoriaX) {
			System.out.println("Vitória do jogador X");
		}else{
			//Verifica se o jogador 2 ganhou
			if (vitoriaO) {
				System.out.println("Vitória do jogador O");
			}else{
				//Verifica se deu velha
				System.out.println("Deu velha!");
			}
		}
             }   
	
}

