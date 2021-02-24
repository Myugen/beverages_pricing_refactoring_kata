package coffee_shop.makers;

public interface TeaMaker extends Maker {
    TeaMaker withMilk();
    TeaMaker withCinnamon();
}
