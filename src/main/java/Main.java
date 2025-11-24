import com.sun.source.tree.ContinueTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<ProduitElectronique> produits = new ArrayList<>();
        Stockmanager manager = new Stockmanager(produits);

        produits.add(new Electromenager(
                01,
                "Aspirateur",
                "Techno",
                100.2,
                10,
                2,
                2,
                "electrique",
                "chargeur",
                20));
        produits.add(new EquipementInformatique(
                02,
                "SSD",
                "Itel",
                200,
                3,
                3,
                2,
                632,
                40,
                "ccc"

                ));
        produits.add(new Accessoires(
                03,
                "cable",
                "tecno",
                2000,
                5,
                2,
                10,
                "type C",
                "portable"
                ));


        Scanner entree = new Scanner(System.in);

        {
            System.out.println("''==MENU DE GESTION==''");
            System.out.println("\n1. Ajouter un produit" +
                    "\n2. Afficher tous les produits" +
                    "\n3. Modifier un produit" +
                    "\n4. Supprimer un produit" +
                    "\n5.Quitter");
            System.out.println("Faite un choix: ");

            int choix = entree.nextInt();
            while (choix != 5) break;



            if (choix == 1) {
                manager.ajouterProduit();
            } else if (choix == 2) {
                System.out.println("\n1. Elecromenqger" +
                        "\n2. Equipement Informatique"+
                        "\n3. Accessoires Electronique");
                System.out.println("Faite un choix à afficher: ");

                Scanner sc = new Scanner(System.in);
                int choix2 = sc.nextInt();

                while (choix2 != 3) break;
                if (choix2 == 1) {
                    manager.afficherProduit();
                }else if (choix2 == 2) {
                    manager.afficherProduit();
                }else if (choix2 == 3) {
                    manager.afficherProduit();
                }


            } else if (choix == 3) {
                manager.modifierProduit();
            } else if (choix == 4) {
                manager.supprimerProduit();
            } else if (choix == 5) {
                System.out.println("Fermeture du programme...");
            } else if (choix !=5){
                System.out.println("choix invalide, réessayer.");

            }


        }
    }
}

