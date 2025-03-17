package hw7_cofeeOrder;

public class CoffeeStarter {

    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.addOrder(new Order("Alen"));
        coffeeOrderBoard.addOrder(new Order("Yoda"));
        coffeeOrderBoard.addOrder(new Order("Obi-van"));
        coffeeOrderBoard.addOrder(new Order("John Snow"));

        coffeeOrderBoard.draw();
        System.out.println("Delivered order: ");
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println();

        coffeeOrderBoard.draw();
        System.out.println("Added new order: ");
        coffeeOrderBoard.addOrder(new Order(("Emily")));
        System.out.println();

        coffeeOrderBoard.draw();
        System.out.println("Delivered order by number: ");
        System.out.println(coffeeOrderBoard.deliver(3));
        coffeeOrderBoard.draw();

    }

}
