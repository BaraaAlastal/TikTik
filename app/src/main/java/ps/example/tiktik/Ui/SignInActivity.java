package ps.example.tiktik.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ps.example.tiktik.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView forget_tv,register_tv;
    private Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        forget_tv=findViewById(R.id.forget_password_tv);
        register_tv=findViewById(R.id.register_tv);
        signin=findViewById(R.id.sign_in_btn);
        forget_tv.setOnClickListener(this);
        register_tv.setOnClickListener(this);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.forget_password_tv:
                startActivity(new Intent(SignInActivity.this,ForgetPasswordActivity.class));
                break;
            case R.id.register_tv:
                startActivity(new Intent(SignInActivity.this, RegisterActivity.class));
                break;
            case R.id.sign_in_btn:
                startActivity(new Intent(SignInActivity.this, HomeActivity.class));
                break;
        }
    }
}
