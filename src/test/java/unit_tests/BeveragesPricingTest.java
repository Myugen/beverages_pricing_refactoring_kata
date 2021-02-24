package unit_tests;

import beverages.*;
import beverages.suplements.WithCream;
import beverages.suplements.WithMilk;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {

    public static final double PRECISION = 0.001;

    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, PRECISION)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, PRECISION)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = new WithMilk(new Tea());
        assertThat(teaWithMilk.price(), is(closeTo(1.60, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = new WithMilk(new Coffee());
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage coffeeWithMilkAndCream = new WithCream(new WithMilk(new Coffee()));
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = new WithCream(new HotChocolate());
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, PRECISION)));
    }
}
