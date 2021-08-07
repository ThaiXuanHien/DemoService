package com.example.demoservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_input;
    Button btn_start, btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);
    }

    private void anhXa() {
        edt_input = findViewById(R.id.edt_input);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start:
                clickStartService();
                break;
            case R.id.btn_stop:
                clickStopService();
                break;
        }
    }

    private void clickStartService() {
        Intent intent = new Intent(this, MyService.class);
        intent.putExtra("key_data_intent", edt_input.getText().toString().trim());
        startService(intent);
    }

    private void clickStopService() {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}