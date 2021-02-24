package coffee_shop.menu.supplements;

import coffee_shop.menu.beverages.Beverage;

public class WithMilk implements Beverage {
    private final Beverage beverage;

    public WithMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.10;
    }
}
