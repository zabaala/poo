package entidades;

public class Autor {								//Classe auxiliar Autor
	String nome = "";								//Variável local nome que é um atributo da classe Autor
	String genero = "";								//Variável local genero que é um atributo da classe Autor
	
	public String getNome() {						//Método da classe Autor que lê o dado da variável local nome
		return nome;								//Retorna o valor da variável nome
	}
	public void setNome(String nome) {				//Método da classe Autor que atribui um dado a variável local nome
		this.nome = nome;							//Retorna o valor atribuído a variável nome
	}
	public String getGenero() {						//Método da classe Autor que lê o dado da variável local genero
		return genero;								//Retorna o valor da variável genero
	}
	public void setGenero(String genero) {			//Método da classe Autor que atribui um dado a variável local genero
		this.genero = genero;						//Retorna o valor atribuído a variável genero
	}
}
