public class EquipementInformatique extends ProduitElectronique{
    private int memoire;
    private int capStock;
    private String processeur;

    public EquipementInformatique(int codeproduit, String nom, String marque,
                                  double prix, int poids, int garantisMois,
                                  int QuantiteStock, int memoire, int capStock, String processeur ) {
        super(codeproduit, nom, marque, prix, poids, garantisMois,
                QuantiteStock);
                    this.memoire = memoire;
                        this.capStock = capStock;
                            this.processeur = processeur;
    }

    public void AfficherConfig(){
        System.out.println("\nMemoire RAM:"+memoire+"Go");
        System.out.println("\nStockage:"+capStock+"Go");
        System.out.println("\nProcesseur:"+processeur);
    }
    @Override
    public void AfficherDetails(){
        super.AfficherDetails();
        AfficherConfig();
    }

    @Override
    public int getafficherProduit() {
        return 0;
    }
}
