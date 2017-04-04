package dnasystem.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnIdade;
    private EditText txtidade;
    private TextView txtResultadoIdade;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtidade = (EditText) findViewById(R.id.txtidade);
        btnIdade = (Button) findViewById(R.id.btnIdade);
        txtResultadoIdade = (TextView) findViewById(R.id.txtResultadoIdade);


        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = txtidade.getText().toString();
                if (textoDigitado.isEmpty()){
                    txtResultadoIdade.setText("É necessário que informe a idade do cachorro!");
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado*7;
                    txtResultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal);
                }
            }
        });

    }
}
