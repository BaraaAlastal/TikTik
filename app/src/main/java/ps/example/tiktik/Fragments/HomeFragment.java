package ps.example.tiktik.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

import ps.example.tiktik.Adapters.HomeFragmentAdapterRecycler1;
import ps.example.tiktik.Adapters.HomeFragmentAdapterRecycler2;
import ps.example.tiktik.Adapters.PagerAdapterHomeFragment;
import ps.example.tiktik.Models.CategoryHomeFragment;
import ps.example.tiktik.Models.ProductItem;
import ps.example.tiktik.R;

public class HomeFragment extends Fragment {
    private ViewPager viewPager;
    private RecyclerView recyclerView1,recyclerView2;
    private HomeFragmentAdapterRecycler1 recyclerAdapter1;
    private HomeFragmentAdapterRecycler2 recyclerAdapter2;
    private ArrayList<CategoryHomeFragment> list1;
    private ArrayList<ProductItem> list2;
    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //viewPager
        viewPager = view.findViewById(R.id.viewpager_home_fragment);
        PagerAdapterHomeFragment adapter = new PagerAdapterHomeFragment(view.getContext());
        viewPager.setAdapter(adapter);
        //recycler1
        recyclerView1= view.findViewById(R.id.recycler1_home_fragment);
        list1 = new ArrayList<>();
        list1.add(new CategoryHomeFragment(R.drawable.ic_item_recycler1_homefrag,"All"));
        list1.add(new CategoryHomeFragment(R.drawable.ic_item_recycler1_homefrag,"All"));
        list1.add(new CategoryHomeFragment(R.drawable.ic_item_recycler1_homefrag,"All"));
        list1.add(new CategoryHomeFragment(R.drawable.ic_item_recycler1_homefrag,"All"));
        list1.add(new CategoryHomeFragment(R.drawable.ic_item_recycler1_homefrag,"All"));
        list1.add(new CategoryHomeFragment(R.drawable.ic_item_recycler1_homefrag,"All"));

        recyclerAdapter1 = new HomeFragmentAdapterRecycler1(view.getContext(),list1);
        recyclerView1.setAdapter(recyclerAdapter1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false));

        //recycler2
        recyclerView2= view.findViewById(R.id.recycler2_home_fragment);
        list2 = new ArrayList<>();
        list2.add(new ProductItem(R.drawable.fruit_icon,"Pomegranate","5.00$/K","5.00$/K",R.drawable.ic_minus,"0",R.drawable.ic_pluse,R.drawable.like_gray_ic));
        list2.add(new ProductItem(R.drawable.fruit_icon,"Pomegranate","5.00$/K","5.00$/K",R.drawable.ic_minus,"0",R.drawable.ic_pluse,R.drawable.like_gray_ic));
        list2.add(new ProductItem(R.drawable.fruit_icon,"Pomegranate","5.00$/K","5.00$/K",R.drawable.ic_minus,"0",R.drawable.ic_pluse,R.drawable.like_gray_ic));
        list2.add(new ProductItem(R.drawable.fruit_icon,"Pomegranate","5.00$/K","5.00$/K",R.drawable.ic_minus,"0",R.drawable.ic_pluse,R.drawable.like_gray_ic));
        list2.add(new ProductItem(R.drawable.fruit_icon,"Pomegranate","5.00$/K","5.00$/K",R.drawable.ic_minus,"0",R.drawable.ic_pluse,R.drawable.like_gray_ic));
        list2.add(new ProductItem(R.drawable.fruit_icon,"Pomegranate","5.00$/K","5.00$/K",R.drawable.ic_minus,"0",R.drawable.ic_pluse,R.drawable.like_gray_ic));

        recyclerAdapter2 = new HomeFragmentAdapterRecycler2(view.getContext(),list2);
        recyclerView2.setAdapter(recyclerAdapter2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new GridLayoutManager(view.getContext(),2));
    }
}
