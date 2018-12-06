package controle;

import classificacao.*;												//Importa todas as classes do pacote classificacao

public class VozAnimal {											//Classe principal

	public static void main(String[] args) {
		Gato g = new Gato();										//Instancia o objeto g do tipo Gato da Classe Gato
		Cachorro c = new Cachorro();								//Instancia o objeto c do tipo Cachorro da Classe Cachorro
		Pato p = new Pato();										//Instancia o objeto p do tipo Pato da Classe Pato

		System.out.println("Voz do Gato: " + g.vozAnimal());		//Exibe a frase concatenada com o valor retornado pelo método vozAnimal
		System.out.println("Voz do Cachorro: " + c.vozAnimal());	//Exibe a frase concatenada com o valor retornado pelo método vozAnimal
		System.out.println("Voz do Pato: " + p.vozAnimal());		//Exibe a frase concatenada com o valor retornado pelo método vozAnimal
		
	}

}
