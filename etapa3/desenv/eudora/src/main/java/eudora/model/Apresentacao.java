package eudora.model;

import java.io.Serializable;


/**
 * The persistent class for the apresentacao database table.
 * 
 */
public class Apresentacao extends BaseModel implements Serializable, Comparable<Apresentacao> {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String descricao;

	public Apresentacao() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int compareTo(Apresentacao o) {

		return this.descricao.compareTo(o.descricao);
	}

}