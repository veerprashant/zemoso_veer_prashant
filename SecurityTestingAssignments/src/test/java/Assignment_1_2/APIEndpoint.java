package Assignment_1_2;
import org.mindrot.jbcrypt.BCrypt;

public class APIEndpoint {
    public static String hashPassword(String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashedPassword;
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }

    public static void main(String[] args) {
        // Example usage
        String password = "Prashant";
        String hashedPassword = hashPassword(password);

        System.out.println("Original Password: " + password);
        System.out.println("Hashed Password: " + hashedPassword);

        // Check if the entered password matches the stored hash
        boolean isPasswordCorrect = checkPassword(password, hashedPassword);
        System.out.println("Is Password Correct? " + isPasswordCorrect);
    }
}


//Generated Hash Passwords : ---
//Password                         HashPassword
//Prashant@123                     $2a$10$eobeN3G5K7jBN5ZI7IHOH.ARYfzE3lF5a9eDjcj05b6BpQLchNy3u
//Password@874                     $2a$10$HWGDZbdOzmOXv0n7dZDZ4.KVoYHiW6Df1K8r.4XNzzEn7usRmrOOK
//12345678                         $2a$10$wvaKf0LZT06ZJ7co.gZ7OeHvahEOlDxKo/N6H0fG2Fg6kna5h02EK
//password                         $2a$10$VQduNvzUE0NE1LpXBJ8.3OyO1oHb6.CWwWcCt84/UCMBE6NYCn6.2
//87654321                         $2a$10$DhcuB6/FvaflABvYt2EIyOnjV4/u4pMn7iSx.RgjVhZOvQ7/Npkj.


//Prashant                         $2a$10$BegkeQjljDxVj84.TqSNDeeHucfRPimtK0WerRFMIhRZ2oMdJbP5C
//                                 $2a$10$qo9aJpRsbQkOEDtG9dnuwegEFIDu1DEeu.9ZHkabyraiVDdi0krnW
//                                 $2a$10$gZiK7j2Bo06ImRLnLmtLAuk4bulsL0JXaJhyAc9rndWmIzMOv5EVK
//                                 $2a$10$BE1ZuFzLGjLwCdd1gJJbQOPWc7cqN3uonQ3cLvwfBSwOeJPGtPyve
//                                 $2a$10$FJbSeMxMohaYJKQAyua9KO2uk51UVD2wAKcYwmv60ZHv7kmvmtozK
