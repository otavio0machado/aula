import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private boolean executando;

    public App() {
        this.scanner = new Scanner(System.in);
        this.executando = true;
    }

    public void executar() {
        while (executando) {
            mostrarMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();
            executarOpcao(opcao);
        }

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n=== Catálogo de Itens Colecionáveis ===");
        System.out.println("1) Adicionar item");
        System.out.println("2) Listar itens");
        System.out.println("3) Buscar item por identificação");
        System.out.println("4) Pesquisar por assunto");
        System.out.println("0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                adicionarObjeto();
                break;
            case 2:
                listarColecionaveis();
                break;
            case 3:
                consultarItemPorId();
                break;
            case 4:
                buscarItem();
                break;
            case 0:
                sair();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void adicionarObjeto() {
        System.out.println("\nQual tipo do item que você deseja adicionar?");
        System.out.println("1) Livro");
        System.out.println("2) CDs");
        System.out.println("3) DVDs");
        System.out.println("4) Revistas");
        System.out.print("Escolha o tipo: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Tipo inválido.");
            scanner.nextLine();
            return;
        }

        int tipo = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Cadastro de Livro em desenvolvimento.");
                break;
            case 2:
                System.out.println("Cadastro de CD em desenvolvimento.");
                break;
            case 3:
                System.out.println("Cadastro de DVD em desenvolvimento.");
                break;
            case 4:
                System.out.println("Cadastro de Revista em desenvolvimento.");
                break;
            default:
                System.out.println("Tipo inválido!");
                break;
        }
    }

    private void listarColecionaveis() {
        System.out.println("Listagem de colecionáveis em desenvolvimento.");
    }

    private void consultarItemPorId() {
        System.out.println("Consulta por identificação em desenvolvimento.");
    }

    private void buscarItem() {
        System.out.println("Pesquisa por assunto em desenvolvimento.");
    }

    private void sair() {
        executando = false;
        System.out.println("Sistema encerrado.");
    }
}
