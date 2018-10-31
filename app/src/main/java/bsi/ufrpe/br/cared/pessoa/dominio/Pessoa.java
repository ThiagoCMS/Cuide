package bsi.ufrpe.br.cared.pessoa.dominio;

import bsi.ufrpe.br.cared.usuario.dominio.Usuario;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String userId;

    public Pessoa(){}

    public Pessoa(String nome, String cpf, Usuario usuario, String telefone, String userId) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.userId = userId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}