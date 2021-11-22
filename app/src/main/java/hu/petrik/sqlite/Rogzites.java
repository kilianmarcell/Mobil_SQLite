package hu.petrik.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rogzites extends AppCompatActivity {

    private EditText editText_vezeteknev, editText_keresztnev, editText_erdemjegy;
    private Button gomb_rogzites, gomb_vissza;
    private DBHelper adatbazis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rogzites);

        init();

        gomb_rogzites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vezeteknev = editText_vezeteknev.getText().toString().trim();
                String keresztnev = editText_keresztnev.getText().toString().trim();
                String erdemjegy = editText_erdemjegy.getText().toString().trim();

                if (vezeteknev.isEmpty() || keresztnev.isEmpty() || erdemjegy.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Minden mezőt ki kell tölteni!", Toast.LENGTH_SHORT).show();
                } else {
                    int jegy = Integer.parseInt(erdemjegy);
                    if (jegy < 1 || jegy > 5) {
                        Toast.makeText(getApplicationContext(), "A jegynek 1 és 5 közöttinek kell lennie!", Toast.LENGTH_SHORT).show();
                    } else {
                        if (adatbazis.rogzites(vezeteknev, keresztnev, jegy)) {
                            Toast.makeText(getApplicationContext(), "Sikeres rögzítés!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Sikertelen rögzítés!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

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
        adatbazis = new DBHelper(this);
    }
}