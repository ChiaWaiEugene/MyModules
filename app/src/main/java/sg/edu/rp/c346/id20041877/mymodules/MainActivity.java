package sg.edu.rp.c346.id20041877.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtModule1, txtModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtModule1 = findViewById(R.id.textC346);
        txtModule2 = findViewById(R.id.textC349);

        txtModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);
            }
        });

        txtModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C349");
                startActivity(intent);
            }
        });

    }
}