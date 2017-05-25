package com.microvideo.updata.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewTestQing extends AppCompatActivity {

    private ListView mListViewMember;
    String[] members = {"廖永清", "易艳娟", "廖逸云", "廖小云", "廖永清", "易艳娟", "廖逸云", "廖小云", "廖永清", "易艳娟", "廖逸云", "廖小云", "廖永清", "易艳娟", "廖逸云", "廖小云", "廖永清", "易艳娟", "廖逸云", "廖小云", "廖永清", "易艳娟", "廖逸云", "廖小云"};

    private List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test_qing);
        ListView personList = (ListView) findViewById(R.id.lv_members);
        initPersons();

        PersonAdapter mAdapter = new PersonAdapter(ListViewTestQing.this,
                R.layout.person_item,  personList);


//        mListViewMember = ((ListView) findViewById(R.id.lv_members));

        // ArrayAdapter<String> mAdaper = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1);
        //          R.layout.member_item, members);
        personList.setAdapter(mAdapter);


    }

    private void initPersons() {
        for (int i = 0; i < 99; i++) {

            personList.add( new Person("廖永清",R.drawable.grape));
            personList.add( new Person("易艳娟",R.drawable.grape));
            personList.add( new Person("廖逸云",R.drawable.grape));

        }

    }


}
