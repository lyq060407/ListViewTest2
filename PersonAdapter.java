package com.microvideo.updata.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/5/17.
 */

public class PersonAdapter extends ArrayAdapter<Person> {

    private int reourceId;

    public PersonAdapter(Context context, int resource, ListView objects) {
        super(context, resource, (List<Person>) objects);


    }

/*    public PersonAdapter(Context context, int resource, ListView objects) {
        super(context, resource, objects);
    }*/

/*    public PersonAdapter(Context context, int resource, ListView objects) {
        super(context, resource, (List<Person>) objects);
        reourceId = resource;
    }*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        Person person = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(reourceId, parent, false);
        ImageView memberImage = (ImageView) view.findViewById(R.id.iv_person);
        TextView memberName = (TextView) view.findViewById(R.id.tv_name);
        memberImage.setImageResource(person.getImageId());
        memberName.setText(person.getName());
        return view;
    }

}
