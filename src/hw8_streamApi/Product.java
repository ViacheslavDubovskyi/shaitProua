package hw8_streamApi;

import java.time.LocalDate;

public class Product {

    private String type;
    private double price;
    private boolean isDiscount;
    private LocalDate createDate;

    public Product(String productType, double price, boolean isDiscount, LocalDate createDate) {
        this.type = productType;
        this.price = price;
        this.isDiscount = isDiscount;
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType='" + type + '\'' +
                ", price=" + price +
                ", isDiscount=" + isDiscount +
                ", createDate=" + createDate +
                '}';
    }
}
