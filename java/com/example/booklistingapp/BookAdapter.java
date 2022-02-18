package com.example.booklistingapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(Activity context, ArrayList<Book> books ) {
        super(context,0,books); }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listlayout, parent, false);
        }


        Book currentword = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imagebook);
        imageView.setImageResource(currentword.getImageid());

        TextView TextView1 = (TextView) listItemView.findViewById(R.id.author);
        TextView1.setText(currentword.getAuthor());

        TextView TextView2 = (TextView) listItemView.findViewById(R.id.name);
        TextView2.setText(currentword.getName());

        TextView TextView3 = (TextView) listItemView.findViewById(R.id.lang);
        TextView3.setText(currentword.getLanguage());

        TextView TextView4 = (TextView) listItemView.findViewById(R.id.cost);
        TextView4.setText(currentword.getCost());





        return listItemView;
    }


}
