package sg.edu.rp.c346.id20006949.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.c346);
        tvC349 = findViewById(R.id.c349);
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C235");
                intent.putExtra("ModuleName", "It Security");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "W67M");
                startActivity(intent);
            }
        });
        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C206");
                intent.putExtra("ModuleName", "Software Development");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "W67M");
                startActivity(intent);
            }
        });
    }
}