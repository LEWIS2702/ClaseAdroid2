package tarea.lewis.claseadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        String[] data = {"cat", "dog","mouse","lewis", "manuel"};
        AutoCompleteTextView  autocomplete =(AutoCompleteTextView)findViewById(R.id.AutoComplete);
        autocomplete.setAdapter(new ArrayAdapter<>(this,android.R.layout.select_dialog_item, data));

        autocomplete.setThreshold(1);
    }
}
