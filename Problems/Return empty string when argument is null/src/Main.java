import java.util.Scanner;
import java.util.Locale;

public class Main {

    /* Fix this method */
    public static String toUpperCase(String str) {

      if (str!=null){
          return str.toUpperCase(Locale.ENGLISH);
      } else{
          return "";
      }


    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line =  scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));

    }
}