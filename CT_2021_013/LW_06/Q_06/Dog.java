package Q_06;

class Dog extends Pet {
    private double weight;

    public Dog(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public String getType() {
        return "Dog";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
