package com.example.projectprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.IvloremIpsun);
        Spinner spinner = findViewById(R.id.spinner);

        lv.setAdapter (new ArrayAdapter<string>(ListActivity.this, android.R.layout.simple_list_item_1,items));
        ArrayAdapter<string> aa = new ArrayAdapter<>(ListActivity.this, android.R.layout.simple_spinner_item,items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

        Spinner.setAdapter(new ArrayAdapter<string>(ListActivity.this, android.R.layout.simple_spinner_item,items));

        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this, text:"anda memilih = " + items[1],Toast.LENGTH_LONG);
            }

            @Override
            public  void onNothingSelected(AdapterView<?> adapterView){
                Toast.makeText(ListActivity.this, text ="anda tidak memilih = ",Toast.LENGTH_SHORT).show();
        }
        });



        lv.setAdapter(new ArrayAdapter<string>(ListActivity.this, android.R.layout.simple_list_item_1, items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id);{
                        selection.setText(items[position]);

            }



        }
}
