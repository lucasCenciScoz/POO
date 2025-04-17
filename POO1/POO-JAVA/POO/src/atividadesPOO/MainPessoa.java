package atividadesPOO;
import java.util.Scanner;

public class MainPessoa {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int idade;
        String nome;


        System.out.println("digite a idade:");
        idade = sc.nextInt();
        System.out.println("digite o nome:");
        nome = sc.next();


        Pessoa pessoa1 = new Pessoa(nome ,idade );

        System.out.println("digite a idade:");
        idade = sc.nextInt();
        System.out.println("digite o nome:");
        nome = sc.next();

        Pessoa pessoa2 = new Pessoa(nome ,idade );

        pessoa1.imprimirDados();
        pessoa2.imprimirDados();




}
}

