package classes;
public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(){
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getLargura(){
        return this.largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double calcularArea(){
        return this.altura * this.largura;
    }

    public boolean isQuadrado(){
        if(this.altura == this.largura){
            return true;
        }
        return false;
    }


}