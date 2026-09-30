package java.com.github.abdelrahman_01111.App.models;

public class Item {
    private int itemID;
    private String name;
    private String category;
    private int quantity;
    private float price;

    public Item(int itemID, String name, String category, int quantity,float price ) {
        this.itemID = itemID;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price=price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
