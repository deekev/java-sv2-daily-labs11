package day04;

import java.time.LocalDate;

public class Product extends Item {

    public Product(String name, int price) {
        super(name, price);
    }

    @Override
    public void setExpirationDate(LocalDate dateOfSell) {
        expirationDate = dateOfSell.plusMonths(3);
    }

    public void extendExpirationDate() {
        expirationDate = expirationDate.plusMonths(33);
    }

    @Override
    public Item copy() {
        return new Product(getName(), getPrice());
    }
}
