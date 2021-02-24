package unit_tests;

import coffee_shop.BeverageMachine;
import coffee_shop.menu.beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {

    public static final double PRECISION = 0.001;

    @Test
    public void computes_coffee_price() {
        Beverage coffee = BeverageMachine.coffee().make();
        assertThat(coffee.price(), is(closeTo(1.20, PRECISION)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = BeverageMachine.tea().make();
        assertThat(tea.price(), is(closeTo(1.50, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = BeverageMachine.hotChocolate().make();
        assertThat(hotChocolate.price(), is(closeTo(1.45, PRECISION)));
    }

    @Test
    public void computes_tea_with_cinnamon_price() {
        Beverage teaWithCinnamon = BeverageMachine.tea().withCinnamon().make();
        assertThat(teaWithCinnamon.price(), is(closeTo(1.55, PRECISION)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = BeverageMachine.tea().withMilk().make();
        assertThat(teaWithMilk.price(), is(closeTo(1.60, PRECISION)));
    }

    @Test
    public void computes_tea_with_milk_and_cinnamon_price() {
        Beverage teaWithMilkAndCinnamon = BeverageMachine.tea().withMilk().withCinnamon().make();
        assertThat(teaWithMilkAndCinnamon.price(), is(closeTo(1.65, PRECISION)));
    }

    @Test
    public void computes_coffee_with_cinnamon_price() {
        Beverage coffeeWithCinnamon = BeverageMachine.coffee().withCinnamon().make();
        assertThat(coffeeWithCinnamon.price(), is(closeTo(1.25, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = BeverageMachine.coffee().withMilk().make();
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_and_cinnamon_price() {
        Beverage coffeeWithMilkAndCinnamon = BeverageMachine.coffee().withMilk().withCinnamon().make();
        assertThat(coffeeWithMilkAndCinnamon.price(), is(closeTo(1.35, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage coffeeWithMilkAndCream = BeverageMachine.coffee().withMilk().withCream().make();
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_and_cinnamon_price() {
        Beverage coffeeWithMilkAndCreamAndCinnamon = BeverageMachine.coffee().withMilk().withCream().withCinnamon().make();
        assertThat(coffeeWithMilkAndCreamAndCinnamon.price(), is(closeTo(1.5, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_with_cinnamon_price() {
        Beverage hotChocolateWithCinnamon = BeverageMachine.hotChocolate().withCinnamon().make();
        assertThat(hotChocolateWithCinnamon.price(),  is(closeTo(1.5, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = BeverageMachine.hotChocolate().withCream().make();
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_and_cinnamon_price() {
        Beverage hotChocolateWithCreamAndCinnamon = BeverageMachine.hotChocolate().withCream().withCinnamon().make();
        assertThat(hotChocolateWithCreamAndCinnamon.price(),  is(closeTo(1.65, PRECISION)));
    }
}
