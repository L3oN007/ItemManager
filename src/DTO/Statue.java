package DTO;

/**
 *
 * @author L3oN
 */
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {

    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void outputStatue() {
    }

    void intputStatue() {
    }

}
