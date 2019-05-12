package email;

import java.util.Scanner;

public class EmailApp {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        Email em1 = new Email("Zakaria", "Suleman");

        System.out.println(em1.showInfo());


    }
}
