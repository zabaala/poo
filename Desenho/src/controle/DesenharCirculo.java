package controle;
import objeto.Circulo;										//Importa a classe Circulo do pacote objeto

public class DesenharCirculo {								//Classe principal

	public static void main(String[] args) {				
		System.out.println("Círculo");						//Exibe a palavra Círculo na saída padrão (console)
		
		Circulo c = new Circulo();							//Instancia o objeto c da classe Circulo
		
		System.out.printf("Raio: %2.2f \n", c.getRaio());	//Exibe Raio: e o valor formatado do mesmo fracionado com duas casas decimais após a vírgula na saída padrão (console)
		System.out.println("Cor: " + c.getCor());			//Exibe Cor: e o valor atribuido a mesma na saída padrão (console)
		
	}

}
