package br.edu.fatecpg.autenticavel.model;

public class SistemaDeSeguranca implements Autenticavel {
    private String loginCorreto = "admin";
    private String senhaCorreta = "1234";
    private boolean autenticado = false;

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals(loginCorreto) && senha.equals(senhaCorreta)) {
            setAutenticado(true);
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
            return false;
        }
    }

    @Override
    public void logout() {
        if (AutenticadoVdd()) {
            setAutenticado(false);
            System.out.println("Logout realizado com sucesso.");
        } else {
            System.out.println("Você não está autenticado.");
        }
    }

    public boolean AutenticadoVdd() {
        return autenticado;
    }

    private void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
