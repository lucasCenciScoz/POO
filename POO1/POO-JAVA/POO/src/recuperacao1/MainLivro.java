package recuperacao1;

import java.util.Scanner;

public class MainLivro {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {

            String titulo;
            String autor;
            int ano;

            System.out.println("digite o titulo:");
            titulo = sc.next();
            System.out.println("digite o autor:");
            autor = sc.next();
            System.out.println("digite o ano:");
            ano = sc.nextInt();

            if (ano <= 1900){
                System.out.println("O ano deve ser maior que 1900");
            }else {
                Livro livro1 = new Livro(titulo, autor, ano);
                livro1.informacoes();
            }


            System.out.println("digite a titulo:");
            titulo = sc.next();
            System.out.println("digite a autor:");
            autor = sc.next();
            System.out.println("digite a ano:");
            ano = sc.nextInt();

            if (ano <= 1900){
                System.out.println("O ano deve ser maior que 1900");
            }else {
                Livro livro2 = new Livro(titulo, autor, ano);
                livro2.informacoes();
            }



            System.out.println("digite a titulo:");
            titulo = sc.next();
            System.out.println("digite a autor:");
            autor = sc.next();
            System.out.println("digite a ano:");
            ano = sc.nextInt();

            if (ano <= 1900){
                System.out.println("O ano deve ser maior que 1900");
            }else {
                Livro livro3 = new Livro(titulo, autor, ano);
                livro3.informacoes();
            }


        }
    }


