package javabasico;

/*
 * Atividade 8. Do seguinte String “A chuva em Lisboa é uma maravilha” conta quantas vogais existem ao todo (percorre o String com charAt).
 */

public class Atividade8 {

	public static void main(String[] args) {
		
		String s = "A chuva em Lisboa e uma maravilha";
		
		int counter = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' || Character.toLowerCase(s.charAt(i)) == 'i' ||
				Character.toLowerCase(s.charAt(i)) == 'o' || Character.toLowerCase(s.charAt(i)) == 'u') ++counter;
		}
		System.out.println("Ha " + counter + " vogais");
	}
}