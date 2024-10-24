package Week3.Inheritance;

public class Parent {
    public String lastName;
    public String eyeColor;
    
    public Parent(String lastName, String eyeColor) {
        this.lastName = lastName;
        this.eyeColor = eyeColor;
    }
    
    public String getLastName(){
        return lastName;
    }
}

class Child extends Parent { 
    public String firstName;
    
    Child (String firstName, String lastName, String eyeColor) {
        super(lastName, eyeColor);
        this.firstName = firstName;
    }

    public String getFirstLastName() {
        return firstName + " " + lastName;
    }

    public String getEyeColor() {
        return eyeColor;
    }
    
}
