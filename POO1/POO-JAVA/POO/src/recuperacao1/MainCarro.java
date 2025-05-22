package recuperacao1;

import java.util.Scanner;

public class MainCarro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String modeloVeiulo;
        String placa;
        double quilometragem;

        System.out.println("digite o modelo:");
        modeloVeiulo = sc.next();
        System.out.println("digite a placa:");
        placa = sc.next();
        System.out.println("digite a quilometragem:");
        quilometragem = sc.nextDouble();

        if (quilometragem < 0) {
            System.out.println("A quilometragem deve ser maior que 0");
        } else {
            Carro carro1 = new Carro(modeloVeiulo, placa, quilometragem);
            carro1.dados();
        }

        System.out.println("digite o modelo:");
        modeloVeiulo = sc.next();
        System.out.println("digite a placa:");
        placa = sc.next();
        System.out.println("digite a quilometragem:");
        quilometragem = sc.nextDouble();

        if (quilometragem < 0) {
            System.out.println("A quilometragem deve ser maior que 0");
        } else {
            Carro carro2 = new Carro(modeloVeiulo, placa, quilometragem);
            carro2.dados();
        }


    }
}