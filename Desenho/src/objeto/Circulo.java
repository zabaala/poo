package objeto;
import java.util.Random;									//Importa a classe Random da biblioteca java.util

public class Circulo {										//Classe auxiliar 
	
	double raio = 0.0;										//Variável local raio
	String cor = "";										//Variável local cor
	
	public double getRaio() {								//Método que retorna o valor atribuído a variável raio 
		Random r = new Random();							//Instancia o objeto r do tipo Random e da classe Random
		double rv = 1 + (10 - 1) * r.nextDouble();			//Determina o intervalo de sorteio do valor e atribui a variável rv
	
		raio = rv;											//A variável raio recebe o valor da variável rv
		return raio;										//Retorna o valor atribuído a variável raio
	}
	
	public String getCor() {
		String[] cores = {"Amarelo", "Azul", "Branco", "Preto", "Verde", "Vermelho"};	//Lista de valores (array) para cor
		Random c = new Random();							//Instancia o objeto c do tipo Random e da classe Random
		int i = c.nextInt(6);								//Atribui um valor sorteado a variável i 
		cor = cores[i];										//Atribui um valor a variável cor existente na lista cores de índice i
		return cor;											//Retorna o valor da variável cor
	}
}
