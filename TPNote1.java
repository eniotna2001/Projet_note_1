package TPNote1;
/**
 *
 * @author antoine
 */

class Personne{
    protected String nom;
    protected String prenom;
    
    public Personne(String nom , String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    private String validate (String chaine, Integer taille){
        if (chaine.length()>taille){
            chaine = chaine.substring(0,taille);
        }
        return chaine;
    }
        
    public String toString() {return this.nom + " " + this.prenom; }
}

class Addresse{
    private String numero;
    private String voie;
    private String ville;
    private String codePostal;
    private String bp;
    private String lieuDit;
    private String cedex;
    
    public String[] Addresse(){
        String[] tab= new String[7];
        tab[0] = this.numero;
        tab[1] = this.voie;
        tab[2] = this.ville;
        tab[3] = this.codePostal;
        tab[4] = this.bp;
        tab[5] = this.lieuDit;
        tab[6] = this.cedex;
        return tab;
}
    
    public Addresse(String numero,String voie,String ville,String codePostal,String bp,String lieuDit,String cedex){
        this.numero = numero;
        this.voie = voie;
        this.ville = ville;
        this.codePostal = codePostal;
        this.bp = bp;
        this.lieuDit = lieuDit;
        this.cedex = cedex;
    }
    
    private String validate (String chaine, Integer taille){
        if (chaine.length()>taille){
            chaine = chaine.substring(0,taille);
        }
        return chaine;
    }
}


class Architecte extends Personne{
    private String conseilRegional;
    private boolean inscriptionOrdre;
    private String telephone;
    private String[] addresse;
    
    private String numero;
    private String voie;
    private String ville;
    private String codePostal;
    private String bp;
    private String lieuDit;
    private String cedex;
    
    
    public Architecte(String nom,String prenom,String conseilRegional, boolean inscriptionOrdre, String telephone, String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex){
        super(nom,prenom);
        this.conseilRegional = conseilRegional;
        this.inscriptionOrdre = inscriptionOrdre;
        this.telephone = telephone;
        Addresse perso1 = new Addresse(numero, voie, ville, codePostal, bp, lieuDit, cedex);
        this.addresse = perso1.Addresse();
    }
    
    public boolean telephoneValide(String telephone){
        char[] chaine = telephone.toCharArray();
        if (chaine[2]!='.' || chaine[5]!='.' || chaine[8]!='.' || chaine[11]!='.'){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void Maj_conseilRegional(){
        System.out.println(conseilRegional.toUpperCase());
    }
    
    public String getConseilRegional(){
        return this.conseilRegional;
    }
    public void setConseilRegional(String conseilRegional){
        this.conseilRegional = conseilRegional;
        System.out.println(this.conseilRegional);
    }
    
    public boolean isInscriptionOrdre(){
        if (this.inscriptionOrdre == true){
            return true;
        }
        else{
            return false;
        }
    }
    public void setInscriptionOrdre(boolean inscriptionOrdre){
        this.inscriptionOrdre = inscriptionOrdre;
        System.out.println(this.inscriptionOrdre);
    }
    
    public String[] getAddresse(){
        return this.addresse;
    }
    public void setAddresse(String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex){
        this.addresse[0] = numero;
        this.addresse[1] = voie;
        this.addresse[2] = ville;
        this.addresse[3] = codePostal;
        this.addresse[4] = bp;
        this.addresse[5] = lieuDit;
        this.addresse[6] = cedex;
    }
    
    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        if (telephoneValide(telephone)== true){
            this.telephone = telephone;
        }
        else{
            System.out.println("Le format du nouveau telephone n'est pas valide");
        }
    }
    
    public String toString(){
        return "[L'architecte "+this.nom + " "+ this.prenom+ " possede comme conseil Regional " + this.conseilRegional + " avec une inscription Ordre "+ this.inscriptionOrdre+". Il possède le telephone "+this.telephone + " avec comme numero "+addresse[0]+" avec la  voie "+addresse[1]+" dans la ville "+addresse[2]+" dont le code Postal est le "+addresse[3]+". Sa BP est "+addresse[4]+" au lieu Dit "+addresse[5]+" dans le cedex "+addresse[6]+".]";
    }     
}

    
class Deposant extends Personne{
    private String civilite;
    private String addresseMessagerie;
    private String[] addresse;
    
    private String numero;
    private String voie;
    private String ville;
    private String codePostal;
    private String bp;
    private String lieuDit;
    private String cedex;
    
    public Deposant(String nom,String prenom,String civilite,String addresseMessagerie, String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex){
        super(nom, prenom);
        this.civilite = civilite;
        this.addresseMessagerie= addresseMessagerie;
        Addresse perso2 = new Addresse(numero, voie, ville, codePostal, bp, lieuDit, cedex);
        this.addresse = perso2.Addresse();
    }
    
    public String toString(){
        return "[Le Deposant "+this.nom +" " +this.prenom+" est de civilite "+this.civilite+" et a comme addresse messagerie "+ this.addresseMessagerie+". Son numero est le "+addresse[0]+" voie "+addresse[1]+" dans la ville "+addresse[2]+" dont le code Postal est le "+addresse[3]+". Sa BP est "+addresse[4]+" au lieu Dit "+addresse[5]+" dans le cedex "+addresse[6]+".]";
    }
}