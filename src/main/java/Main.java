import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProduitElectronique pro1 = new ProduitElectronique(
                0,
                "téléphone",
                "tecno",
                1,
                12);


        Electromenager ElecPro1 = new Electromenager(
                1,
                "Aspirateur",
                "Philis",
                350,
                20);

        EquipementInformatique Equip1 = new EquipementInformatique(
                6,
                "telephone",
                "tecno",
                50,
                01);

        Accessoires Acc1 = new Accessoires(
                3,
                "chargeur",
                "itel",
                1,
                1);

        Scanner entree = new Scanner(System.in);
        System.out.println("''Equipement du stock''");
        System.out.println(
                "\n1. Produit Electronique" +
                        "\n2. Equipement informatique" +
                        "\n3. Electro Menager" +
                        "\n4. Accessoires");
        System.out.println("Faite un choix: ");
        int choix = entree.nextInt();

        if (choix == 1) {
            System.out.println(
                    "\nnom:" + pro1.nom +
                            "\nmarque:" + pro1.marque +
                            "\nprix:" + pro1.prix + "$" +
                            "\npoids:" + pro1.poids + "Kg");


        } else if (choix == 2) {

            System.out.println(
                    "\ncode produit:" + Equip1.codeproduit +
                            "\nnom:" + Equip1.nom +
                            "\nmarque:" + Equip1.marque +
                            "\nprix:" + Equip1.prix + "$" +
                            "\npoids:" + Equip1.poids + "Kg");
        } else if (choix == 3) {

            System.out.println(
                    "\ncode produit:" + ElecPro1.codeproduit +
                            "\nnom:" + ElecPro1.nom +
                            "\nmarque:" + ElecPro1.marque +
                            "\nprix:" + ElecPro1.prix + "$" +
                            "\npoids:" + ElecPro1.poids + "Kg");
        } else if (choix == 4) {
            System.out.println(
                    "\ncode produit:" + Acc1.codeproduit +
                            "\nnom:" + Acc1.nom +
                            "\nmarque:" + Acc1.marque +
                            "\nprix:" + Acc1.prix + "$" +
                            "\npoids:" + Acc1.poids + "Kg");

        } else {
            System.out.println("ce choix n'est pas disponible");
        }

    }

}

