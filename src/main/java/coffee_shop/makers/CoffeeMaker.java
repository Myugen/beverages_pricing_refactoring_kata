package coffee_shop.makers;

public interface CoffeeMaker extends Maker {
    CoffeeMaker withMilk();
    CoffeeMaker withCream();
    CoffeeMaker withCinnamon();
}
