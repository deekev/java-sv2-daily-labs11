package day04;

import java.time.LocalDate;

public class Service extends Item {

    public Service(String name, int price) {
        super(name, price);
    }

    @Override
    public void setExpirationDate(LocalDate dateOfSell) {
        expirationDate = dateOfSell.plusYears(1);
    }

    @Override
    public Item copy() {
        return new Service(getName(), getPrice());
    }
}