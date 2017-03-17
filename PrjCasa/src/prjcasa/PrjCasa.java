/*
 * Aulas professor Maromo.
 */
package prjcasa;

import prjporta.Porta;

/**
 *
 * @author maromo
 */
public class PrjCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casa casa1 = new Casa();
        Porta porta1 = new Porta(180, 100, 5);
        Porta porta2 = new Porta(177, 99, 4);
        casa1.pintura = "Verde e Amarelo";
        casa1.porta1 = porta1;
        casa1.porta2 = porta2;
        casa1.descreverCasa();
    }
    
}
