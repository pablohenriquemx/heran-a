package herança;

public class Quadrado extends FormaGeometrica{
    private int lado;

    public Quadrado(){}
    public Quadrado(int lado, String descricao, String cor){
        this.lado = lado;
        this.descricao = descricao;
        this.cor = cor;
    }

    public void identificar(){
        System.out.printf("\nEu sou um Quadrado");
        System.out.printf("\nMinha cor é:"+this.cor);
        System.out.printf("\nMinha descricao: "+this.descricao);
    }

    public int getLado(){return this.lado;}
    public int setLado(int lado){return this.lado = lado;}
}
