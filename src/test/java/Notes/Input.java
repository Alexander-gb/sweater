package Notes;



public class Input {
    public Notes inputFromConsole() {
    String title = Utils.prompt("Title: ");
    String text = Utils.prompt("Text: ");
    int ID = Integer.parseInt(Utils.prompt("ID: "));

    return new Notes(title,text,ID);
}

    }

