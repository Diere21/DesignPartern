// package hackingpassword;
import java.util.Scanner;

public class BruteForce extends Cracker{
    // private  String passWord="passer";//le mot de passe à trouver
    // private  StringBuilder caractere=new StringBuilder("");
    // private  int min=92, max=101;//pour le code ascII de l'alphabet
    private  long start;

    public void loop(int index, String passWord, StringBuilder caractere){
        
        for(int i = 97; i < 97+26; i++){

            caractere.setCharAt(index, (char)i);
            if(index < passWord.length() - 1)
            loop(index + 1, passWord, caractere);
            // System.out.println(caractere);
            if(caractere.toString().equals(passWord)){
                System.err.println("mot de passe trouvé"+" "+caractere);
                System.err.println("ca a pris:"+convertmilles(System.currentTimeMillis()-start));
                System.exit(0);                

                }
        }
    } 

    public String convertmilles(long input){
         int days=0, hours=0, minutes=0, seconds=0, millis=0;
         int day=86400000;
         int hour=3600000;
         int minute=60000;
         int second=1000;

         if(input>=day){
            days=(int) (input/day);
            millis=(int)(input%day);
         }
         else
         millis=(int) input;
         if(millis>=hour){
            hours=millis/hour;
            millis=millis%hour;
         }
         if(millis>=minute){
            minutes=millis/minute;
            millis=millis%minute;
         }
         if(millis>=second){ 
            seconds=millis/second;  
            millis=millis%second;
         }
         return(days+"day(s)"+hours+"h,"+minutes+"min,"+seconds+"s and"+millis+"ms");
    }

    public String crackSimple(String password){
        // implementation de la methode cracksimple
        StringBuilder caractere = new StringBuilder(password);
        // System.out.println("taille est "+caractere.capacity());
        
        loop(0, password, caractere);


        return null;
    }       

    public String crackHashed(String password){
        return null;
    }
       
      
   
}

    




    