package models;

public class Client {
    private final int number;
    private String name;
    private boolean isWaiting = true;


    public Client(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Client(int number) {
        this.number = number;
    }

    public void setWaiting(boolean waiting) {
        isWaiting = waiting;
    }

    public boolean isWaiting() {
        return isWaiting;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}