package ps.example.tiktik.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import ps.example.tiktik.R;

public class ImageViewPagerAdapter extends PagerAdapter {

    private Context context;
    private int[] nImages = new int[]{R.drawable.shop_now_image,R.drawable.shop_now_image,R.drawable.shop_now_image};

    public ImageViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return nImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(nImages[position]);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
