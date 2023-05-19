
import java.util.Scanner;

public class MyApp{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        int methode;


        System.out.println("Bienvenu dans notre application ");
        System.out.println("1----> pour casser mot de passe simple ");
        System.out.println("2----> pour casser mot de passe hashe ");
        choix = scanner.nextInt();

        System.out.println("1----> Pour brute force ");
        System.out.println("2----> Pour dictionay ");

        methode = scanner.nextInt();

        Cracker cracker = Factory.getCracker(methode);
        cracker.crackSimple("passer");

        
    }
}