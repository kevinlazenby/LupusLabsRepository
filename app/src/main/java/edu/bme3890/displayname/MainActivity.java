package edu.bme3890.displayname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.bme3890.displayname.EmailActivity;
import edu.bme3890.displayname.R;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_send_email);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmailActivity();
            }
        });

    }

    public void openEmailActivity() {
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }
}
