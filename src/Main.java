public class Main {
  public static void main(String[] args) {
    int ticketPrice = 50_000;
    int bonusMilePrice = 20;
    int bonus = ticketPrice / bonusMilePrice;
    System.out.println("Вам начислено " + bonus + " бонусных  миль");
  }
}
