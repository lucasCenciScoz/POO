package AutoCar;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int quantidadeRodas;
        String chassi;
        String marca;
        String tipo;

        System.out.println("quantidade de rodas:");
        quantidadeRodas = sc.nextInt();
        System.out.println("digite o numero do chassi:");
        chassi = sc.next();
        System.out.println("digite a marca do veiculo:");
        marca = sc.next();
        System.out.println("digite o tipo:");
        tipo = sc.next();

        Veiculo veiculo = new Veiculo(quantidadeRodas, chassi , marca , tipo );

        System.out.println(veiculo.toString());
    }
}
