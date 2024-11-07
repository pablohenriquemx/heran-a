package herança;

public class App {
    public static void main(String[] args){
        FormaGeometrica fg = new FormaGeometrica("Azul", "Sou uma forma abstrata");
        fg.identificar();
        System.out.println("\n_______________________________\n");

        Circulo c = new Circulo("Amarelo", "Sou uma bola", 15);
        c.identificar();
        System.out.println("\n______________________________\n");

        Retangulo r = new Retangulo("Roxo", "Sou retangular", 10, 5);
        r.identificar();
        System.out.println("\n______________________________\n");

        Quadrado q = new Quadrado(14, "Sou quadradão", "cinza");
        q.identificar();
        System.out.println("\n______________________________\n");

    }
}
