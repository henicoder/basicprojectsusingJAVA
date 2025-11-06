public class DeluxPizza extends Pizza {
    private final boolean veg;

    public DeluxPizza(boolean veg) {
        super(veg);
        this.veg = veg;
        super.addExtraCheese();
        super.addExtraToppings();
    }

        @Override
        public void addExtraCheese () {

        }

        @Override
        public void addExtraToppings () {

        }
    }

