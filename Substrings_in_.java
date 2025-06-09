public class Substrings_in_ {
    public static void main(String[] args) {
    
         //substring restituisce una porzione di stringa in un altra variabile
         //utile per esempio per chi deve restituire le email nel sito o nomi di email.
        //ma non è flessibile anzi è molto specifico e non va in base alla parola ma 
         //al numero/lettera
    
        String email = "Daniele@gmail.com";
        String username = email.substring(0, 7); //viene utilizzato per
        //String username = text.substring(0,text.indexOf ("char"));
        String Domain = email.substring(0, email.indexOf("@"));
        String domain2 =email.substring(email.indexOf("@"));
    
        System.out.println(username); //sarà solo "Daniele"
        System.out.println(Domain);   //sarà Daniele per il fatto che va da 0 a "@"
        System.out.println(domain2);  //sarà solo "@gmail.com"
    
        //recap: .substring per assegnare una porzione di parola ad una variabile
        //       String methods per controllare la stringa 
        
    }   
}
