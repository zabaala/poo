package entidades;

public class Autor {								//Classe auxiliar Autor
	String nome = "";								//Vari�vel local nome que � um atributo da classe Autor
	String genero = "";								//Vari�vel local genero que � um atributo da classe Autor
	
	public String getNome() {						//M�todo da classe Autor que l� o dado da vari�vel local nome
		return nome;								//Retorna o valor da vari�vel nome
	}
	public void setNome(String nome) {				//M�todo da classe Autor que atribui um dado a vari�vel local nome
		this.nome = nome;							//Retorna o valor atribu�do a vari�vel nome
	}
	public String getGenero() {						//M�todo da classe Autor que l� o dado da vari�vel local genero
		return genero;								//Retorna o valor da vari�vel genero
	}
	public void setGenero(String genero) {			//M�todo da classe Autor que atribui um dado a vari�vel local genero
		this.genero = genero;						//Retorna o valor atribu�do a vari�vel genero
	}
}
