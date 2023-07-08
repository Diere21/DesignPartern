public class CrackerFactory {
    public static PassWordCracker createPassWordCracker(String type) {
        if (type.equals("Dictionary")) {
            return new DictionaryPasswordCracker();
        } else if (type.equals("BruteForce")) {
            return new BruteForcePasswordCracker();
        } else {
            throw new IllegalArgumentException("La mathéode de crackage"+" "+type+" "+"est invalide!!");
        }
    }
}