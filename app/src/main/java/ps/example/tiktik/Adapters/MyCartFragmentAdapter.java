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

import ps.example.tiktik.Models.ItemMyCartFragment;
import ps.example.tiktik.R;

public class MyCartFragmentAdapter extends RecyclerView.Adapter<MyCartFragmentAdapter.VH> {
    private Context context;
    private ArrayList<ItemMyCartFragment> list;

    public MyCartFragmentAdapter(Context context, ArrayList<ItemMyCartFragment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyCartFragmentAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_mycart_fragment,parent,false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCartFragmentAdapter.VH holder, int position) {

        ItemMyCartFragment item = list.get(position);
        holder.productPhoto.setImageResource(item.getProductImg());
        holder.plus.setImageResource(item.getPlus());
        holder.minus.setImageResource(item.getMinus());
        holder.productName.setText(item.getProductName());
        holder.total.setText(item.getTotal());
        holder.quant.setText(item.getQuantity());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        private ImageView productPhoto,plus,minus;
        private TextView productName,total,quant;
        public VH(@NonNull View itemView) {
            super(itemView);
            productPhoto = itemView.findViewById(R.id.product_img_myCart_item);
            plus = itemView.findViewById(R.id.plus_img_myCart);
            minus = itemView.findViewById(R.id.minus_img_myCart);
            productName = itemView.findViewById(R.id.product_name_myCart_item);
            total = itemView.findViewById(R.id.total_tv_myCart);
            quant = itemView.findViewById(R.id.quantity_tv_myCart);
        }
    }
}
