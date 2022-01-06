package day04;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<Item> itemsForSale = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void buyItem(String userName, String nameOfItem) {
        User user = searchUser(userName);
        Item item = searchItem(nameOfItem);
        user.buy(item.copy());
    }

    private Item searchItem(String name) {
        for (Item actual: itemsForSale) {
            if (name.equals(actual.getName())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("No such item!");
    }

    private User searchUser(String userName) {
        for (User actual: users) {
            if (userName.equals(actual.getUserName())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("No such user!");
    }
}
