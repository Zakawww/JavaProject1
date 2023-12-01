package models;

public class Cashier {

    private final int tableNumber;

    public Cashier(String name, int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

}