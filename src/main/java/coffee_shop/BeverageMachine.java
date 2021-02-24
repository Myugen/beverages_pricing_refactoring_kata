package coffee_shop;

import coffee_shop.makers.CoffeeMaker;
import coffee_shop.makers.HotChocolateMaker;
import coffee_shop.makers.TeaMaker;
import coffee_shop.menu.beverages.Beverage;
import coffee_shop.menu.beverages.Coffee;
import coffee_shop.menu.beverages.HotChocolate;
import coffee_shop.menu.beverages.Tea;
import coffee_shop.menu.supplements.WithCinnamon;
import coffee_shop.menu.supplements.WithCream;
import coffee_shop.menu.supplements.WithMilk;

public class BeverageMachine implements CoffeeMaker, TeaMaker, HotChocolateMaker {

    public static CoffeeMaker coffee() {
        return new BeverageMachine(new Coffee());
    }

    public static TeaMaker tea() {
        return new BeverageMachine(new Tea());
    }

    public static HotChocolateMaker hotChocolate() {
        return new BeverageMachine(new HotChocolate());
    }

    private Beverage beverage;

    public BeverageMachine(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Beverage make() {
        return beverage;
    }

    @Override
    public BeverageMachine withMilk() {
        beverage = new WithMilk(beverage);
        return this;
    }

    @Override
    public BeverageMachine withCream() {
        beverage = new WithCream(beverage);
        return this;
    }

    @Override
    public BeverageMachine withCinnamon() {
        beverage = new WithCinnamon(beverage);
        return this;
    }
}
