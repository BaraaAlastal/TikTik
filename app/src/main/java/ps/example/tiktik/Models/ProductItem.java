package ps.example.tiktik.Models;

public class ProductItem {
    private int productImg;
    private String productName;
    private String price;
    private String discount;
    private int minusImg;
    private String numsItems;
    private int plusImg;
    private int likeImg;

    public int getProductImg() {
        return productImg;
    }

    public void setProductImg(int productImg) {
        this.productImg = productImg;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getMinusImg() {
        return minusImg;
    }

    public void setMinusImg(int minusImg) {
        this.minusImg = minusImg;
    }

    public String getNumsItems() {
        return numsItems;
    }

    public void setNumsItems(String numsItems) {
        this.numsItems = numsItems;
    }

    public int getPlusImg() {
        return plusImg;
    }

    public void setPlusImg(int plusImg) {
        this.plusImg = plusImg;
    }

    public int getLikeImg() {
        return likeImg;
    }

    public void setLikeImg(int likeImg) {
        this.likeImg = likeImg;
    }

    public ProductItem(int productImg, String productName, String price, String discount, int minusImg, String numsItems, int plusImg, int likeImg) {
        this.productImg = productImg;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.minusImg = minusImg;
        this.numsItems = numsItems;
        this.plusImg = plusImg;
        this.likeImg = likeImg;
    }
}
