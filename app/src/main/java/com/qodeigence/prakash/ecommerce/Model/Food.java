package com.qodeigence.prakash.ecommerce.Model;

public class Food {
    private String Name,Image,Description,Price,Discount;

    public Food() {
    }

    public Food(String name, String image, String description, String price, String discount) {
        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }
}
