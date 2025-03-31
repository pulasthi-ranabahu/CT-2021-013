package Q_02;

public class Temp {
    private double celsius;

    public Temp() {
        this.celsius = 0.0;
    }

    public Temp(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}