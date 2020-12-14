package ps.example.tiktik.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import ps.example.tiktik.R;

public class LanguageActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout AR_Ly ,EN_Lay ;
    private TextView tv_eng,tv_welcome,tv_arabic,tv_marhab_arabic;
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        EN_Lay = findViewById(R.id.EN_Lay);
        AR_Ly = findViewById(R.id.AR_Ly);
        tv_eng=findViewById(R.id.tv_eng);
        tv_welcome=findViewById(R.id.tv_welcome);
        tv_arabic=findViewById(R.id.tv_arabic);
        tv_marhab_arabic=findViewById(R.id.tv_marhab_arabic);
        imageButton=findViewById(R.id.next_btn_lang_act);

        EN_Lay.setOnClickListener(this);
        AR_Ly.setOnClickListener(this);
        imageButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.AR_Ly:
                AR_Ly.setSelected(true);
                EN_Lay.setSelected(false);
                tv_arabic.setTextColor(getResources().getColor(R.color.orange_color));
                tv_marhab_arabic.setTextColor(getResources().getColor(R.color.orange_color));
                tv_eng.setTextColor(getResources().getColor(R.color.gray_color));
                tv_welcome.setTextColor(getResources().getColor(R.color.gray_color));
                break;
            case R.id.EN_Lay:
                AR_Ly.setSelected(false);
                EN_Lay.setSelected(true);
                tv_eng.setTextColor(getResources().getColor(R.color.orange_color));
                tv_welcome.setTextColor(getResources().getColor(R.color.orange_color));
                tv_arabic.setTextColor(getResources().getColor(R.color.gray_color));
                tv_marhab_arabic.setTextColor(getResources().getColor(R.color.gray_color));
                break;
            case R.id.next_btn_lang_act:
                startActivity(new Intent(LanguageActivity.this,AdsActivity.class));
                break;
        }
    }
}
