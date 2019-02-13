package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Boris");

    Square s = new Square(5);
    System.out.println("Площ на квадрат " +s.l+ s.area());

    Rectangle r = new Rectangle(4,6);

    System.out.println("Площ на правоъгълник " + r.a + " и " + r.b + " = " + r.area());
  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

}