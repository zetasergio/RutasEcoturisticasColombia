package uan.edu.co.rutasecoturisticasporcolombia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Buscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);



        Spinner spindepa = (Spinner) findViewById(R.id.spn_dpt);

        Button btn_buscar = (Button) findViewById(R.id.btn_buscar);

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Buscar.this.startActivity(new Intent(Buscar.this, Lugares.class));
                finish();
            }
        });




    }
}
