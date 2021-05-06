package com.goodsense.goodsense.models;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {


    public String name;

    public String description;

    public List<Ingredient> inredients = new ArrayList();

    public Double price;


    public Product(String name, String description, ArrayList ingredients, Double price){
        this.name = name;
        this.description = description;
        this.inredients = ingredients;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName()) && Objects.equals(getDescription(), product.getDescription()) && Objects.equals(getInredients(), product.getInredients()) && Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getInredients(), getPrice());
    }
}
