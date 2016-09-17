package com.example.venturedive.mathlers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {
    Spinner sp;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        lv = (ListView) findViewById(R.id.menu_list);
        String[] menuArray = {"Play", "Help", "Setting", "About"};
        String[] menuArray2 = {"Play1", "Help1", "Setting1", "About1"};
        sp = (Spinner) findViewById(R.id.spinner);


        final ArrayAdapter<String>
                adapter = new ArrayAdapter<String>
                (MainMenu.this, android.R.layout.simple_list_item_1, menuArray);

        final ArrayAdapter<String>
                adapter1 = new ArrayAdapter<String>
                (MainMenu.this, android.R.layout.simple_list_item_1, menuArray2);


        sp.setAdapter(adapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==2){

                    lv.setAdapter(adapter);

                }
                else  {lv.setAdapter(adapter1);}
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    String temp=String.valueOf(parent.getItemAtPosition(0));
                    Intent intent = new Intent(MainMenu.this, MethlorActivity.class);


                    intent.putExtra("1", "asad");
                    intent.putExtra("2", "rizvi");
                    intent.putExtra("3",lv.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

//                lv = (ListView) findViewById(R.id.menu_list);
//                Intent intent = new Intent(MainMenu.this, MethlorActivity.class);
//                intent.putExtra("key", "value");
//                startActivity(intent);
            }
        });



        /*
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                if (sp.getSelectedItemPosition() == 0) {
                    lv = (ListView) findViewById(R.id.menu_list);
                    String[] playopt = {"Racing car", "Puzzle", "Adventure", "Mathelor"};
                    ArrayAdapter<String>
                            adapter = new ArrayAdapter<String>
                            (MainMenu.this, android.R.layout.simple_list_item_1, playopt);
                    lv.setAdapter(adapter);

                    lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (lv.getSelectedItemPosition() == 3) {
                                Intent intent = new Intent(MainMenu.this, MethlorActivity.class);
                                startActivity(intent);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                    if (lv.getSelectedItemPosition() == 3) {

                        Intent intent = new Intent(MainMenu.this, MethlorActivity.class);
                        intent.putExtra("key", "value");
                        startActivity(intent);
                    }
                } else if (sp.getSelectedItemPosition() == 1) {
                    lv = (ListView) findViewById(R.id.menu_list);
                    String[] helpopt = {"Search Help", "Contact Support", "Index", "Forum"};
                    ArrayAdapter<String>
                            adapter = new ArrayAdapter<String>
                            (MainMenu.this, android.R.layout.simple_list_item_1, helpopt);
                    lv.setAdapter(adapter);
                } else if (sp.getSelectedItemPosition() == 2) {
                    lv = (ListView) findViewById(R.id.menu_list);
                    String[] settingopt = {"Add User", "configure user", "Security settings", "Reset"};
                    ArrayAdapter<String>
                            adapter = new ArrayAdapter<String>
                            (MainMenu.this, android.R.layout.simple_list_item_1, settingopt);
                    lv.setAdapter(adapter);
                } else if (sp.getSelectedItemPosition() == 3) {
                    lv = (ListView) findViewById(R.id.menu_list);
                    String[] mathopt = {"Version", "Developers", "Rating", "Features"};
                    ArrayAdapter<String>
                            adapter = new ArrayAdapter<String>
                            (MainMenu.this, android.R.layout.simple_list_item_1, mathopt);
                    lv.setAdapter(adapter);
                }
                //Toast.makeText(MainMenu.this,"Item Slected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });*/
    }
}
