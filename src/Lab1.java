/* My name is Collin Gadsby
 * I love watching Lions Games
 *
 * My name is Connor Carr.
 * My fun fact is that I once stapled my thumbs together.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        setupScanner("C:/Users/colli/Documents/IntroToProgrammingII/Programs/Lab1/Lab1/src/fightsong.txt/",  3);
        findAndReplace(setupScanner("C:/Users/colli/Documents/IntroToProgrammingII/Programs/Lab1/Lab1/src/fightsong.txt/",  3), "fightsong_fixed.txt", "engineers", "computerscientists");
    }

    /*
     * The code does not run because it requires a FileNotFound catch.
     * When we use a file that doesn't exist, the program shows which part of the code is causing issues.
     */
    public static Scanner setupScanner(String filename, int linesToSkip){
        try{
            Scanner test = new Scanner(new File(filename));
            for (int i = 0; i < linesToSkip; i++)
                if (test.hasNextLine())
                    System.out.print(test.nextLine());
            return test;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    //We got to problem 3 then got stuck
    public static int findAndReplace(Scanner scanner, String filename, String findWord, String replaceWord){
        try {
            PrintWriter printer = new PrintWriter(new File(filename));
            int counter = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equals(findWord)) {
                    printer.print(replaceWord);
                    counter++;

                } else {
                    printer.print(scanner.next());
                }
            }
            return counter;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return -1;
        }
    }
}
