package eudora.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the medico database table.
 * 
 */
@Getter
@Setter

public class Usuario  extends BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;
private Long id;

	private String cidade;

	private String cpf;

	private String crm;

	private Date dtNascimento;

	private String estado;

	private String nome;
	private String sobrenome;
	private String login;
	private String senha;
	private String email;
	private boolean is_medico;

	

	public Usuario() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCrm() {
		return this.crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}