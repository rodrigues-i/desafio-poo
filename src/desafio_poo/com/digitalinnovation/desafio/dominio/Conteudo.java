package desafio_poo.com.digitalinnovation.desafio.dominio;

public abstract class Conteudo {

	protected final static double XP_PADRAO = 10;
	private String titulo;
	private String descricaao;
	
	public abstract double calcularTotalXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricaao;
	}

	public void setDescricaao(String descricaao) {
		this.descricaao = descricaao;
	}
}
