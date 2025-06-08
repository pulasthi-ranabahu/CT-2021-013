package Q_03;

class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getType() {
        return "Unknown";
    }

    public String getName() {
        return name;
    }
}