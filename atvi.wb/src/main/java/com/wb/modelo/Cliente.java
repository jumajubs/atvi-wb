package com.wb.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String nome;
	public String nomeSocial;
	private CPF cpf;
	private List<RG> rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<ProdConsumido> produtosConsumidos;
	private List<ServConsumido> servicosConsumidos;
	private String genero;
	
	public Cliente(String nome, String nomeSocial, CPF cpf, String genero) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.rgs = new ArrayList<RG>();
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<Telefone>();
		this.produtosConsumidos = new ArrayList<ProdConsumido>();
		this.servicosConsumidos = new ArrayList<ServConsumido>();
		this.genero = genero;
	}
	public CPF getCpf() {
		return cpf;
	}
	public List<RG> getRgs() {
		return rgs;
	}
	public void setRgs(List<RG> rgs) {
		this.rgs = rgs;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public List<ProdConsumido> getProdutosConsumidos() {
		return produtosConsumidos;
	}
	public List<ServConsumido> getServicosConsumidos() {
		return servicosConsumidos;
	}
	public String getGenero() {
		return genero;
	}
}