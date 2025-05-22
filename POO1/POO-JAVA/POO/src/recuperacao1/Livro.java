package recuperacao1;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public Livro(){

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void informacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}


