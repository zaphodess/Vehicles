public class Hangar {

public static void main (String [] args) {

  Car toyota = new Car ("Toyota");

  Car porsche = new Car ("Porsche");

  Boat blackPearl = new Boat ("Black Pearl");
  Boat bounty = new Boat ("Bounty");

  System.out.println (toyota.doStuff());
  System.out.println (blackPearl.doStuff());
  System.out.println (porsche.doStuff());
  System.out.println (bounty.doStuff());

}
}
