import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Random Rolls: " + randomRolls);
        
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);
        


        String randomPassword = generator.generatePassword();
        System.out.println("Random Password: " + randomPassword);
        
        String[] passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Password Set: " + Arrays.toString(passwordSet));
    }
}
