package Notes;


import java.time.LocalDateTime;

public class Notes {
    private String title;
    private String text;
    private int ID;

    private LocalDateTime date;

    public Notes(String title, String text, int ID) {
        this.title = title;
        this.text = text;
        this.ID = ID;
        this.date = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getID() {
        return ID;
    }

    public LocalDateTime getDate() {
        return date;
    }


    }


