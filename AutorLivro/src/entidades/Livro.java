package entidades;

public class Livro {														//Classe auxiliar Livro
	String obra = "";														//Vari�vel local obra que � um atributo da classe Livro
	Autor nome_autor;														//Vari�vel local nome_autor que � um atributo da classe Livro e que herda caracter�sticas dos atributos pertencentes a classe Autor
	
	public String getObra() {												//M�todo da classe Livro que l� o dado da vari�vel local obra
		
		//Retorna o valor da vari�vel obra utilizando tamb�m os valores gravados nos atributos nome e genero da vari�vel nome_autor do tipo Autor
		return "Obra: " + obra + "\nAutor: " + nome_autor.getNome() + "\nG�nero: " + nome_autor.getGenero(); 
	}
	
	public void setObra(String obra, String nome, String genero) {			//M�todo da classe Livro que atribui dados nas vari�veis obra, nome e genero
		nome_autor = new Autor();											//Instancia objeto nome_autor da classe Autor
		nome_autor.setNome(nome);											//Atribui um dado a vari�vel nome
		nome_autor.setGenero(genero);										//Atribui um dado a vari�vel genero
		this.obra = obra;													//Retorna o valor atribuido na vari�vel local obra
	}
}
