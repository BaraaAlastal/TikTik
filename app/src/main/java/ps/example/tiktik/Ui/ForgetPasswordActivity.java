package ps.example.tiktik.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ps.example.tiktik.R;

public class ForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView sign_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        sign_tv=findViewById(R.id.sign_in_tv);
        sign_tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sign_in_tv:
                startActivity(new Intent(ForgetPasswordActivity.this,SignInActivity.class));
        }
    }
}
