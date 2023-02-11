package sv.edu.utec.clase_06_02_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = findViewById( R.id.edtValor );
        edtResultado = findViewById( R.id.edtMTabla );
    }
    public void Tabla(View v){
        int valTabla = Integer.parseInt( edtValor1.getText().toString() );
        String resultado;

        if ( edtResultado.getText().toString() != "" ){
            edtResultado.setText("");
        }
        for (int i = 1; i <= 10; i++){
            resultado = String.valueOf( valTabla * i );
            edtResultado.append( valTabla + " x " + i + " = " + resultado );
        }
    }

    public void Limpiar( View v ){
        edtResultado.setText("");
        edtValor1.setText("");
    }
}
