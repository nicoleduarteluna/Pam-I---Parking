package br.com.etechoracio.parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtQtdHoras;
    EditText txtValorHoras;
    EditText txtHoraAdicional;
    TextView lblTotal2;

    public void onCalcular (View v) {
        double totalHoras = Double.parseDouble(txtQtdHoras.getText().toString());
        double vlrHora = Double.parseDouble(txtValorHoras.getText().toString());
        double horaAdic = Double.parseDouble(txtHoraAdicional.getText().toString());

        double total = vlrHora + horaAdic * (totalHoras - 1);

        lblTotal2.setText(String.valueOf(total));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQtdHoras = findViewById(R.id.txtQtdHoras);
        txtValorHoras = findViewById(R.id.txtValorHoras);
        txtHoraAdicional = findViewById(R.id.txtHoraAdicional);
        lblTotal2 = findViewById(R.id.lblTotal2);
    }
}
