package com.metafour.cwbay.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.metafour.cwbay.R;
import com.metafour.cwbay.model.DrawerItem;

import java.util.ArrayList;

/**
 * Created by MURAD on 1/29/2015.
 */
public class DrawerItemAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<DrawerItem> drawerItems;

    public DrawerItemAdapter(Context context, ArrayList<DrawerItem> drawerItems){
        this.context = context;
        this.drawerItems = drawerItems;
    }

    @Override
    public int getCount() {
        return drawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return drawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.items_row, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        TextView txtCount = (TextView) convertView.findViewById(R.id.counter);

        imgIcon.setImageResource(drawerItems.get(position).getIcon());
        txtTitle.setText(drawerItems.get(position).getTitle());

        // displaying Number
        // check whether it set visible or not
        if(drawerItems.get(position).getNumberVisibility()){
            txtCount.setText(drawerItems.get(position).getNumber());
        }else{
            // hide the Number view
            txtCount.setVisibility(View.GONE);
        }

        return convertView;
    }

}
