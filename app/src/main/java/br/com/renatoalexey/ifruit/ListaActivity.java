package br.com.renatoalexey.ifruit;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.renatoalexey.ifruit.adapters.MyListColorAdapter;

/**
 * Created by renato on 27/05/16.
 */
public class ListaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    List<String> epocaForte = new ArrayList<>();
    List<String> epocaMedia = new ArrayList<>();
    List<String> epocaFraca = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       setContentView(R.layout.lista);

        ArrayAdapter<String> adapter = new MyListColorAdapter(this, android.R.layout.simple_list_item_1, listarFrutas(),
                epocaForte.size(), epocaMedia.size(), epocaFraca.size());

        this.listView = (ListView) findViewById(android.R.id.list);
        this.listView.setAdapter(adapter);
        this.listView.setOnItemClickListener(this);
        this.listView.setTextFilterEnabled(true);
    }

    /**
     * teste
     * @return
     */
    private List<String> listarFrutas() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int mes = gregorianCalendar.get(Calendar.MONTH);

        for(Fruta fruta : Fruta.values()) {
            if (fruta.getMeses().contains(mes))
                epocaForte.add(fruta.getNome());
            else if(fruta.getMesesMedio() != null && fruta.getMesesMedio().contains(mes))
                epocaMedia.add(fruta.getNome());
            else
                epocaFraca.add(fruta.getNome());
        }

        List<String> lista = new ArrayList<>(epocaForte);
        lista.addAll(epocaMedia);
        lista.addAll(epocaFraca);

        return lista;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) view;
        String mensagem = "Fruta selecionada: " + textView.getText();

        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, FrutaActivity.class);
        intent.putExtra("nome", textView.getText());
        startActivity(intent);
    }
}
