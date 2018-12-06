package entidades;

public class Livro {														//Classe auxiliar Livro
	String obra = "";														//Variável local obra que é um atributo da classe Livro
	Autor nome_autor;														//Variável local nome_autor que é um atributo da classe Livro e que herda características dos atributos pertencentes a classe Autor
	
	public String getObra() {												//Método da classe Livro que lê o dado da variável local obra
		
		//Retorna o valor da variável obra utilizando também os valores gravados nos atributos nome e genero da variável nome_autor do tipo Autor
		return "Obra: " + obra + "\nAutor: " + nome_autor.getNome() + "\nGênero: " + nome_autor.getGenero(); 
	}
	
	public void setObra(String obra, String nome, String genero) {			//Método da classe Livro que atribui dados nas variáveis obra, nome e genero
		nome_autor = new Autor();											//Instancia objeto nome_autor da classe Autor
		nome_autor.setNome(nome);											//Atribui um dado a variável nome
		nome_autor.setGenero(genero);										//Atribui um dado a variável genero
		this.obra = obra;													//Retorna o valor atribuido na variável local obra
	}
}
