package ps.example.tiktik.Models;

import android.widget.ImageView;

public class CategoryHomeFragment {
    private int img;
    private String categoryName;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryHomeFragment(int img, String categoryName) {
        this.img = img;
        this.categoryName = categoryName;
    }
}
