import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        int i = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("number of entry ");
        int numberOfEntry = scn.nextInt();

        if (numberOfEntry <= 1000) {
            Scanner scn2 = new Scanner(System.in);
            while (numberOfEntry != i) {
                System.out.println("‘entry name’ or ‘exit name’ ");
                String input = scn2.nextLine();
                input.toLowerCase().trim();
                String[] token = input.split(" ");
                while (token[1].isEmpty()) {
                    System.out.println(" add a  name  ");
                    input = scn2.nextLine();
                    input.toLowerCase().trim();
                    token[1] = input;
                }
                System.out.println(token[0] + " " + token[1]);
                String entry = token[0];
                String user = token[1];
                if (entry.equals("entry") && !(user.length() > 20)) {
                    if (!list.contains(user)) {
                        list.add(user);
                        System.out.println(user + " added to list ");
                    } else if (list.contains(user)) {
                        System.out.println(user + " (ANOMALY 1 )");

                    } else {
                        System.out.println("name can be a maximum of 20 characters and must contain only charecters of lower or uppercase ");
                    }
                } else if (entry.equals("exit")) {
                    if (!list.contains(user))
                        System.out.println(user + " (ANOMALY)");
                    else if (list.contains(user)) {
                        list.remove(user);
                        System.out.println(user + "   removed exited");
                    }

                }
                i++;


            }//--------------------------------------***********-------------------------------------------------------
            System.out.println("list    0 =  " + list.get(0));

        }
    }
}



