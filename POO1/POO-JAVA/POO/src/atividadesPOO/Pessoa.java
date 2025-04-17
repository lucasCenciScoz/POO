package atividadesPOO;

 public class Pessoa {

    private String nome;
    private int idade;

    public  Pessoa(String nome, int idade) {
       this.nome = nome;
       this.idade = idade;
    }

    public Pessoa() {
    }

    public int getIdade() {
       return idade;
    }

    public void setIdade(int idade) {
       this.idade = idade;
    }

    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
    public void imprimirDados(){
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
    }
 }

