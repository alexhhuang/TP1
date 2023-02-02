package Personnes;

abstract class Personne
{
    private String nom;
    private String prenom;
    public Personne(String nom,String prenom)
    {
        this.nom = validate(nom, 50);
        this.prenom = validate(prenom, 30);
    }
    private String validate (String chaine, Integer taille)
    {
        return chaine;
    }
    public String toString() {return this.nom + " " + this.prenom; }
}

class Architecte extends Personne {

    private String conseilRegional;
    private String telephone;
    private boolean inscriptionOrdre;
    private Adresse adresse;

    public Architecte(String nom, String prenom, String conseilRegional, boolean
            inscriptionOrdre, Adresse adresse, String telephone) {
        super(nom, prenom);

        this.conseilRegional = conseilRegional;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;

        if (telephoneValide(telephone)) {
            this.telephone = telephone;
        } else {
            this.telephone = "";
        }
        Maj_conseilRegional();
    }

    private boolean telephoneValide(String telephone) {

        for (int i = 0; i < 15; i++) {
            if (! Character.isDigit(telephone.charAt(i))) {
                break;
            }
        }
        return true;
    }


    public void Maj_conseilRegional() {Maj_conseilRegional();}
    public String toString() {
        String chaine = "";
        return this.conseilRegional + " " + this.telephone + " " + this.inscriptionOrdre;
        chaine = chaine + this.conseilRegional + " ";
        return chaine;
    }
}

class Deposant extends Personne{

    private String civilite;
    private String mail;
    private Adresse adresse;

    public Deposant(String nom,String prenom,String civilite,String mail,Adresse adresse){
        super(nom, prenom);

        this.civilite = civilite;
        this.mail = mail;
        this.adresse = adresse;
    }
    public String toString (){return this.civilite + " " +this.mail;}

}
class Adresse  {
    private String numero;
    private String voie;
    private String ville;
    private String cp;

    public Adresse(String numero,String voie,String ville,String cp){
        super();

        this.numero = validate (numero,10);
        this.voie = validate (voie,50);
        this.ville = validate (ville,30);
        this.cp = validate(cp,5);
    }
    private String validate(String chaine, Integer taille)
    {
        return chaine;
    }

}
