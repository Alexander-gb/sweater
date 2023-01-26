package hw2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Dz2 {


    public static void main (String[]args) throws FileNotFoundException {

        File file = new File("typeTest");
        PrintWriter pw = new PrintWriter(file);

        pw.print(typeHundread(" "));;




        pw.close();



    }



    public static String typeHundread(String value) {
        for (int i = 0; i < 100; i++) {
            value = value + "test ";
        }
        return value;
    }
}




