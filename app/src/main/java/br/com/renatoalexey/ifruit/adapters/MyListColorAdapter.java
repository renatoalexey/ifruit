package br.com.renatoalexey.ifruit.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by renato on 31/05/16.
 */
public class MyListColorAdapter extends ArrayAdapter<String> {

    private int forte, medio, fraco;

    public MyListColorAdapter(Context context, int resource, List<String> objects, int forte, int medio, int fraco) {
        super(context, resource, objects);
        this.forte = forte;
        this.medio = medio;
        this.fraco = fraco;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        if (position < forte) {
            view.setBackgroundColor(Color.parseColor("#99FF99"));
        } else if ((position - forte) < medio) {
            view.setBackgroundColor(Color.parseColor("#FFFF1A"));
        } else {
            view.setBackgroundColor(Color.parseColor("#FF3300"));
        }

        return view;
    }
}

