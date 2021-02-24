package coffee_shop;

import coffee_shop.menu.beverages.Beverage;
import coffee_shop.menu.beverages.Coffee;
import coffee_shop.menu.beverages.HotChocolate;
import coffee_shop.menu.beverages.Tea;
import coffee_shop.menu.supplements.WithCinnamon;
import coffee_shop.menu.supplements.WithCream;
import coffee_shop.menu.supplements.WithMilk;

public class BeverageMachine {

    public static CoffeeBuilder coffee() {
        return new CoffeeBuilder();
    }

    public static TeaBuilder tea() {
        return new TeaBuilder();
    }

    public static HotChocolateBuilder hotChocolate() {
        return new HotChocolateBuilder();
    }

    public static class CoffeeBuilder {
        private Beverage beverage;

        private CoffeeBuilder() {
            this.beverage = new Coffee();
        }

        public Beverage make() {
            return beverage;
        }

        public CoffeeBuilder withMilk() {
            beverage = new WithMilk(beverage);
            return this;
        }

        public CoffeeBuilder withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }

        public CoffeeBuilder withCream() {
            beverage = new WithCream(beverage);
            return this;
        }
    }

    public static class TeaBuilder {
        private Beverage beverage;

        private TeaBuilder() {
            this.beverage = new Tea();
        }

        public Beverage make() {
            return beverage;
        }

        public TeaBuilder withMilk() {
            beverage = new WithMilk(beverage);
            return this;
        }

        public TeaBuilder withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }
    }

    public static class HotChocolateBuilder {
        private Beverage beverage;

        private HotChocolateBuilder() {
            this.beverage = new HotChocolate();
        }

        public Beverage make() {
            return beverage;
        }

        public HotChocolateBuilder withCinnamon() {
            beverage = new WithCinnamon(beverage);
            return this;
        }

        public HotChocolateBuilder withCream() {
            beverage = new WithCream(beverage);
            return this;
        }
    }
}
