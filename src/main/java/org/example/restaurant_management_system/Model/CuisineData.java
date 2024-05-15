package org.example.restaurant_management_system.Model;

import java.util.Date;

public class CuisineData {
    private Integer id;
    private String cuisineId;
    private String cuisineName;
    private String type;
    private Integer stock;
    private Double price;
    private String status;
    private String image;
    private Date date;
    private Integer quantity;

    public CuisineData(Integer id, String cuisineId,
                       String cuisineName, String type, Integer stock,
                       Double price, String status, String image, Date date) {
        this.id = id;
        this.cuisineId = cuisineId;
        this.cuisineName = cuisineName;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.status = status;
        this.image = image;
        this.date = date;
    }

    public CuisineData(Integer id, String cuisineId, String cuisineName,
                       String type, Integer quantity, Double price, String image, Date date){
        this.id = id;
        this.cuisineId = cuisineId;
        this.cuisineName = cuisineName;
        this.type = type;
        this.price = price;
        this.image = image;
        this.date = date;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public String getType(){
        return type;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getImage() {
        return image;
    }

    public Date getDate() {
        return date;
    }

    public Integer getQuantity(){
        return quantity;
    }
}
