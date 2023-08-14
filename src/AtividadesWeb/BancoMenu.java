package AtividadesWeb;

import AtividadesWeb.entities.Conta;

import java.util.Scanner;

public class BancoMenu {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        double ContaCarlos = 2400.00;
        int entrada;
        double ValorSaque, ValorDeposito;
        boolean menu;
        String nome;

        while (menu = true) {
            System.out.println("Escolha:" +
                    "\n 1- Sacar" +
                    "\n 2 - Depositar");
            entrada = escolha.nextInt();
            if (entrada == 1) {
                System.out.println("Qual o valor que deseja sacar?");
                ValorSaque = escolha.nextDouble();
                System.out.println("O seu saldo em conta é de RS" + (ContaCarlos - ValorSaque));
                ContaCarlos += ValorSaque;
            } else {
                System.out.println("Qual o valor que deseja depositar?");
                ValorDeposito = escolha.nextDouble();
                System.out.println("O seu saldo em conta é de RS" + (ContaCarlos + ValorDeposito));
            }
        }
    }
}
