package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigMacBulider {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBulider bun(String bun) {
            if (bun.equalsIgnoreCase("sezam") || bun.equalsIgnoreCase("normal")) {
                this.bun = bun;
                return this;
            }
            throw new IllegalStateException("Bun should be 'sezam' or 'normal'");
        }

        public BigMacBulider burgers(int burgers) {
            if (burgers == 1 || burgers == 2) {
                this.burgers = burgers;
                return this;
            }
            throw new IllegalStateException("You can only use 1 or 2 burgers");
        }

        public BigMacBulider sauce(String sauce){
            if (sauce.equalsIgnoreCase("1000islands")|| sauce.equalsIgnoreCase("normal")|| sauce.equalsIgnoreCase("barbecue")){
                this.sauce = sauce;
                return this;
            }
            throw new IllegalStateException("Sacuce should be one of: '1000islands' or 'normal' or 'barbecue' ");
        }

        public BigMacBulider ingredient(String ingredient){
            if (ingredient.equalsIgnoreCase("lettuce")|| ingredient.equalsIgnoreCase("onion")|| ingredient.equalsIgnoreCase("bacon")||
            ingredient.equalsIgnoreCase("cucumber")|| ingredient.equalsIgnoreCase("chilli")|| ingredient.equalsIgnoreCase("mushroom")||
            ingredient.equalsIgnoreCase("shrimp") || ingredient.equalsIgnoreCase("cheese")){
                ingredients.add(ingredient);
                return this;
            }
            throw new IllegalStateException("Wrong ingredient");
        }

        public BigMac build(){
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }
}
