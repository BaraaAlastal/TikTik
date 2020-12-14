package ps.example.tiktik.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ps.example.tiktik.Adapters.MyCartFragmentAdapter;
import ps.example.tiktik.Models.ItemMyCartFragment;
import ps.example.tiktik.R;

public class MyCartFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ItemMyCartFragment> list;
    private MyCartFragmentAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_cart_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView= view.findViewById(R.id.recycler_my_cart_fragment);
        list = new ArrayList<>();
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));
        list.add(new ItemMyCartFragment(R.drawable.fruit_icon,R.drawable.ic_pluse,R.drawable.ic_minus,"Pomegranate","Total:100$","0"));

        adapter = new MyCartFragmentAdapter(view.getContext(),list);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }
}
