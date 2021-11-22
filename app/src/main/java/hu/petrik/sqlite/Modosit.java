package hu.petrik.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Modosit extends AppCompatActivity {

    private EditText editId, editVeznev, editJernev, editJegy;
    private Button button_modositas, button_visszaModositas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modosit);

        init();

        button_visszaModositas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Modosit.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void init() {
        editId = findViewById(R.id.editId);
        editVeznev = findViewById(R.id.editVeznev);
        editJernev = findViewById(R.id.editJernev);
        editJegy = findViewById(R.id.editJegy);
        button_modositas = findViewById(R.id.button_modositas);
        button_visszaModositas = findViewById(R.id.button_visszaModositas);
    }
}