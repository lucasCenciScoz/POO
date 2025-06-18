package CalculadoraGeometrica;

abstract public class FormaGeometrica {
    private String cor;


    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    public FormaGeometrica() {

    }



    public abstract double calculaPerimetro();

    public abstract double calcularArea();


    public abstract double calculaVolume();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
