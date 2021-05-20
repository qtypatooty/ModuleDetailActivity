package sg.edu.rp.c346.id20006949.mymodules;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import sg.edu.rp.c346.id20006949.mymodules.R;


public class ModuleDetailActivity extends AppCompatActivity {
    TextView textView2;
    Button goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        textView2=findViewById(R.id.textView2);
        goback=findViewById(R.id.goback);
        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int year = intentReceived.getIntExtra("Year", 2020);
        int semester = intentReceived.getIntExtra("Semester", 1);
        int credit = intentReceived.getIntExtra("ModuleCredit",4);
        String venue = intentReceived.getStringExtra("Venue");
        textView2.setText(" Module Code: " + moduleCode + " \n Module Name: " + moduleName + "\n Academic Year: " + year + "\n Semester: " + semester
                + "\n Module Credit: " + credit + "\n Venue: " + venue);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
