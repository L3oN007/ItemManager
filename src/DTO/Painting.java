package DTO;

import Tools.MyTool;

/**
 *
 * @author L3oN
 */
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {

    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        System.out.println("--------PAINTING--------");
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
        System.out.println("------------------------");
    }

    public void inputPainting() {
        input();
        height = MyTool.getInt("Enter height:");
        width = MyTool.getInt("Enter width:");
        isWatercolour = MyTool.confirmYesNo("Is Watercolour(Y/N): ");
        isFramed = MyTool.confirmYesNo("Is Framed(Y/N): ");
    }

}
