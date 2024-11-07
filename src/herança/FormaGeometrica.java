package herança;

public class FormaGeometrica {
    protected String cor;
    protected String descricao;

    public FormaGeometrica(){};

    public FormaGeometrica(String cor, String descricao){
        this.cor = cor;
        this.descricao = descricao;
    }

    public void identificar(){
        System.out.printf("\nEu sou uma Forma Geometrica");
        System.out.printf("\nMinha cor é: " +this.cor);
        System.out.printf("\nMinha descrição: " +this.descricao);
    }

    public String getCor(){return this.cor;}
    public String setCor(String cor){ return this.cor = cor;}

    public String getDescricao(){return this.descricao;}
    public String setDescricao(String descricao){ return this.descricao = descricao;}

}
