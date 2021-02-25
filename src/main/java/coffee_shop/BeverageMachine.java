package coffee_shop;

import coffee_shop.menu.beverages.Beverage;
import coffee_shop.menu.beverages.Coffee;
import coffee_shop.menu.beverages.HotChocolate;
import coffee_shop.menu.beverages.Tea;
import coffee_shop.menu.supplements.WithCinnamon;
import coffee_shop.menu.supplements.WithCream;
import coffee_shop.menu.supplements.WithMilk;

public class BeverageMachine {

    public static CoffeeMaker coffee() {
        return new CoffeeMaker();
    }

    public static TeaMaker tea() {
        return new TeaMaker();
    }

    public static HotChocolateMaker hotChocolate() {
        return new HotChocolateMaker();
    }

    public static class CoffeeMaker {
        private Beverage beverage;

        private CoffeeMaker() {
            this.beverage = new Coffee();
        }

        public Beverage make() {
            return beverage;
        }

        public CoffeeMaker withMilk() {
            beverage = new WithMilk(beverage);
            return this;
        }

        public CoffeeMaker withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }

        public CoffeeMaker withCream() {
            beverage = new WithCream(beverage);
            return this;
        }
    }

    public static class TeaMaker {
        private Beverage beverage;

        private TeaMaker() {
            this.beverage = new Tea();
        }

        public Beverage make() {
            return beverage;
        }

        public TeaMaker withMilk() {
            beverage = new WithMilk(beverage);
            return this;
        }

        public TeaMaker withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }
    }

    public static class HotChocolateMaker {
        private Beverage beverage;

        private HotChocolateMaker() {
            this.beverage = new HotChocolate();
        }

        public Beverage make() {
            return beverage;
        }

        public HotChocolateMaker withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }

        public HotChocolateMaker withCream() {
            beverage = new WithCream(beverage);
            return this;
        }
    }
}
