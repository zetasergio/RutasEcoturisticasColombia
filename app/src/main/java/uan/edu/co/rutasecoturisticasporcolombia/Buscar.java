package uan.edu.co.rutasecoturisticasporcolombia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.common.api.GoogleApiClient;

public class Buscar extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);


        Spinner spn_dto = (Spinner) findViewById(R.id.spn_dpt);


        /*String[] valores = {};
        spn_dto.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        spn_dto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });
        //spn_dto.setOnItemClickListener();
        */

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




