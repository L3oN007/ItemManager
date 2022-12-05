package DTO;

import Tools.MyTool;

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

    public void outputStatue() {
        System.out.println("--------STATUE--------");
        output();
        System.out.println("weight: " + weight);
        System.out.println("colour: " + colour);
        System.out.println("----------------------");
    }

    public void inputStatue() {
        input();
        weight = MyTool.getInt("Enter weight:");
        colour = MyTool.getString("Enter colour: ");
    }

}
