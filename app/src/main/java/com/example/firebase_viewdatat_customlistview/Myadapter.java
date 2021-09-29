package com.example.firebase_viewdatat_customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Myadapter extends BaseAdapter {
    List<Model> list;
    Activity activity;
    LayoutInflater inflater;

    public Myadapter(List<Model> list, Activity activity) {
        this.list = list;
        this.activity = activity;

        inflater=activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.view_layout,null,false);
        TextView text1=view.findViewById(R.id.Text1_id);
        TextView text2=view.findViewById(R.id.Text2_id);
        TextView text3=view.findViewById(R.id.Text3_id);
        TextView text4=view.findViewById(R.id.Text4_id);
        TextView text5=view.findViewById(R.id.Text5_id);

        Model model= list.get(i);

        text1.setText(model.name);
        text2.setText(model.email);
        text3.setText(model.mobile);
        text4.setText(model.dob);
        text5.setText(model.password);

        return view;
    }
}
