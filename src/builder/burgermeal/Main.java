package builder.burgermeal;

class Main {
    public static void main(String[] args){
        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat","veg").build();

        BurgerMeal burgerWithCheese = new BurgerMeal.BurgerBuilder("wheat","cheese")
                .withCheese(true)
                .build();
    }
}
