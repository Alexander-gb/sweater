package sem1;

public class Chocolate extends Product{

    private Integer cocoa = 0;
    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Integer cocoa){
        this(name, price);
        this.cocoa = cocoa;
    }
    public String toString(){
        return String.format("%s cocoa = %d  " , super.toString(), cocoa);
    }

}
