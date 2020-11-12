import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("Bem vindo ao sistema de To-Do list");

        List<String> categorias = new ArrayList();

        boolean continua = true;
        while (continua) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoDoUsuario();

            switch(valorDecisao)  {
                case "1": {
                    System.out.println("Digite o nome da categoria sem espaços");
                    Scanner scanNomeCategoria = new Scanner(System.in);
                    String nomeCategoria = scanNomeCategoria.next();

                    categorias.add(nomeCategoria);
                    break;
                }
                case "2": {
                    for (String nome: categorias) {
                        System.out.println("Nome da categoria: " + nome);
                    }
                    break;
                }
                case "3": {
                    System.out.println("Digite o número da categoria a ser removida");
                    Scanner scanItemRemover = new Scanner(System.in);
                    String itemRemover = scanItemRemover.next();
                    Integer x = Integer.valueOf(itemRemover);

                    categorias.remove(x - 1);
                    break;
                }
                case "0": {
                    System.exit(0);
                }
                default: {
                    System.out.println("Opção Inválida!");
                    break;
                }
            }
        }
    }
}
