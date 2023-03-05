package Notes;

import java.io.FileWriter;
import java.io.IOException;

public class Persister {
    public Persister(String filename) {
        this.filename = filename;
    }

    String filename;
    public void saveToTXT(Notes notes) {
        String fileName = "notes.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"title\":\"" + notes.getTitle() + "\",\n");
            writer.write("\"text\":\"" + notes.getText() + "\",\n");
            writer.write("\"ID\":" + notes.getID() + ",\n");
            writer.write("\"date\":" + notes.getDate() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}