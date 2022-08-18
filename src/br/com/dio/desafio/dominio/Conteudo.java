package br.com.dio.desafio.dominio;

public abstract class Conteudo {									//essa classe-mãe não poderá ser instanciada por outras classes,
																	//sendo somente utilizada por suas classes-filhas utilizando o metodo XP
	
	protected static final double XP_PADRAO = 10d;  

	private String titulo;
	private String descricao;
	
	public abstract double calcularXP();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
