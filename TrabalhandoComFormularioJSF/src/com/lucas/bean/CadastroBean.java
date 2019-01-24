package com.lucas.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.lucas.model.Linguagem;

/*
 * 
 * Classe que cont�m as informa��es da tela de cadastro
 * 
 * */

@SuppressWarnings("serial")
@Named("cadastro")
@RequestScoped
public class CadastroBean implements Serializable{
	
	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private Character sexo;
	private Boolean receberEmails;
	private String observacoes;
	private Integer[] linguagens;
	
	//M�todo que retorna um array com as op��es de linguagem que v�o aparecer na tela
	public Linguagem[] getListaLinguagens() {
		return Linguagem.LINGUAGENS;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Boolean getReceberEmails() {
		return receberEmails;
	}
	public void setReceberEmails(Boolean receberEmails) {
		this.receberEmails = receberEmails;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	
	
	/*
	 * 
	 * M�todo que obt�m as linguagens escolhidas pelo usu�rio e as coloca em uma String
	 * separando-as por v�rgula
	 * 
	 * */ 
	public String getLinguagensAsString() {
		String str = "";
		boolean first = true;
		
		for(Integer linguagem : linguagens) {
			if(!first) {
				str += ", ";
			}
			str += linguagem; //Concatena��o de inteiro com String, casting impl�cito
			
			first = false;
		}
		return str;
	}
	
	
}
