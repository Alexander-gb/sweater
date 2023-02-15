package sem2;

public class Shark extends Predator implements Swimable{
    public Shark(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm a shark. " + super.toString() + ". My speed is " + speedOfSwim();
    }
    public String say(){
        return "brr";
    }

    @Override
    public int speedOfSwim() {
        return 25;
    }
}