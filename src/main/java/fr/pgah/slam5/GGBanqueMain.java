package fr.pgah.slam5;

import java.util.HashMap;
import java.util.Scanner;

public class GGBanqueMain {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Compte> comptes = new HashMap<>();
        Banque banque = new Banque(comptes);
        BanqueClient client = new BanqueClient(scanner, banque);
        client.run();
    }
}