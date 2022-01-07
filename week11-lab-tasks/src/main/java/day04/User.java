package day04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private int money;
    private List<Item> purchasedItems = new ArrayList<>();

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public double getMoney() {
        return money;
    }

    public List<Item> getPurchasedItems() {
        return new ArrayList<>(purchasedItems);
    }

    public void buy(Item item) {
        if (money - item.price < 0) {
            throw new IllegalStateException("Not enough money!");
        }
        item.setExpirationDate(LocalDate.now());
        if (item instanceof Product && item.price >= money * 3) {
            item.price += (int) (item.price / 10D);
            ((Product) item).extendExpirationDate();
        }
        money -= item.price;
        purchasedItems.add(item);
    }
}