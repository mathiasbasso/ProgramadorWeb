import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        double x, y, z;

        System.out.println("Entre com um lado: ");
        x = escolha.nextDouble();
        System.out.println("Entre com o segundo lado: ");
        y = escolha.nextDouble();
        System.out.println("Entre com o terceiro lado:");
        z = escolha.nextDouble();

        if (x==y && x==z){
            System.out.println("Equilátero");
        }else if (x!= y || x!=z){
            System.out.println("Isoceles");
        }else if (x!=y && x!=z){
            System.out.println("Escaleno");
        }
    }
}
