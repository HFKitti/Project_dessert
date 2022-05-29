package hu.progmatic;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("hu/progmatic/receptek "));
            //System.out.println(sc.contains("tojás"));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //System.out.println(s.contains("tojás"));
}
















