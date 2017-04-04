package dnasystem.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button btnVerifica;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcool);
        precoGasolina = (EditText) findViewById(R.id.precoGasolina);
        btnVerifica = (Button) findViewById(R.id.btnVerifica);
        txtResultado = (TextView) findViewById(R.id.txtResultado);


        btnVerifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ValorAlcool = precoAlcool.getText().toString();
                String ValorGasolina =precoGasolina.getText().toString();

                double alcool = Double.parseDouble(ValorAlcool);
                double gasolina = Double.parseDouble(ValorGasolina);

                double resultado = alcool/gasolina;


                if (resultado > 0.7){
                    txtResultado.setText("É melhor utilizar Gasolina!");
                }else{
                    txtResultado.setText("É melhor utilizar Álcool!");

                }


            }
        });

    }
}
