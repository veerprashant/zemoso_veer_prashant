package Assignment_4;

import org.mindrot.jbcrypt.BCrypt;

public class BcryptPasswordHashing {

    public static void main(String[] args) {
        // Password to be hashed
        String password = "Prash@123456";

        // Hash the password using BCrypt
        String hashedPassword = hashPasswordBcrypt(password);

        System.out.println("Original Password: " + password);
        System.out.println("Hashed Password (BCrypt): " + hashedPassword);

        // Verify the entered password against the stored BCrypt hash
        boolean passwordMatch = verifyPassword(password, hashedPassword);

        System.out.println("Password Match: " + passwordMatch);
    }

    private static String hashPasswordBcrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    private static boolean verifyPassword(String enteredPassword, String storedHash) {
        return BCrypt.checkpw(enteredPassword, storedHash);
    }
}


//Original Password: Prash@123456
//Hashed Password (BCrypt): $2a$10$a6vT/RminqeOCtdUogJlqe0QjnjczVvBwY/v66geaaeWXBlCUmNFu
//Password Match: true


//Original Password: Prash@123456
//Hashed Password (BCrypt): $2a$10$yYNd830M0yfkfM8rWkWCBOLuDLjc1yRfVyTApZbnVaVeCnwh0g./S
//Password Match: true

//Original Password: Prash@123456
//Hashed Password (BCrypt): $2a$10$KX5ne3gWa.4kwG8RyHahQOBFG/tkLyzhH00OXT6xStVLo/lPjK7qm
//Password Match: true
