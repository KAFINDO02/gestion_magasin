public class Accessoires extends ProduitElectronique {
    private String compatibilite;
    private String typeAccesoire;

    public Accessoires(int codeproduit, String nom, String marque,
                       double prix, int poids, int garantisMois, int QuantiteStock,
                       String compatibilite, String typeAccesoire) {
        super(codeproduit, nom, marque, prix, poids, garantisMois,
                QuantiteStock);
        this.compatibilite = compatibilite;
        this.typeAccesoire = typeAccesoire;
    }
    public boolean
    verifiercompatibilite(String appareil){
                 return
        compatibilite.equalsIgnoreCase(appareil);
    }
    @Override
    public void AfficherDetails() {
        super.AfficherDetails();
        System.out.println("\nType accessoire:"+typeAccesoire);
        System.out.println("\nCompatibilité"+compatibilite);
    }

}