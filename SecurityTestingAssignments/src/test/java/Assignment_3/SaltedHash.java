package Assignment_3;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SaltedHash {

//    // SecureRandom instance for generating random salts
//    private static final SecureRandom secureRandom = new SecureRandom();
//
//    // Cost factor for BCrypt (work factor, determines the computational cost)
//    private static final int BCRYPT_COST_FACTOR = 12;
//
//    // Generate a random salt
//    private static String generateSalt() {
//        byte[] salt = new byte[16];
//        secureRandom.nextBytes(salt);
//        return Base64.getEncoder().encodeToString(salt);
//    }
//
//    // Hash the password with a random salt
//    public static String hashPassword(String password) throws NoSuchAlgorithmException {
//        String salt = generateSalt();
//        return BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, SecureRandom.getInstance(salt)));
//    }
//
//    // Check if the entered password matches the stored salted hash
//    public static boolean checkPassword(String password, String storedHash) {
//        return BCrypt.checkpw(password, storedHash);
//    }
//
//    public static void main(String[] args) throws NoSuchAlgorithmException {
//        // Example usage
//        String password = "examplePassword";
//
//        // Hash the password with a random salt
//        String hashedPassword = hashPassword(password);
//        System.out.println("Original Password: " + password);
//        System.out.println("Salted Hashed Password: " + hashedPassword);
//
//        // Check if the entered password matches the stored salted hash
//        boolean isPasswordCorrect = checkPassword("examplePassword", hashedPassword);
//        System.out.println("Is Password Correct? " + isPasswordCorrect);
//    } private static final int BCRYPT_COST_FACTOR = 12;
//
//    // Generate a random salt
//    public static String generateSalt() {
//        try {
//            SecureRandom random = SecureRandom.getInstanceStrong();
//            byte[] salt = new byte[16];
//            random.nextBytes(salt);
//            return Base64.getEncoder().encodeToString(salt);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace(); // Handle the exception appropriately
//            return null;
//        }
//    }
//
//    // Hash the password with the generated salt
//    public static String hashPassword(String password, String salt) {
//        return BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt));
//    }
//
//    // Check if the entered password matches the stored salted hash
//    public static boolean checkPassword(String password, String salt, String hashedPassword) {
//        String candidateHash = BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt));
//        return BCrypt.checkpw(candidateHash, hashedPassword);
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        String password = "examplePassword";
//
//        // Generate a random salt for each user
//        String salt = generateSalt();
//
//        // Hash the password with the generated salt
//        String hashedPassword = hashPassword(password, salt);
//
//        System.out.println("Original Password: " + password);
//        System.out.println("Salt: " + salt);
//        System.out.println("Hashed Password with Salt: " + hashedPassword);
//
//        // Check if the entered password matches the stored salted hash
//        boolean isPasswordCorrect = checkPassword("examplePassword", salt, hashedPassword);
//        System.out.println("Is Password Correct? " + isPasswordCorrect);
//    }

//    private static final int BCRYPT_COST_FACTOR = 12;
//
//    // Generate a random salt
//    public static String generateSalt() {
//        try {
//            SecureRandom random = SecureRandom.getInstanceStrong();
//            byte[] salt = new byte[16];
//            random.nextBytes(salt);
//            return Base64.getEncoder().encodeToString(salt);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace(); // Handle the exception appropriately
//            return null;
//        }
//    }
//
//    // Hash the password with the generated salt
//    public static String hashPassword(String password, String salt) {
//        return BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt));
//    }
//
//    // Check if the entered password matches the stored salted hash
//    public static boolean checkPassword(String password, String salt, String hashedPassword) {
//        String candidateHash = BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt));
//        return BCrypt.checkpw(candidateHash, hashedPassword);
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        String password = "examplePassword";
//
//        // Generate a random salt for each user
//        String salt = generateSalt();
//
//        // Hash the password with the generated salt
//        String hashedPassword = hashPassword(password, salt);
//
//        System.out.println("Original Password: " + password);
//        System.out.println("Salt: " + salt);
//        System.out.println("Hashed Password with Salt: " + hashedPassword);
//
//        // Check if the entered password matches the stored salted hash
//        boolean isPasswordCorrect = checkPassword("examplePassword", salt, hashedPassword);
//        System.out.println("Is Password Correct? " + isPasswordCorrect);
//    }

//    private static final int BCRYPT_COST_FACTOR = 12;
//
//    // Generate a random salt
//    public static String generateSalt() {
//        try {
//            SecureRandom random = SecureRandom.getInstanceStrong();
//            byte[] salt = new byte[16];
//            random.nextBytes(salt);
//            return Base64.getEncoder().encodeToString(salt);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace(); // Handle the exception appropriately
//            return null;
//        }
//    }
//
//    // Hash the password with the generated salt
//    public static String hashPassword(String password, String salt) {
//        return BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt.getBytes()));
//    }
//
//    // Check if the entered password matches the stored salted hash
//    public static boolean checkPassword(String password, String salt, String hashedPassword) {
//        String candidateHash = BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt.getBytes()));
//        return BCrypt.checkpw(candidateHash, hashedPassword);
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        String password = "examplePassword";
//
//        // Generate a random salt for each user
//        String salt = generateSalt();
//
//        // Hash the password with the generated salt
//        String hashedPassword = hashPassword(password, salt);
//
//        System.out.println("Original Password: " + password);
//        System.out.println("Salt: " + salt);
//        System.out.println("Hashed Password with Salt: " + hashedPassword);
//
//        // Check if the entered password matches the stored salted hash
//        boolean isPasswordCorrect = checkPassword("examplePassword", salt, hashedPassword);
//        System.out.println("Is Password Correct? " + isPasswordCorrect);
//    }


//    private static final int BCRYPT_COST_FACTOR = 12;

//    // Generate a random salt
//    public static String generateSalt() {
//        try {
//            SecureRandom random = SecureRandom.getInstanceStrong();
//            byte[] salt = new byte[16];
//            random.nextBytes(salt);
//            return Base64.getEncoder().encodeToString(salt);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace(); // Handle the exception appropriately
//            return null;
//        }
//    }

//    // Hash the password with the generated salt
//    public static String hashPassword(String password, String salt) {
//        return BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt.getBytes()));
//    }

//    // Check if the entered password matches the stored salted hash
//    public static boolean checkPassword(String password, String salt, String hashedPassword) {
//        String candidateHash = BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt.getBytes()));
//        return BCrypt.checkpw(candidateHash, hashedPassword);
//    }

//    public static void main(String[] args) {
//        // Example usage
//        String password = "examplePassword";

//        // Generate a random salt for each user
//        String salt = generateSalt();

//        // Hash the password with the generated salt
//        String hashedPassword = hashPassword(password, salt);

//        System.out.println("Original Password: " + password);
//        System.out.println("Salt: " + salt);
//        System.out.println("Hashed Password with Salt: " + hashedPassword);

//        // Check if the entered password matches the stored salted hash
//        boolean isPasswordCorrect = checkPassword("examplePassword", salt, hashedPassword);
//        System.out.println("Is Password Correct? " + isPasswordCorrect);
//    }

    private static final int BCRYPT_COST_FACTOR = 12;

    // Generate a random salt
    public static byte[] generateSalt() {
        try {
            SecureRandom random = SecureRandom.getInstanceStrong();
            byte[] salt = new byte[16];
            random.nextBytes(salt);
            return salt;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); // Handle the exception appropriately
            return null;
        }
    }

    // Hash the password with the generated salt
//    public static String hashPassword(String password, byte[] salt) {
//        return BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt));
//    }
//
//    // Check if the entered password matches the stored salted hash
//    public static boolean checkPassword(String password, byte[] salt, String hashedPassword) {
//        String candidateHash = BCrypt.hashpw(password, BCrypt.gensalt(BCRYPT_COST_FACTOR, salt));
//        return BCrypt.checkpw(candidateHash, hashedPassword);
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        String password = "examplePassword";
//
//        // Generate a random salt for each user
//        byte[] salt = generateSalt();
//
//        // Hash the password with the generated salt
//        String hashedPassword = hashPassword(password, salt);
//
//        System.out.println("Original Password: " + password);
//        System.out.println("Salt: " + Base64.getEncoder().encodeToString(salt));
//        System.out.println("Hashed Password with Salt: " + hashedPassword);
//
//        // Check if the entered password matches the stored salted hash
//        boolean isPasswordCorrect = checkPassword("examplePassword", salt, hashedPassword);
//        System.out.println("Is Password Correct? " + isPasswordCorrect);
//    }
}
