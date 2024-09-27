package br.edu.fatecpg.autenticavel.view;

import br.edu.fatecpg.autenticavel.model.SistemaDeSeguranca;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();
        Scanner scanner = new Scanner(System.in);

        // Loop de autenticação
        while (!sistema.AutenticadoVdd()) {
            System.out.println("Digite seu nome de usuário:");
            String usuario = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String senha = scanner.nextLine();

            sistema.login(usuario, senha);
        }

        System.out.println("Deseja fazer logout? (sim/não)");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            sistema.logout();
        }

        scanner.close();
    }
}
