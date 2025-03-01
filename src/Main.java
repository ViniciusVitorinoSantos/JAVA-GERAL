import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean op = true;
        while (op == true) {

            System.out.println(" Hello world! old programmer ");
            System.out.println(" let's test ArrayList ");
            System.out.print(" what is your name? : ");

            //Scanner entrada do teclado
            Scanner sc = new Scanner(System.in);
            String nome = sc.nextLine();
            System.out.println();

            //ArrayLis lista
            ArrayList<String> lista = new ArrayList<>();

            //Declarando os itens
            lista.add("maçã");
            lista.add("banana");
            lista.add("laranja");

            //Obetendo os itens
            String item = lista.get(0);
            String item2 = lista.get(1);
            String item3 = lista.get(2);

            //imprimindo os itens
            System.out.println(nome + " O primeiro item da sua lista é " + item);
            System.out.println(" O segundo item da sua lista é " + item2);
            System.out.println(" O terceiro item da sua lista é " + item3);
            System.out.println();

            //Tamano do ArrayList
            int tamanho = lista.size();
            System.out.println("A lista contém " + tamanho + " elementos");




            System.out.println();
            System.out.println("Gostaria de utilizar o programa novamente (s/n) ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                op = false;
            }
        }
    }
}
