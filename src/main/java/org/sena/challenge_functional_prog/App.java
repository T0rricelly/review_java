package org.sena.challenge_functional_prog;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Client> clientList = getClients();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese en numero de cliente");
        Long number = sc.nextLong();

        Optional<Client> client = searchClient(clientList, number);

        if (client.isPresent()) {
            Optional<String> address = getAddressClient(client);
            if (address.isPresent()){
                System.out.println("La direccion del cliente es: " + address.get());
            }else{
                System.out.println("Este cliente no tiene direccion");
            }
        }else{
            System.out.println("El cliente no existe");
        }
    }

    private static Optional<String> getAddressClient(Optional<Client> client) {
        Optional<String> result = client
                .map(Client::getAddress);
        return result;
    }

    private static Optional<Client> searchClient(List<Client> clientList, Long number) {
        Optional<Client> result = clientList.stream()
                .filter((client) -> client.getNumberClient().equals(number))
                .findFirst();
        return result;
    }

    private static List<Client> getClients() {

        List<Client> clients = Arrays.asList(
                new Client(1L, "Juan", "Pérez", null, "1111-1111"),
                new Client(2L, "María", "Gómez", "Av. Siempre Viva 742", "2222-2222"),
                new Client(3L, "Carlos", "López", "Mitre 100", "3333-3333"),
                new Client(4L, "Lucía", "Martínez", "Belgrano 456", "4444-4444"),
                new Client(5L, "Ana", "Fernández", "San Martín 789", "5555-5555"),
                new Client(6L, "Pedro", "Sánchez", null, "3333-4444"),
                new Client(7L, "Laura", "Díaz", "Corrientes 202", "7777-7777"),
                new Client(8L, "Diego", "Ramírez", null, "8888-8888"),
                new Client(9L, "Suscribite", "Todocode", "Internet 404", "9999-9999"),
                new Client(10L, "Valeria", "Acosta", null, "0000-0000")
        );

        return clients;

    }


}
