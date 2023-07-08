import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        Scanner Scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Calculadora Simples");
        System.out.println("___________________");
        System.out.println("(1) Soma");
        System.out.println("(2) Subtracao");
        System.out.println("(3) Divisao");
        System.out.println("(4) Multiplicacao");
        System.out.println("___________________");
        System.out.println("(0) Sair");
        System.out.println();

        Calculator calc = new Calculator();
        int n1, n2 = 0;
        int choice = Scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Digitar primeiro numero:");
                n1 = Scanner.nextInt();

                System.out.println("Digitar segundo numero:");
                n2 = Scanner.nextInt();
                calc.soma(n1, n2);
                menu();
                break;

            case 2:
                System.out.println("Digitar primeiro numero:");
                n1 = Scanner.nextInt();

                System.out.println("Digitar segundo numero:");
                n2 = Scanner.nextInt();
                calc.subtracao(n1, n2);
                menu();
                break;

            case 3:
                System.out.println("Digitar primeiro numero:");
                n1 = Scanner.nextInt();

                System.out.println("Digitar segundo numero:");
                n2 = Scanner.nextInt();
                calc.divisao(n1, n2);
                menu();
                break;

            case 4:
                System.out.println("Digitar primeiro numero:");
                n1 = Scanner.nextInt();

                System.out.println("Digitar segundo numero:");
                n2 = Scanner.nextInt();
                calc.multiplicacao(n1, n2);
                menu();
                break;

            case 0:
            default:
                Scanner.close();
                System.out.println("Obrigado por usar");
                System.exit(0);
                break;
        }
    }
}
