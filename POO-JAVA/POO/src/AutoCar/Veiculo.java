package AutoCar;

public class Veiculo{
    int quantidadeRodas;
    String chassi;
    String marca;
    String tipo;

    public Veiculo(int quantidadeRodas, String chassi, String marca, String tipo){
               this.quantidadeRodas = quantidadeRodas;
               this.chassi = chassi;
               this.marca = marca;
               this.tipo = tipo;

    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "\n quantidadeRodas=" + quantidadeRodas +
                "\n chassi='" + chassi + '\'' +
                "\n marca='" + marca + '\'' +
                "\n tipo='" + tipo + '\'' ;
    }
}

