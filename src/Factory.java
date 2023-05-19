public class Factory{
    public static Cracker getCracker(int type){
        if(type == 1){
            return new BruteForce();
        }else{
            return new Dictionary();
        }
    }

}