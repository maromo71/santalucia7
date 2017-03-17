package prjporta;

public class Porta {
    public int alt;
    public int lar;
    public int prof;
    public String cor;
    
    public Porta(int alt, int lar, int prof){
        this.alt = alt;
        this.lar = lar;
        this.prof =prof;
        this.cor = "Azul";
    }
    
    public void descreverPorta(){
        System.out.println("Dados da porta");
        System.out.println("Prof.: " + prof);
        System.out.println("Largura: " + lar);
        System.out.println("Altura: " + alt);
        System.out.println("");
    }
    
    
}
