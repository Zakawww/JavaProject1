import models.Cashier;
import services.Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.addNewClient("Dolon");
        queue.addNewClient("Sanjar");
        queue.addNewClient("Adilet");
        queue.addNewClient("Aidana");

        queue.showQueue();

        Cashier cashier = new Cashier("Alisa", 101);
        queue.getNextClient(cashier);
        queue.showQueue();
        queue.getNextClient(cashier);
        queue.showQueue();
        queue.getNextClient(cashier);


        queue.showQueue();

    }
}