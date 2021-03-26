package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish{
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void feed() {
        this.weight = weight + 2;
    }

    @Override
    public String status() {
        return super.status();
    }
}
