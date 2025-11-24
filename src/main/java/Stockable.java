public interface Stockable {
    void ajouterStock(int qte);
    void retirerStock(int qte);

    default int getQuantiteStock() {
        return 0;
    }

}
