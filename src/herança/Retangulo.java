package herança;

public class Retangulo extends FormaGeometrica{
    private int base;
    private int altura;

    public Retangulo(){ }
    public Retangulo(String cor, String descricao, int base, int altura) {
    this.cor = cor;
    this. descricao = descricao;
    this.base = base;
    this.altura = altura;}

    public void identificar () {
        System.out.println("Eu sou um Retângulo");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição:" + this.descricao);
    }

    public int getBase() { return base; }
    public void setBase(int base) { this.base = base; }

    public int getAltura() { return this.altura; }
    public int setAltura(int altura) { return this.altura = altura; }
}
