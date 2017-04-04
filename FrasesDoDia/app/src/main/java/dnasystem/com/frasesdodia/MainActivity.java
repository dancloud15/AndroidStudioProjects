package dnasystem.com.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnNovaFrase;
    private TextView txtNovaFrase;
    private String [] frases = {
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "A vida é melhor para aqueles que fazem o possível para ter o melhor",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum",
            "Para de perseguir o dinheiro e comece a perseguir o sucesso",
            "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNovaFrase = (TextView) findViewById(R.id.txtNovaFrase);
        btnNovaFrase = (Button) findViewById(R.id.btnNovaFrase);



        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Random random = new Random();
               int numero = random.nextInt(frases.length);

               txtNovaFrase.setText(frases[numero]);

           }
       });
    }
}
