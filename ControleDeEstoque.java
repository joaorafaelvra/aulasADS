import java.util.Scanner;

public class ControleDeEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caneta = 101;
        int caderno = 102;
        int borracha = 103;

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        if (codigo == caneta) {
            System.out.println("Caneta");
            
        } else if (codigo == caderno) {
            System.out.println("Caderno");

        } else if (codigo == borracha) {
            System.out.println("Borracha");
            
        } else {
            System.out.println("Código do produto inválido");
        } 

            scanner.close();

    }
}