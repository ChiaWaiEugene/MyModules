package sg.edu.rp.c346.id20041877.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tv;
    Button backOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_detail_activity);

        tv = findViewById(R.id.Display);
        backOption=findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleCode");

        switch(moduleCode){
            case "C346": tv.setText(R.string.C346d);
            break;
            case "C349": tv.setText(R.string.C349d);
        }

        backOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });


    }
}