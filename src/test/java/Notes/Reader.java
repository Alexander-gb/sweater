package Notes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Reader {
    public static void read () throws Exception {

        Path path = Path.of("D:\\projects\\test\\test\\notes.txt");
        List<String> list = Files.readAllLines(path);
        for (String str : list) {
            System.out.println(str);
        }

    }

}
