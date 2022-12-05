package DTO;

import Tools.MyTool;

/**
 *
 * @author L3oN
 */
public class Item {
    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }

    void input() {
        value = MyTool.getInt("Enter value: ");
        creator = MyTool.getString("Enter creator: ");
    }

}
