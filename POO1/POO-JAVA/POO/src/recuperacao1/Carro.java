package recuperacao1;


public class Carro {
    private String modeloVeiulo;
    private String placa;
    private double quilometragem;

    public Carro(String modeloVeiulo, String placa, double quilometragem){
        this.modeloVeiulo = modeloVeiulo;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }
    public Carro(){

    }
    public String getModeloVeiulo() {
        return modeloVeiulo;
    }
    public void setModeloVeiulo(String modeloVeiulo){
        this.modeloVeiulo = modeloVeiulo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }
    public void dados(){
        System.out.println("modelo: " + modeloVeiulo);
        System.out.println("placa: " + placa);
        System.out.println("quilometragem: " + quilometragem);
    }
}
