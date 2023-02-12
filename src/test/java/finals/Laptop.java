package finals;

//price,new (not new), ram,
public class Laptop {
    public String name;
    public int model;
    public int ram;
    public double price;
    public String seller;


    public Laptop(String name, int model, int ram, double price, String seller) {
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.price = price;
        this.seller = seller;
    }

    public void setSeller(String seller){ seller = seller;
    }

    public void setName(String laptopname){
        name = laptopname;
    }

    public void setModel(int laptopmodel){
        model = laptopmodel;
    }

    public void setRam(int ram){ ram = ram;};

    public void setPrice(double price) { price = price;}





    public String getSeller(){
        return seller;
    }

    public String getName(){
        return name;
    }

    public int getModel(){
        return model;
    }

    public int getRam() { return ram;}

    public double getPrice() { return price;}





}



