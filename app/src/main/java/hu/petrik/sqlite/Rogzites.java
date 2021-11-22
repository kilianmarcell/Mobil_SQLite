package hu.petrik.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Rogzites extends AppCompatActivity {

    private EditText editText_vezeteknev, editText_keresztnev, editText_erdemjegy;
    private Button gomb_rogzites, gomb_vissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rogzites);

        init();

        gomb_vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rogzites.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void init() {
        editText_vezeteknev = findViewById(R.id.editText_vezeteknev);
        editText_keresztnev = findViewById(R.id.editText_keresztnev);
        editText_erdemjegy = findViewById(R.id.editText_erdemjegy);
        gomb_rogzites = findViewById(R.id.gomb_rogzites);
        gomb_vissza = findViewById(R.id.gomb_vissza);
    }
}