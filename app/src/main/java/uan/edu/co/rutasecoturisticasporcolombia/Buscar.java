package uan.edu.co.rutasecoturisticasporcolombia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        Button btn_buscar = (Button) findViewById(R.id.btn_buscar);

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Buscar.this.startActivity(new Intent(Buscar.this, Lugares.class));
            }
        });


    }
}
