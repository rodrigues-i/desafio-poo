package desafio_poo.com.digitalinnovation.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	@Override
	public double calcularTotalXp() {
		return XP_PADRAO + 20;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

}
