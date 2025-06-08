package Q_05;

class Cat extends Pet {
    private String coatColor;

    public Cat(String name, String coatColor) {
        super(name);
        this.coatColor = coatColor;
    }

    public String getType() {
        return "Cat";
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}
