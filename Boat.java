
public class Boat extends Vehicle {

// Constructor

    public Boat (String brand) {
      super (brand);
    }

// implementation of the body of the method do Stuff()  ==

    @Override
    public String doStuff () {
      return ("I'm "+this.getBrand()+" and I go glug glug glug!");
    }

}
