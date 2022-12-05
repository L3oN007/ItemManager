package DTO;

import Tools.MyTool;

/**
 *
 * @author L3oN
 */
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {

    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

    void intputVase() {
        input();
        height = MyTool.getInt("Enter height:");
        material = MyTool.getString("Enter material:");
    }

}
