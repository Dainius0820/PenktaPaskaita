public class Plant {

    private String commonName;
    private String latinName;
    private boolean isAnnual;
    private String continent;
    private double heightGrown;
    private boolean isEdible;

    public Plant () {
    }

    public Plant (String commonName, String latinName, boolean isAnnual,
                  String continent, double heightGrown, boolean isEdible) {
        this.commonName = commonName;
        this.latinName = latinName;
        this.isAnnual = isAnnual;
        this.continent = continent;
        this.heightGrown = heightGrown;
        this.isEdible = isEdible;
    }

    public String getCommonName () {
        return this.commonName;
    }
    public void setCommonName (String commonName) {
        this.commonName = commonName;
    }

    public String getLatinName () {
        return this.latinName;
    }
    public void setLatinName (String latinName) {
        this.latinName = latinName;
    }

    public boolean getIsAnnual () {
        return this.isAnnual;
    }
    public void setIsAnnual (boolean isAnnual) {
        this.isAnnual = isAnnual;
    }

    public String getContinent () {
        return this.continent;
    }
    public void setContinent (String continent) {
        this.continent = continent;
    }

    public double getHeightGrown () {
        return this.heightGrown;
    }
    public void setHeightGrown (double heightGrown) {
        this.heightGrown = heightGrown;
    }

    public boolean getIsEdible () {
        return this.isEdible;
    }
    public void setIsEdible (boolean isEdible) {
        this.isEdible = isEdible;
    }

    @Override
    public String toString () {
        return "Bendras pavadinimas: " + this.commonName +
                ", lotyniškas pavadinimas: " + this.latinName +
                ", ar vienmetis: " + this.isAnnual + ", žemynas: " +
                this.continent + ", suaugusio augalo aukštis: " +
                this.heightGrown + "m, ar valgomas?: " + this.isEdible;
    }









}
