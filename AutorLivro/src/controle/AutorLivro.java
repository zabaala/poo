package controle;
import entidades.*;												//Importa todas as classes do pacote entidades

public class AutorLivro {										//Classe principal

	public static void main(String[] args) { 					
		Livro l = new Livro();									//Instancia objeto l da classe Livro
		l.setObra("A Arte da Guerra", "Sun Tzu", "Fic��o");		//Configura o objeto l com tr�s atributos 
		String livro = l.getObra();								//Vari�vel livro recebe dados dos atributos definidos no objeto l
		
		System.out.println(livro);								//Imprime na sa�da padr�o a lista de dados da vari�vel livro
	}

}
