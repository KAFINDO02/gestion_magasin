public class Accessoires {
    public String nom;
    public int codeproduit;
    public float poids;
    protected String marque;
    public float prix;

    public Accessoires(int codeproduit, String nom, String marque,
                       float prix, int poids) {
        this.codeproduit = codeproduit;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.poids = poids;

    }
    public Accessoires(){}
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

    public float getPoids() {return poids; }
    public void setPoids(float poids){
        this.poids = poids;
    }


}
