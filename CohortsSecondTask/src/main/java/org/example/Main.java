package org.example;

import org.example.Classes.Client;
import org.example.Classes.Invoice;
import org.example.Classes.Order;
import org.example.Services.OrderService;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = List.of(
                new Client(1, "John C", "IT"),
                new Client(2, "Marc", "Finance"),
                new Client(3, "Peter", "Sales")
        );
        // All clients
        System.out.println("***All clients:");
        clients.stream().forEach(System.out::println);

        System.out.println("\n***All clients with name containing \"C\":");
        // All clients with name containing "C"
        clients.stream().filter(c -> c.getName().contains("C")).forEach(System.out::println);

        List<Invoice> invoices = List.of(
                new Invoice(1, 1000, "June", clients.get(0)),
                new Invoice(2, 500, "June", clients.get(1)),
                new Invoice(3, 800, "June", clients.get(2)),
                new Invoice(4, 2000, "July", clients.get(0)),
                new Invoice(5, 3000, "August", clients.get(1)),
                new Invoice(6, 400, "June", clients.get(2))
        );

        // All invoices in June
        double totalInJune = invoices.stream()
                .filter(i -> i.getDate().equals("June"))
                .mapToDouble(Invoice::getAmount)
                .sum();

        System.out.println("\n***Total amount of invoices in June:");
        System.out.println(totalInJune);

        System.out.println("\n***All invoices:");
        // All invoices
        invoices.stream()
                .forEach(i -> System.out.println(i.getClient().getName()));

        System.out.println("\n***All invoices with amount over 1500:");
        // All invoices with amount over 1500
        invoices.stream()
                .filter(i -> i.getAmount() > 1500)
                .forEach(System.out::println);

        // Average amount of invoices over 1500
        double averageAmountOver1500 = invoices.stream()
                .filter(i -> i.getAmount() > 1500)
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0);

        System.out.println("\n***Average amount of invoices over 1500:");
        System.out.println(averageAmountOver1500);

        // Client names with invoices below 500
        System.out.println("\n***Client names with invoices below 500:");
        invoices.stream()
                .filter(i -> i.getAmount() < 500)
                .map(i -> i.getClient().getName())
                .forEach(System.out::println);


        // All invoices in June grouped by client
        System.out.println("\n***All invoices in June grouped by client that has below the average amount of 750:");
        invoices.stream()
                .filter(invoice -> invoice.getDate().equals("June"))
                .collect(Collectors.groupingBy(invoice -> invoice.getClient().getSector()))
                .forEach((sector, invoicesBySector) -> {
                    double averageAmount = invoicesBySector.stream()
                            .mapToDouble(Invoice::getAmount)
                            .average()
                            .orElse(0);
                    if (averageAmount < 750) {
                        System.out.println("Sector: " + sector);
                    }
                });

    }
}