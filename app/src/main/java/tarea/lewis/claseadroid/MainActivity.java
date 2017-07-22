package tarea.lewis.claseadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button autocomplete = (Button) findViewById(R.id.AutoCompleteText);
        Button buttonListView = (Button) findViewById(R.id.ListView);
        Button style = (Button) findViewById(R.id.Style);
        Button buttonAdapter = (Button) findViewById(R.id.Adapter);
       buttonListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent =new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(intent);
            } });

        buttonAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent =new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(intent);
            } });

        style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent =new Intent(MainActivity.this,Style.class);
                startActivity(intent);
            } });

        autocomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent =new Intent(MainActivity.this,AutoComplete.class);
                startActivity(intent);
            } });


    }
}
