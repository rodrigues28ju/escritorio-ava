package model;

import java.util.Date;

public class Cliente {
	private int idcliente;
	private Date data;
	private String nome;
	private String telefone;
	private String status;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idcliente, Date data, String nome, String telefone, String status) {
		super();
		this.idcliente = idcliente;
		this.data = data;
		this.nome = nome;
		this.telefone = telefone;
		this.status = status;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
