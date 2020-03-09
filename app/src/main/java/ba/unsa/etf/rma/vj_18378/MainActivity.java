package ba.unsa.etf.rma.vj_18378;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final EditText editText = findViewById(R.id.editText);
        ListView listView = findViewById(R.id.listView);

        final ArrayList<String> list = new ArrayList<>();
        list.add("The Wolf Of Wall Street");
        list.add("Interstellar");
        list.add("Joker Ledgerov, ne ovo Leto-ova glupost");
        list.add("Inception");


        adapter = new ArrayAdapter<String>(this, R.layout.list_element, R.id.itemName, list);

        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //malo ne kontam logiku ovog programa, button Search, a funkcija mu dodavanja filma u listu ???
                list.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });

    }
}
