package loja_de_doces.validacoes;

import java.util.Scanner;

public class Validacoes {
    public static int validarInteiro(Scanner scanner, String mensagem, int min, int max) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = Integer.parseInt(scanner.nextLine());
                if (valor < min || valor > max) {
                    System.out.println("Valor fora do intervalo permitido.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        return valor;
    }
}
