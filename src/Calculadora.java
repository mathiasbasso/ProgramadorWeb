import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x,y;
        int z;

        System.out.println("Entre com o primeiro valor:");
        x = entrada.nextDouble();

        System.out.println("Entre com o segundo valor");
        y = entrada.nextDouble();

        System.out.println("Escolha a operação:" +
                "\n 1 Adição" +
                "\n 2 Subtração" +
                "\n 3 Multiplicação" +
                "\n 4 Divisão");
        z = entrada.nextInt();
        switch (z){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
