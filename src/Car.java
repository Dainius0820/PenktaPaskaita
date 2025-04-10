public class Car {

    private String manufacturer;

    private String color;

    // inkapsuliacija

    public String getManufacturer(){ // getteris
        return this.manufacturer;
    }

    public void setManufacturer (String manufacturer) { // setteris
        this.manufacturer = manufacturer;
    }

    public String getColor () {
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // private pasiekiama tik klases viduje
}
