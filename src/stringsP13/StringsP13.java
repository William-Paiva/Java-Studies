package stringsP13;

import java.util.Scanner;

//Brincando com nomes, defeitos e qualidades!

public class StringsP13 {

	public static void main(String[] args) {
		String [] wordListName = new String[5];
		String [] wordListQualities = new String[5];
		String [] wordListDefects = new String[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0, j=1; i<5 && j<6;i++, j++) {
			System.out.println("Digite o "+j+"º nome: ");
			wordListName[i] = scanner.nextLine();
			System.out.println("Digite a "+j+"ª qualidade: ");
			wordListQualities[i] = scanner.nextLine();
			System.out.println("Digite a "+j+"º defeito: ");
			wordListDefects[i] = scanner.nextLine();
		}
		
		int nameLength = wordListName.length;
		int qualitiesLength = wordListQualities.length;
		int defectsLenght = wordListDefects.length;
		
		int i=0;
		
		while(i<5) {
		int randomName = (int) (Math.random()*nameLength);
		int randomQualities = (int) (Math.random()*qualitiesLength);
		int randomDefects = (int) (Math.random()* defectsLenght);
		
		System.out.println(wordListName[randomName]+" é "+wordListQualities[randomQualities]+", porém é "+wordListDefects[randomDefects]+"." );
		i++;
		}	
			
		scanner.close();

	}

}
