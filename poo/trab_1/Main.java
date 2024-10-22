import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReservas sistema = new SistemaReservas();
        int opcao;

        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Adicionar Novo Hotel");
            System.out.println("2. Listar Todos os Hotéis");
            System.out.println("3. Adicionar Quarto a um Hotel");
            System.out.println("4. Listar Quartos Disponíveis em um Hotel");
            System.out.println("5. Fazer Reserva");
            System.out.println("6. Cancelar Reserva");
            System.out.println("7. Listar Reservas de um Cliente");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nInsira o nome do hotel");
                    String nome = scanner.next();
                    
                    System.out.println("\nInsira o endereco do hotel");
                    String endereco = scanner.next();

                    sistema.adicionarHotel(nome, endereco);

                    break;
                case 2:
                    System.out.println("\n"+sistema.listarHoteis()); 
                    break;
                case 3:
                    System.out.println("\nInsira o nome do hotel");
                    String nomeHotel = scanner.next();

                    System.out.println("\nInsira o numero do quarto");
                    String numeroQuarto = scanner.next();

                    System.out.println("\nInsira o tipo do quarto");
                    String tipoQuarto = scanner.next();

                    System.out.println("\nInsira o valor do quarto");
                    float preco = scanner.nextFloat();

                    sistema.adicionarQuarto(nomeHotel, numeroQuarto, tipoQuarto, preco);

                    break;
                case 4:
                    System.out.println("\nInsira o nome do hotel");
                    String nomeHotel2 = scanner.next();

                    System.out.println("\n"+sistema.listarQuartosDisponiveis(nomeHotel2));

                    break;
                /* case 5:
                    sistema.fazerReserva();
                    break;
                case 6:
                    sistema.cancelarReserva();
                    break;
                case 7:
                    sistema.listarReservasCliente();
                    break; */
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 8);

        scanner.close();
    }
}