import Task1.Complex;
import Task1.ConcreteFactory;
import Task2.ChairFactory;
import Task2.Client;
import Task3.Menu;

public class Main {
    public static void main(String[] args) {
        //Упражнение 1
        Complex comp1 = new ConcreteFactory().createComplex();
        Complex comp2 = new ConcreteFactory().CreateComplex(5,5);
        //Упражнение 2
        Client client = new Client();
        client.setChair(new ChairFactory().createMagicanChair());
        client.sit();
        client.setChair(new ChairFactory().createFunctionalChair());
        client.sit();
        client.setChair(new ChairFactory().createVictorianChair());
        client.sit();
        //Упражнение 3
        new Menu();
    }
}
