import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stockmanager implements Crud  {
    private ArrayList<ProduitElectronique> produits= new ArrayList<>() ;
    List<String> maList = Arrays.asList() ;
    public Stockmanager (ArrayList<ProduitElectronique> produits){
        this.produits = produits;};

    private Scanner sc = new Scanner(System.in);

    @Override
    public void ajouterProduit() {
        System.out.print("Nom du produit: ");
        String nom = sc.nextLine();
        System.out.print("Prix du produit: ");
        double prix = sc.nextDouble();
        sc.nextLine();
        produits.add(new ProduitElectronique() {
            @Override
                public void ajouterStock(int qte) {
                    super.ajouterStock(qte);
            }

            @Override
            public int getafficherProduit() {
                return 0;
            }
        });
        System.out.println("Produit ajouté avec succès !");
    }

    @Override
    public void afficherProduit() {
        if (produits.isEmpty()) {
            System.out.println("Aucun produit dans le stock !");
        } else {
            System.out.println("--- Stock actuel ---");
            for (int i = 0; i < produits.size(); i++) {
                System.out.print((i+1) + ". "+produits);
                produits.get(i).AfficherDetails();
            }
        }
    }

    @Override
    public void modifierProduit() {
        afficherProduit();
        if (produits.isEmpty()) return;

        System.out.print("Numéro du produit à modifier: ");
        int index = sc.nextInt() - 1;
        sc.nextLine(); // consommer retour à la ligne

        if (index >= 0 && index < produits.size()) {
            ProduitElectronique p = produits.get(index);
            System.out.print("Nouveau nom (" + p.getNom() + "): ");
            String nom = sc.nextLine();
            System.out.print("Nouveau prix (" + p.getprix() + "): ");
            double prix = sc.nextDouble();
            sc.nextLine();

            p.setnom(nom);
            System.out.println("Produit modifié avec succès !");
        } else {
            System.out.println("invalide !");
        }
    }

    @Override
    public void supprimerProduit() {
        afficherProduit();
        if (produits.isEmpty()) return;

        System.out.print("Numéro du produit à supprimer: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < produits.size()) {
            produits.remove(index);
            System.out.println("Produit supprimé !");
        } else {
            System.out.println("invalide !");
        }

    }
}
