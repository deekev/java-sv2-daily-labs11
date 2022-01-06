package day04;

import java.time.LocalDate;

public abstract class Item {

    protected String name;
    protected int price;
    protected LocalDate expirationDate;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public abstract void setExpirationDate(LocalDate dateOfSell);
    public abstract Item copy();
}