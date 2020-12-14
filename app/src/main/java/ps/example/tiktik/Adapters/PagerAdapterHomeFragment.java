package ps.example.tiktik.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import ps.example.tiktik.R;

public class PagerAdapterHomeFragment extends PagerAdapter {
    private Context context;
    private int[] nImages = new int[]{R.drawable.imageview_home_fragment,R.drawable.imageview_home_fragment,R.drawable.imageview_home_fragment};

    public PagerAdapterHomeFragment(Context context) {
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view =  layoutInflater.inflate(R.layout.item_view ,null);

        ImageView imageView =view.findViewById(R.id.img);
      //  imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(nImages[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //container.removeView((ImageView)object);
    }
}
