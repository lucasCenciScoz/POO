package CalculadoraGeometrica;
import javax.swing.*;
import java.util.Scanner;
public class Main {
   static Scanner sc = new Scanner(System.in);
   int opc = 0;
    public static void main(String[] args) {
    System.out.println("Bem vindo ao sistema de formas geometricas");
    System.out.println("oque voce deseja calcular?");
    System.out.println("Opçoes: \n" + "1. Quadrado\n" + "2. Retangulo");
    int opc = sc.nextInt();

    switch (opc){
        case 1 :{
            System.out.println("Digite a cor do quadrado:");
            String cor = sc.next();
            System.out.println("digite o lado do quadrado:");
            double lado = sc.nextDouble();

            Quadrado quadrado = new Quadrado(cor ,lado);


            System.out.println("Perimetro:" + quadrado.calculaPerimetro());
            System.out.println("Area:" + quadrado.calcularArea());
            System.out.println("Volume:" + quadrado.calculaVolume());
            break;


        }
    }
    }
}
