package tarea.lewis.claseadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Style extends AppCompatActivity implements View.OnClickListener {
    private EditText my_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);
        my_edit =(EditText) findViewById(R.id.my_edit_text);
        findViewById(R.id.my_buttom).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, my_edit.getText(), Toast.LENGTH_SHORT).show();
    }
}
