package controle;
import entidades.*;												//Importa todas as classes do pacote entidades

public class AutorLivro {										//Classe principal

	public static void main(String[] args) { 					
		Livro l = new Livro();									//Instancia objeto l da classe Livro
		l.setObra("A Arte da Guerra", "Sun Tzu", "Ficção");		//Configura o objeto l com três atributos 
		String livro = l.getObra();								//Variável livro recebe dados dos atributos definidos no objeto l
		
		System.out.println(livro);								//Imprime na saída padrão a lista de dados da variável livro
	}

}
