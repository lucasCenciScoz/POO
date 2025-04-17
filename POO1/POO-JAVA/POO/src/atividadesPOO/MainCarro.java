package atividadesPOO;
import java.util.Scanner;

public class MainCarro {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String marca;
        String modelo;
        int ano;

        System.out.println("digite a marca:");
        marca = sc.next();
        System.out.println("digite a modelo:");
        modelo = sc.next();
        System.out.println("digite a ano:");
        ano = sc.nextInt();

        Carro  carro1 = new Carro(marca, modelo, ano);

        System.out.println("digite a marca:");
        marca = sc.next();
        System.out.println("digite a modelo:");
        modelo = sc.next();
        System.out.println("digite a ano:");
        ano = sc.nextInt();

        Carro carro2 = new Carro(marca, modelo, ano);


        System.out.println("digite a marca:");
        marca = sc.next();
        System.out.println("digite a modelo:");
        modelo = sc.next();
        System.out.println("digite a ano:");
        ano = sc.nextInt();

        Carro carro3 = new Carro(marca, modelo, ano);
        carro1.informacoes();
        carro2.informacoes();
        carro3.informacoes();
    }
}
