package br.edu.fatecpg.autenticavel.model;

public interface Autenticavel {
    boolean login(String usuario, String senha);
    void logout();
}