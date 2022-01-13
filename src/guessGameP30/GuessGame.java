package guessGameP30;

import java.util.Scanner;

public class GuessGame {
	Player p1;
	Player p2;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		
		int p1Guess, p2Guess;
		boolean p1Rigth = false;
		boolean p2Rigth = false;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite o número entre 0 e 9 do jogador 1: ");
			p1.number = scanner.nextInt();
			System.out.println("Digite o número entre 0 e 9 do jogador 2: ");
			p2.number = scanner.nextInt();
		
			int randomNumber = (int)(Math.random() * 10);
			System.out.println("Escolhendo um número entre 0 e 9...");
		
			System.out.println("O número a adivinhar é: "+randomNumber);
			
			p1Guess = p1.number;
			p1.printGuess();
			p2Guess = p2.number;
			p2.printGuess();
			
			
			if(p1Guess == randomNumber) {
				p1Rigth = true;
			}
			if(p2Guess == randomNumber) {
				p2Rigth = true;
			}
			if(p1Rigth || p2Rigth) {
				 
				System.out.println("Temos um vencedor!");
				System.out.println("O jogador 1 acertou? "+p1Rigth);
				System.out.println("O jogador 2 acertou? "+p2Rigth);
				System.out.println("Fim de jogo.");
				break;
			}else {
				System.out.println("Não temos vencedor, vamos continuar!");
				
			}
			
	    }while((p1Rigth && p2Rigth) == false);
		
		scanner.close();
	  }
}




