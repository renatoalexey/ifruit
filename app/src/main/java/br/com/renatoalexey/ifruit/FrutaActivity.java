package br.com.renatoalexey.ifruit;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by renato on 01/06/16.
 */
public class FrutaActivity extends AppCompatActivity {

    private ImageView frutaImagem;
    private TextView frutaNome;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruta_descricao);

        frutaImagem = (ImageView) findViewById(R.id.fruta_imagem);
        frutaNome = (TextView) findViewById(R.id.fruta_nome);

        Bundle extras = getIntent().getExtras();
        String nome = "";
        if (extras != null) {
             nome = extras.getString("nome");
        }

        Fruta fruta = Fruta.buscaFrutaPeloNome(nome);

        frutaNome.setText(fruta.getNome());

        String uri = "@drawable/" + fruta.name().toLowerCase();
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = ResourcesCompat.getDrawable(getResources(), imageResource, null);
        frutaImagem.setImageDrawable(res);

        for(int i = 0; i < fruta.getMeses().size(); i ++) {
            Integer mes = fruta.getMeses().get(i);
            switch (mes) {
                case (0):
                    findViewById(R.id.janeiro).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (1):
                    findViewById(R.id.fevereiro).setBackgroundResource(R.color.forte);
                    break;
                case (2):
                    findViewById(R.id.marco).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (3):
                    findViewById(R.id.abril).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (4):
                    findViewById(R.id.maio).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (5):
                    findViewById(R.id.junho).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (6):
                    findViewById(R.id.julho).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (7):
                    findViewById(R.id.agosto).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (8):
                    findViewById(R.id.setembro).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (9):
                    findViewById(R.id.outubro).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                case (10):
                    findViewById(R.id.novembro).setBackgroundColor(Color.parseColor("#99FF99"));
                    break;
                default:
                    findViewById(R.id.dezembro).setBackgroundColor(Color.parseColor("#99FF99"));
            }
        }

        if(fruta.getMesesMedio() != null) {
            for (int i = 0; i < fruta.getMesesMedio().size(); i++) {
                Integer mes = fruta.getMesesMedio().get(i);
                switch (mes) {
                    case (0):
                        findViewById(R.id.janeiro).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (1):
                        findViewById(R.id.fevereiro).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (2):
                        findViewById(R.id.marco).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (3):
                        findViewById(R.id.abril).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (4):
                        findViewById(R.id.maio).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (5):
                        findViewById(R.id.junho).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (6):
                        findViewById(R.id.julho).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (7):
                        findViewById(R.id.agosto).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (8):
                        findViewById(R.id.setembro).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (9):
                        findViewById(R.id.outubro).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    case (10):
                        findViewById(R.id.novembro).setBackgroundColor(Color.parseColor("#FFFF1A"));
                        break;
                    default:
                        findViewById(R.id.dezembro).setBackgroundColor(Color.parseColor("#FFFF1A"));
                }
            }
        }
    }
}
