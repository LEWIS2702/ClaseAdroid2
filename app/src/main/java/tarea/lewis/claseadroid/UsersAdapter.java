package tarea.lewis.claseadroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by windows on 15/7/2017.
 */

public class UsersAdapter extends ArrayAdapter<Usuario> {
    public UsersAdapter(Context context, ArrayList<Usuario> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Usuario user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }
        TextView nombre = (TextView) convertView.findViewById(R.id.textView1);
        TextView apellido = (TextView) convertView.findViewById(R.id.textView1);

        nombre.setText(user.nombre);
        nombre.setText(user.apellido);
        
        return convertView;
    }
}
