package AtividadesWeb;
import java.util.Scanner;

public class JogoQuiz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nomeJogador;
        int pontos = 0;

        System.out.println("Em qual ano estamos?");
        String ano = entrada.nextLine();

        if (ano.equals("2023")){
            System.out.println("Acertou");
            pontos++;
            System.out.println("Quantidade de pontos: "+ pontos);
        }else{
            System.out.println("Errrouuu");
            System.out.println(pontos);
        }

    }
}
