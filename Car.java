public class Car extends Vehicle {

  // Constructor

      public Car (String brand) {
        super (brand);
      }

// implementation of the body of the method do Stuff()  ==

      @Override
      public String doStuff () {
      return ("I'm "+this.getBrand()+" and I go zoom zoom zoom!");
      }

}
