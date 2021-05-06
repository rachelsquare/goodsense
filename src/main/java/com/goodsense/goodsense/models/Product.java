package com.goodsense.goodsense.models;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product extends AbstractEntity{

    public List<Ingredient> inredients = new ArrayList();

    public Double price;

    public String description;

    public Product(ArrayList ingredients, Double price, String description){
        super();
        this.inredients = ingredients;
        this.price = price;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getInredients() {
        return inredients;
    }

    public void setInredients(List<Ingredient> inredients) {
        this.inredients = inredients;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
}
