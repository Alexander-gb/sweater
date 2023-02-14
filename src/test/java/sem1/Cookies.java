package sem1;

public class Cookies extends Product {

    public Cookies(String name, Double price) {
        super(name, price);
    }


    public String toString(){
        return String.format("%s glaze(glazur') = %d  " , super.toString());
    }

}
