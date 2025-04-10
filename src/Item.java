public class Item {
    // properties
    public String title;

    public String description;

    public double price;

    //konstruktoriai

    public Item(){ // tuscias konstruktorius (egzistuoja nematomai sukurus klase.
        // Reikia apsirasyti kai sukuriamas pilnas konstruktorius)

    }
    public Item (String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }


    @Override
    public String toString () { // dinaminis metodas (jei yra bent 1 zodis this).
        return "Title: " + this.title + ", Description: " + this.description + ", Price: " + this.price;
    }
}
