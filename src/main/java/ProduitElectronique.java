public class ProduitElectronique {
    public String nom;
    public int codeproduit;
    public float poids;
    protected String marque;
    public float prix;

    public ProduitElectronique(int codeproduit, String nom, String marque,
                               float prix, int poids ) {
        this.codeproduit = codeproduit;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.poids = poids;
    }
    public ProduitElectronique(){}
    public int getcodeproduit() {return codeproduit; }
    public void setcodeproduit(int codeproduit){
        this.codeproduit = codeproduit;
    }

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getMarque(){return marque; }
    public void setMarque(String marque){
        this.marque = marque;
    }

    public float getprix() {return prix; }
    public void setprix(float prix){
        this.prix = prix;
    }

    public float getpoids() {return poids; }
    public void setpoids(float poids){
        this.poids = poids;
    }
}