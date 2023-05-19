import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary extends Cracker {
       public String crackSimple(String password){
        // implementation de la methode cracksimple
            //  String motDePasse = "football"; // Mot de passe à deviner
        String cheminDictionnaire = "./Dictionnaire.txt"; // Chemin vers le fichier du dictionnaire

        // Charger le dictionnaire depuis le fichier
        File fichierDictionnaire = new File(cheminDictionnaire);
        try {
            Scanner scanner = new Scanner(fichierDictionnaire);
            while (scanner.hasNextLine()) {
                String mot = scanner.nextLine().trim();

                // Vérifier si le mot correspond au mot de passe
                if (mot.equals(password)) {
                    System.out.println("Mot de passe trouvé : " + mot);
                    break;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Fin de l'attaque par dictionnaire.");
        return null;
    }

    public String crackHashed(String password){
        return null;
    }
}
