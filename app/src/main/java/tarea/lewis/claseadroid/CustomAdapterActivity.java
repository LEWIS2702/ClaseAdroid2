package tarea.lewis.claseadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        TextView textView = (TextView) findViewById(R.id.TextView);

        ArrayList<Usuario>  usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("LEWIS", "GABIN"));

        UsersAdapter adapter = new UsersAdapter(this,usuarios);
        ListView listView =  (ListView) findViewById(R.id.activity_list_view);
        listView.setAdapter(adapter);
    }
}
