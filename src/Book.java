public class Book {

    private String title;

    private int pages;

    private int releaseYear;

    public Book () {
    }

    public Book (String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    public String getTitle () {
        return this.title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public int getPages () {
        return this.pages;
    }

    public void setPages (int pages) {
        this.pages = pages;
    }

    public int getReleaseYear () {
        return this.releaseYear;
    }

    public void setReleaseYear (int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /*
    public String toString () {
        return "Knygos pavadinimas: " + this.title +
                " Puslapių skaičius: " + this.pages + " Publikavimo metai: " + this.releaseYear;
    }
     */

}
