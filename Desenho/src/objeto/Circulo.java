package objeto;
import java.util.Random;									//Importa a classe Random da biblioteca java.util

public class Circulo {										//Classe auxiliar 
	
	double raio = 0.0;										//Vari�vel local raio
	String cor = "";										//Vari�vel local cor
	
	public double getRaio() {								//M�todo que retorna o valor atribu�do a vari�vel raio 
		Random r = new Random();							//Instancia o objeto r do tipo Random e da classe Random
		double rv = 1 + (10 - 1) * r.nextDouble();			//Determina o intervalo de sorteio do valor e atribui a vari�vel rv
	
		raio = rv;											//A vari�vel raio recebe o valor da vari�vel rv
		return raio;										//Retorna o valor atribu�do a vari�vel raio
	}
	
	public String getCor() {
		String[] cores = {"Amarelo", "Azul", "Branco", "Preto", "Verde", "Vermelho"};	//Lista de valores (array) para cor
		Random c = new Random();							//Instancia o objeto c do tipo Random e da classe Random
		int i = c.nextInt(6);								//Atribui um valor sorteado a vari�vel i 
		cor = cores[i];										//Atribui um valor a vari�vel cor existente na lista cores de �ndice i
		return cor;											//Retorna o valor da vari�vel cor
	}
}
