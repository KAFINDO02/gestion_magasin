public class Electromenager extends ProduitElectronique {
    private String classeEnergie;
    private int puissance;
    private String typeAlimentation;

    public Electromenager(int codeproduit, String nom, String marque,
                          double prix, int poids, int garantisMois, int QuantiteStock,
                          String classeEnergie, String typeAlimentation, int puissance) {


        super(codeproduit, nom, marque,  prix, poids, garantisMois, QuantiteStock);
                this.classeEnergie = classeEnergie;
                    this.puissance = puissance;
                        this.typeAlimentation = typeAlimentation;
    }

    public double calculerconsommation() {
        return(puissance / 1000.0);
    }
    @Override
    public void AfficherDetails() {
        super.AfficherDetails();
        calculerconsommation();
        System.out.println("\nPuissance (W):"+puissance);
        System.out.println("\nClasse Energie:"+classeEnergie);
        System.out.println("\nType Alimentation:"+typeAlimentation);
    }

    @Override
    public int getafficherProduit() {
        return 0;
    }
}

