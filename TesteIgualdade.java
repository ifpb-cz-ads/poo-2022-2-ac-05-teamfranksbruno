package TesteIgualdade;

public class TesteIgualdade {
public static void main(String[] args) {
	String frase1 = "Testando!";
	String frase2 = "Testando!";
	//True
	String fraseTeste1 = new String("Testando a frase!");
	String fraseTeste2 = new String("Tesntando a frase!");
	//False
	//Pois quando se chama o objeto, ele é alocado em outro espaço de memoria
	
	System.out.println("As frases são iguais: R: " + (frase1==frase2));
	System.out.println("As frases são iguais? R: " + (fraseTeste1==fraseTeste2));
}
}
