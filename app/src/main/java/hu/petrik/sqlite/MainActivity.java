package hu.petrik.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button gomb_adatok_olvasasa, gomb_adatok_rogzitese, gomb_adatok_modositasa, gomb_adatok_torlese;
    private TextView textView_adatokOlvasva;
    private DBHelper adatbazis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        gomb_adatok_olvasasa.setOnClickListener(v -> {
        });
        gomb_adatok_rogzitese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Rogzites.class);
                startActivity(intent);
                finish();
            }
        });
        gomb_adatok_modositasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modosit.class);
                startActivity(intent);
                finish();
            }
        });
        gomb_adatok_torlese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Torles.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void init() {
        gomb_adatok_olvasasa = findViewById(R.id.gomb_adatok_olvasasa);
        gomb_adatok_rogzitese = findViewById(R.id.gomb_adatok_rogzitese);
        gomb_adatok_modositasa = findViewById(R.id.gomb_adatok_modositasa);
        gomb_adatok_torlese = findViewById(R.id.gomb_adatok_torlese);
        textView_adatokOlvasva = findViewById(R.id.textView_adatokOlvasva);
    }
}