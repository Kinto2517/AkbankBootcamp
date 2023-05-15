package org.example.Classes;

import java.util.List;

public class Client {

    private final int id;
    private String name;
    private String sector;


    public Client(int id, String name, String sector) {
        this.id = id;
        this.name = name;
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSector() {
        return sector;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }

    public static Client getClientById(List<Client> clients, int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

}
