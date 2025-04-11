public class Weather {
    private String title;
    private double temperature;
    private double humidity;
    private double sunPercentage;
    private double PSA;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getSunPercentage() {
        return sunPercentage;
    }

    public void setSunPercentage(double sunPercentage) {
        this.sunPercentage = sunPercentage;
    }

    public double getPSA() {
        return PSA;
    }

    public void setPSA(double PSA) {
        this.PSA = PSA;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "title='" + title + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", sunPercentage=" + sunPercentage +
                ", PSA=" + PSA +
                '}';
    }
}
