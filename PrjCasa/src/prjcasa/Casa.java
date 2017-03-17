package prjcasa;

import prjporta.Porta;

public class Casa {
    public String pintura;
    public Porta porta1;
    public Porta porta2;
    
    public Casa(){
        this.pintura = "";
    }
    public void descreverCasa(){
        System.out.println("Pintura Externa: " + pintura);
        System.out.println("Tenho duas portas, descritas abaixo: ");
        this.porta1.descreverPorta();
        this.porta2.descreverPorta();
    }
}
