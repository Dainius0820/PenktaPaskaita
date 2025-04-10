import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Item preke = new Item();
        preke.title = "Traktorius";
        preke.description = "Gera yra, viskas veikia";
        preke.price = 5_000.0;

        System.out.println(preke.title + " " + preke.description + " " + preke.price);
        System.out.println(preke);

        Item katamaranas = new Item();
        katamaranas.title = "Katamaranas";
        katamaranas.description = "Paturbintas Prostor modelis, nauji dvigubi pantonai, dvi bures";
        katamaranas.price = 2_700;
        System.out.println(katamaranas);

        Item preke2 = new Item("Printeris", "ant daliu", 50); // pilnas konstruktorius
        System.out.println(preke2);


        Building house = new Building();
        house.year = 1976;
        house.floors = 5;
        house.flats = 60;
        house.type = "Plytinis";

        Building house2 = new Building();
        house2.year = 2024;
        house2.floors = 2;
        house2.flats = 4;
        house2.type = "Duju silikato blokeliu";

        System.out.println(house.flatsPerFloor());
        System.out.println(house2.flatsPerFloor());

        System.out.println(house.buildingAge());
        System.out.println(house2.buildingAge());


        Car car = new Car();
        car.setManufacturer("Peugeot");
        car.setColor("Pilka");
        System.out.println(car.getManufacturer());
        System.out.println(car.getColor());
         */
        System.out.println("\n----------------------------- TASK 1 -----------------------------\n");

        Book book1 = new Book();
        book1.setTitle("Žiedų valdovas. Žiedo brolija");
        book1.setPages(423);
        book1.setReleaseYear(1954);

        Book book2 = new Book();
        book2.setTitle("Žiedų valdovas. Dvi tvirtovės");
        book2.setPages(352);
        book2.setReleaseYear(1954);

        Book book3 = new Book();
        book3.setTitle("Žiedų valdovas. Karaliaus sugrįžimas");
        book3.setPages(416);
        book3.setReleaseYear(1955);

        Book book4 = new Book("Didydsis Getsbis", 175, 1924);
        Book book5 = new Book("SAPIENS: glausta žmonijos istorija", 416, 2020);
        Book book6 = new Book("HOMO DEUS: glausta rytojaus istorija", 414, 2018);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        for (int i = 0; i < books.size(); i++) {
            System.out.println("Knygos pavadinimas: " + books.get(i).getTitle());
            System.out.println("Puslapių skaičius: " + books.get(i).getPages());
            System.out.println("Publikavimo metai: " + books.get(i).getReleaseYear() + "\n");
        }

        System.out.println("\n----------------------------- TASK 2 -----------------------------\n");

        Plant plant1 = new Plant();
        plant1.setCommonName("Skėtinė rieskė");
        plant1.setLatinName("Holosteum umbellatum");
        plant1.setIsAnnual(true);
        plant1.setContinent("Europa");
        plant1.setHeightGrown(0.145);
        plant1.setIsEdible(false);

        Plant plant2 = new Plant();
        plant1.setCommonName("Geltonžiedė plukė");
        plant1.setLatinName("Anemone ranunculoides");
        plant1.setIsAnnual(true);
        plant1.setContinent("Europa");
        plant1.setHeightGrown(0.17);
        plant1.setIsEdible(false);

        Plant plant3 = new Plant("Baltažiedis vairenis", "Arabidopsis thaliana",
                true, "Europa", 0.135, false);

        Plant plant4 = new Plant("Tripirštė uolaskėlė", "Saxifraga tridactylites",
                true, "Europa", 0.128, false);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));
        }

    }
}