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
import ps.example.tiktik.Models.ProductItem;
import ps.example.tiktik.R;

public class HomeFragmentAdapterRecycler2 extends RecyclerView.Adapter<HomeFragmentAdapterRecycler2.MyViewHolder> {
    private Context context;
    private ArrayList<ProductItem> list;

    public HomeFragmentAdapterRecycler2(Context context, ArrayList<ProductItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeFragmentAdapterRecycler2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler2_home_fragment, parent, false);
        return new HomeFragmentAdapterRecycler2.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragmentAdapterRecycler2.MyViewHolder holder, int position) {
        ProductItem productItem = list.get(position);
        holder.productImg.setImageResource(productItem.getProductImg());
        holder.minus.setImageResource(productItem.getMinusImg());
        holder.plus.setImageResource(productItem.getPlusImg());
        holder.like.setImageResource(productItem.getLikeImg());
        holder.name.setText(productItem.getProductName());
        holder.price.setText(productItem.getPrice());
        holder.discount.setText(productItem.getDiscount());
        holder.quantity.setText(productItem.getNumsItems());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImg,minus,plus,like;
        private TextView name,price,discount,quantity;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            productImg = itemView.findViewById(R.id.product_img);
            minus = itemView.findViewById(R.id.minus_img);
            plus = itemView.findViewById(R.id.plus_img);
            like = itemView.findViewById(R.id.like_img);

            name = itemView.findViewById(R.id.name_product_tv);
            price = itemView.findViewById(R.id.price_tv);
            discount = itemView.findViewById(R.id.discount_tv);
            quantity = itemView.findViewById(R.id.quantity_tv);

        }
    }
}
