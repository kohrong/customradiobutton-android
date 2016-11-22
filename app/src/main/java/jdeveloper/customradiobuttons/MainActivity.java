package jdeveloper.customradiobuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, Fragment1.newInstance())
                .commit();

        RadioButton radioButton = (RadioButton) findViewById(R.id.fragment1);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Fragment1.newInstance()).commit();
            }
        });

        RadioButton radioButton1 = (RadioButton) findViewById(R.id.fragment2);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Fragment2.newInstance()).commit();
            }
        });
    }
}
