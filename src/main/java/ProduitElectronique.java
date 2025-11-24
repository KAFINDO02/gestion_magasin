public abstract class ProduitElectronique implements Stockable, Affichable  {
    protected String nom;
    protected int codeproduit;
    protected float poids;
    protected String marque;
    protected double prix;
    protected int QuantiteStock;
    protected int garantisMois;

    public ProduitElectronique(int codeproduit, String nom, String marque,
                               double prix, int poids, int garantisMois, int QuantiteStock ) {
        this.codeproduit = codeproduit;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.poids = poids;
        this.garantisMois = garantisMois;
        this.QuantiteStock = QuantiteStock;
    }


    @Override
    public void ajouterStock(int qte){
        if (qte > 0)QuantiteStock +=qte;
    }

    @Override
    public void retirerStock(int qte){
        if (qte > 0 && qte <= QuantiteStock)
            QuantiteStock-=qte;
    }

    @Override
    public int getQuantiteStock(){
        return QuantiteStock;

    }
    @Override
    public void AfficherDetails() {
                System.out.println("\ncode:"+codeproduit);
                System.out.println("\nNom:"+nom);
                System.out.println("\nMarque:"+marque);
                System.out.println("\nPrix:"+prix+"$");
                System.out.println("\nPoids:"+poids+"kg");

    }


    public ProduitElectronique(){}
         public int getcodeproduit()
                {return codeproduit; }
                        public String getNom()
                            {return nom;}
                                public double getprix()
                                    {return prix; }
                                         public void setnom(String nom) {
                                                this.nom = nom;
    }


    public void afficherProduit() {
    }

    public int getafficherProduit() {
        return 0;
    }
}