package loja_de_doces.app;

import loja_de_doces.model.Clientes;
import loja_de_doces.model.Funcionarios;
import loja_de_doces.model.Estoque;
import loja_de_doces.validacoes.Validacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Clientes> clientes = new ArrayList<>();
    private static final List<Funcionarios> funcionarios = new ArrayList<>();
    private static final List<Estoque> estoque = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;
        inicializarEstoque();

        while (executando) {
            exibirMenu();
            int opcao = Validacoes.validarInteiro(scanner, "Escolha uma opção: ", 0, 5);

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> atualizarEstoque();
                case 3 -> removerProduto();
                case 4 -> buscarPorNome();
                case 5 -> listarTodos();
                case 0 -> {
                    executando = false;
                    System.out.println("Finalizando o programa. Até mais!");
                }
                default -> System.out.println("Opção inválida. Por favor, tente novamente.");
            }

            if (executando) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n MENU LOJA DE DOCES ");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Atualizar Estoque");
        System.out.println("3 - Remover Produto");
        System.out.println("4 - Buscar Produto por Nome");
        System.out.println("5 - Listar Todos os Produtos");
        System.out.println("0 - Sair");
    }

    private static void inicializarEstoque() {
        estoque.add(new Estoque(new Doces(1, "Brigadeiro", 2, "Chocolate"), 50));
        estoque.add(new Estoque(new Doces(2, "Beijinho", 2, "Coco"), 40));
    }

    private static void cadastrarProduto() {
        int id = estoque.size() + 1;
        System.out.print("Nome do doce: ");
        String nome = scanner.nextLine();
        int valor = Validacoes.validarInteiro(scanner, "Preço: ", 1, 100);
        System.out.print("Sabor: ");
        String sabor = scanner.nextLine();
        int quantidade = Validacoes.validarInteiro(scanner, "Quantidade: ", 1, 1000);

        Doces novoDoce = new Doces(id, nome, valor, sabor);
        estoque.add(new Estoque(novoDoce, quantidade));

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void atualizarEstoque() {
        System.out.print("Digite o nome do produto a atualizar: ");
        String nome = scanner.nextLine();

        for (Estoque e : estoque) {
            if (e.getProduto().getNomeDoces().equalsIgnoreCase(nome)) {
                int novaQuantidade = Validacoes.validarInteiro(scanner, "Nova quantidade: ", 0, 10000);
                e.setQuantidade(novaQuantidade);
                System.out.println("Estoque atualizado.");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    private static void removerProduto() {
        System.out.print("Digite o nome do produto a remover: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getProduto().getNomeDoces().equalsIgnoreCase(nome)) {
                estoque.remove(i);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    private static void buscarPorNome() {
        System.out.print("Digite o nome do produto para buscar: ");
        String nome = scanner.nextLine();

        for (Estoque e : estoque) {
            if (e.getProduto().getNomeDoces().equalsIgnoreCase(nome)) {
                System.out.printf("Produto: %s | Preço: R$%d | Sabor: %s | Quantidade: %d\n",
                        e.getProduto().getNomeDoces(),
                        e.getProduto().getValor(),
                        e.getProduto().getSabor(),
                        e.getQuantidade());
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    private static void listarTodos() {
        System.out.println("\n=== Produtos no Estoque ===");
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Estoque e : estoque) {
                System.out.printf("ID: %d | Produto: %s | Preço: R$%d | Sabor: %s | Quantidade: %d\n",
                        e.getProduto().getId(),
                        e.getProduto().getNomeDoces(),
                        e.getProduto().getValor(),
                        e.getProduto().getSabor(),
                        e.getQuantidade());
            }
        }
    }
}
