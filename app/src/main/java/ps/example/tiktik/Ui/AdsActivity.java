package ps.example.tiktik.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import ps.example.tiktik.Adapters.ImageViewPagerAdapter;
import ps.example.tiktik.R;

public class AdsActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ImageButton next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);
        
        viewPager=findViewById(R.id.viewPager_ads_activity);
        next_btn=findViewById(R.id.next_btn_ads_act);
        ImageViewPagerAdapter adapter = new ImageViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdsActivity.this,SignInActivity.class));
            }
        });
    }
}
