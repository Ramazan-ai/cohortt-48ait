import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CafeReservation {
    private static Map<Integer, String> tables = new HashMap<>();
    private static final int TOTAL_TABLES = 10;

    public static void main(String[] args) {
        //инилизация столиков
        for (int i = 0; i < TOTAL_TABLES; i++) {
            tables.put(i, null);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Willkomen im Cafe");
                System.out.println("1. Tisch reservieren");
                System.out.println("2.Freie Tabelle");
                System.out.println("3.Belegte Tabelle anzeigen");
                System.out.println("4.Beenden");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        reserveTable(scanner);
                        break;
                    case 2:
                        freeTable(scanner);
                        break;
                    case 3:
                        showReservedTables();
                        break;
                    case 4:
                        System.out.println("Danke Auf Wiedersehen");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Position nicht gefunden");
                }
            }

        }
    }

    private static void reserveTable(Scanner scanner) {
        System.out.println("Bite number aingeben(1-TOTAL_TABLES + ): ");
        int tableNumber = scanner.nextInt();
        scanner.nextLine();// очистка буфера
        if (tableNumber < 1 || tableNumber > TOTAL_TABLES) {
            System.out.println("Position nicht gefunden");
            return;
        }
        if (tables.get(tableNumber) != null) {
            System.out.println("Tisch " + tableNumber + " bereits gebucht");

        } else {
            System.out.println("Geben sie ihren Namen ein");
            String name = scanner.nextLine();
            tables.put(tableNumber, name);
            System.out.println("Tisch " + tableNumber + " erfolgreich gebucht unter dem Name: " + name);
        }
    }

    private static void freeTable(Scanner scanner) {
        System.out.print("Geben Sie Tischnummer ein(1-" + TOTAL_TABLES + "),die du befrein möchtest: ");
        int tablenumer = scanner.nextInt();
        if (tablenumer < 1 || tablenumer > TOTAL_TABLES) {
            System.out.println("Falsche Tischnummer.");
            return;
        }
        if (tables.get(tablenumer) == null) {
            System.out.println("Tisch " + tablenumer + " nicht gebucht.");

        } else {
            tables.put(tablenumer, null);
            System.out.println("Tisch " + tablenumer + " freigegeben");
        }

    }

    private static void showReservedTables() {
        System.out.println("Besetzte Tische");
        for (int i = 0; i <= TOTAL_TABLES; i++) {
            if (tables.get(i) != null) {
                System.out.println("Tisch " + i + "gebucht unter dem Namen: " + tables.get(i));
            }

        }
    }
}
