package Assignment_3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordHashingExample {

    public static void main(String[] args) {
        // Password to be hashed
        String password = "Prash@12345";

        // Generate salt
        String salt = generateSalt();

        // Hash the password with the generated salt
        String hashedPassword = hashPassword(password, salt);

        System.out.println("Password: " + password);
        System.out.println("Salt: " + salt);
        System.out.println("Hashed Password: " + hashedPassword);

        // Verify the entered password against the stored hash and salt
        boolean passwordMatch = verifyPassword(password, hashedPassword, salt);

        System.out.println("Password Match: " + passwordMatch);
    }

    private static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] saltBytes = new byte[16];
        random.nextBytes(saltBytes);
        return bytesToHex(saltBytes);
    }

    private static String hashPassword(String password, String salt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String input = password + salt;
            byte[] hashBytes = digest.digest(input.getBytes());
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

    private static boolean verifyPassword(String enteredPassword, String storedHash, String salt) {
        String hashedEnteredPassword = hashPassword(enteredPassword, salt);
        return MessageDigest.isEqual(hexStringToByteArray(hashedEnteredPassword), hexStringToByteArray(storedHash));
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexStringBuilder = new StringBuilder();
        for (byte b : bytes) {
            hexStringBuilder.append(String.format("%02x", b));
        }
        return hexStringBuilder.toString();
    }

    private static byte[] hexStringToByteArray(String hexString) {
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }
}


//Password: Prash@12345
//Salt: 65e5424a09346864e1db80a072e21db8
//Hashed Password: b9dd0e0a1413c9419c445e0686393b3a2779c67734aafc7e7f3c70bdac52f107
//Password Match: true

//Password: Prash@12345
//Salt: f7e90ef907cd586e507bd116dc037053
//Hashed Password: b6addc8dba85b9c2a963e32a83066bf5428f69fe692ef3903152316527d276d8
//Password Match: true

//Password: Prash@12345
//Salt: 9049496dd606cd39f946de6ea276f796
//Hashed Password: 98e21a41b7086a4644f6a4dd6268761516453f9c8d883ec145e1aaf1fd9aa9b5
//Password Match: true

//Password: Prash@12345
//Salt: 1c3de1ea17e41c50e67e0fe84e5be6d7
//Hashed Password: 4ab59bdabe62becc8486c35baae6f07100b9fac6e6c571c571f21a7cb6aff7c1
//Password Match: true