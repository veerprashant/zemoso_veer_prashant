package Assignment_1_2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1PasswordHashing {

    public static void main(String[] args) {
        // Password to be hashed
        String password = "4a7dc765";

        // Hash the password using SHA-1
        String hashedPassword = hashPasswordSHA1(password);

        System.out.println("Original Password: " + password);
        System.out.println("Hashed Password (SHA-1): " + hashedPassword);
    }

    private static String hashPasswordSHA1(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hashBytes = digest.digest(password.getBytes());
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexStringBuilder = new StringBuilder();
        for (byte b : bytes) {
            hexStringBuilder.append(String.format("%02x", b));
        }
        return hexStringBuilder.toString();
    }
}


//Hashed Password for same Password
//Password: Prashant@1234

//Hashed Password for given password using SHA-1: -
//6c6d0aaa5c12a274a6b5b7bfcecf86cdf13486e0
//6c6d0aaa5c12a274a6b5b7bfcecf86cdf13486e0
//6c6d0aaa5c12a274a6b5b7bfcecf86cdf13486e0


