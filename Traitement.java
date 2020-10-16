package TPNote1;

import java.lang.*;
import java.util.*;
/**
 *
 * @author antoine
 */
public class Traitement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Architecte archi1 = new Architecte("Lelong","Antoine","conseil",true,"06.95.75.94.54","12","boulevard gambetta","colombre","92 700","73 Boulevard de Valmy","6 rue de Sorbier","44701");
        
        System.out.println("Utilisation de la fonction toString dans la classe : Architecte:");
        System.out.println(archi1.toString());
        
        
        System.out.println("\nUtilisation de setTelephone avec en entrer 06.78.12.65.32 puis utilisation de getTelephone :");
        archi1.setTelephone("06.78.12.65.32");
        System.out.println(archi1.getTelephone());
        
        System.out.println("\nUtilisation de setTelephone avec en entrer 0678126532 puis utilisation de getTelephone :");
        archi1.setTelephone("0678126532");
        System.out.println(archi1.getTelephone());
        
        Deposant depo1 = new Deposant("Lelong","Antoine","Français","antoinelelong2001@gmail.com","12","boulevard gambetta","colombre","92 700","73 Boulevard de Valmy","6 rue de Sorbier","44701");
        System.out.println("\nUtilisation de la fonction toString dans la classe : Deposant:");
        System.out.println(depo1.toString());
    }
    
}
