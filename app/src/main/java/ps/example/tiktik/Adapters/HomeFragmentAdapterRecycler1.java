package ps.example.tiktik.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ps.example.tiktik.Models.CategoryHomeFragment;
import ps.example.tiktik.R;

public class HomeFragmentAdapterRecycler1 extends RecyclerView.Adapter<HomeFragmentAdapterRecycler1.MyViewHolder> {
    private Context context;
    private ArrayList<CategoryHomeFragment> list;

    public HomeFragmentAdapterRecycler1(Context context, ArrayList<CategoryHomeFragment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeFragmentAdapterRecycler1.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(context).inflate(R.layout.item_recycler1_home_fragment,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragmentAdapterRecycler1.MyViewHolder holder, int position) {
        CategoryHomeFragment category = list.get(position);
        holder.textView.setText(category.getCategoryName());
        holder.imageView.setImageResource(category.getImg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.category_img);
            textView = itemView.findViewById(R.id.category_tv);
        }

    }
}
