import java.util.Scanner;



public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora Simples");

        int opção;
        do {

            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.print("O que você deseja fazer ? (0 para sair:)");

            Scanner scanner = new Scanner(System.in);
            opção = scanner.nextInt();

            processar(opção);
        } while (opção != 0);
    }


    
    public static void processar(int opção) {
        switch (opção) {
            case 1: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("soma com dois numero");
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();
                int soma = numero1 + numero2;
                System.out.println("A soma é " + soma);
            }
                break;
            case 2: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("subtração com dois numero");
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();
                int soma = numero1 - numero2;
                System.out.println("A soma é " + soma);
            }
                break;
            case 3: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("multiplicação com dois numero");
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();
                int soma = numero1 * numero2;
                System.out.println("A soma é " + soma);

            }
                break;
            case 4: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("divisão com dois numero");
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();
                int soma = numero1 % numero2;
                System.out.println("A soma é " + soma);

            }

            default:
                break;
        }
    }

}
