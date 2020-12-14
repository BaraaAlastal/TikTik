package ps.example.tiktik.Models;

public class ItemMyCartFragment {
    private int productImg,plus,minus;
    private String productName,total,quantity;

    public int getProductImg() {
        return productImg;
    }

    public void setProductImg(int productImg) {
        this.productImg = productImg;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public ItemMyCartFragment(int productImg, int plus, int minus, String productName, String total, String quantity) {
        this.productImg = productImg;
        this.plus = plus;
        this.minus = minus;
        this.productName = productName;
        this.total = total;
        this.quantity = quantity;
    }
}
