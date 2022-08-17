package br.sapiens.modelo;

import javafx.beans.property.SimpleStringProperty;

public class Pessoa {
    private final SimpleStringProperty nome;
    private final SimpleStringProperty  sobreNome;
    private final SimpleStringProperty  email;

    public Pessoa(String nome, String sobreNome, String email) {
        this.nome = new SimpleStringProperty(nome);
        this.sobreNome = new SimpleStringProperty(sobreNome);
        this.email = new SimpleStringProperty(email);
    }

    public String getNome() {
        return nome.get();
    }

    public String getSobreNome() {
        return sobreNome.get();
    }

    public String getEmail() {
        return email.get();
    }

    @Override
    public String toString() {
        return getNome()+" "+getSobreNome();
    }
}