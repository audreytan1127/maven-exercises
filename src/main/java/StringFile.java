import org.apache.commons.lang3.StringUtils;

import javax.print.DocFlavor;
import java.util.Scanner;

public class StringFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something.");
        String userInput = scanner.nextLine();
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
