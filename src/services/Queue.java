package services;


import models.Cashier;
import models.Client;

public class Queue {

    private Client[] clients;
    private int queueNumber = 0;

    public Queue() {
        this.clients = new Client[10];
    }

    public void addNewClient(String name){
        queueNumber++;
        Client client = new Client(queueNumber, name);
        addClientToArray(client);
    }

    public Client getNextClient(){
        Client client = null;
        for (Client value : clients) {
            if (value != null && value.isWaiting()) {
                value.setWaiting(false);
                client = value;
                break;
            }
        }
        return client;
    }

    private void addClientToArray(Client client) {
        int index = getIndexForClient();
        clients[index] = client;
    }

    private int getIndexForClient() {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null)
                return i;
        }

        int index = clients.length;

        Client[] newClients = new Client[clients.length + 10];

        System.arraycopy(clients, 0, newClients, 0, clients.length);

        clients = newClients;

        return index;

    }

    public void showQueue(){
        for (Client client: clients) {
            if (client == null)
                continue;
            System.out.println("Очередь №" + client.getNumber() + ". Имя: " + client.getName() + ". Статус: " + (client.isWaiting() ? "В ожидании" : "Закрыт"));
        }
    }


    public void getNextClient(Cashier cashier) {
        Client client = getNextClient();

        if (client == null){
            System.out.println("Клиентов в очереди нет!");
        }

        assert client != null;
        System.out.println("Клиент №" + client.getNumber() +", подойдите к окну №"+ cashier.getTableNumber());

    }
}