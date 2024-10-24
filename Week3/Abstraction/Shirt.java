package Week3.Abstraction;

public abstract class Shirt {
    public String color;

    Shirt(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    // abstract method
    abstract String getDescription();
}

class Tshirt extends Shirt {
    public int size;
    public int price;

    Tshirt (String color, int size, int price) {
        super(color); 
        this.size = size;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "This is a " + color + " t-shirt size " + size + " priced at $" + price + ".";
    }
}
