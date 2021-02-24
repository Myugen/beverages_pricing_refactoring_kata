package coffee_shop.makers;

public interface HotChocolateMaker extends Maker {
    HotChocolateMaker withCream();
    HotChocolateMaker withCinnamon();
}
