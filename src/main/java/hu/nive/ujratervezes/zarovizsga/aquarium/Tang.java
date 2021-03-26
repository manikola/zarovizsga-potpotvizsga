package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish{


    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss = true;
    }

    public void feed() {
        this.weight = weight +1;
        this.memoryLoss = true;
    }

    @Override
    public String status() {
        return super.status();
    }
}
