import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le mot de passe : ");
        String password = scanner.nextLine();

        System.out.print("Veuillez saisir le type de cracker (BruteForce, Dictionary) : ");
        String crackerType = scanner.nextLine();

        scanner.close();

        PassWordCracker cracker = CrackerFactory.createPassWordCracker(crackerType);

        long startTime = System.currentTimeMillis();

        if (password.startsWith("$")) {
            // Le mot de passe est hashé, utiliser crackHashed
            cracker.crackHashed(password);
        } else {
            // Le mot de passe est simple, utiliser crackSimple
            cracker.crackSimple(password);
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Temps écoulé : " + elapsedTime + " millisecondes");
    }
}
