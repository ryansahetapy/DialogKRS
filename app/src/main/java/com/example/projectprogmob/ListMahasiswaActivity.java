package com.example.projectprogmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



    public class ListMahasiswaActivity extends AppCompatActivity {
        String[] items = {"Harold", "Erick", "Aru", "Brian", "Ryan"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_mahasiswa);

            ListView listView = findViewById(R.id.lvMhs);
            Spinner spinner = findViewById(R.id.mhsSpinner);

            listView.setAdapter(new ArrayAdapter<String>(ListMahasiswaActivity.this, android.R.layout.simple_list_item_1, items));
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ListMahasiswaActivity.this, android.R.layout.simple_spinner_item, items);

            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(ListMahasiswaActivity.this, "Anda memilih = " + items[i], Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    Toast.makeText(ListMahasiswaActivity.this, "Anda tidak memilih", Toast.LENGTH_SHORT).show();
                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(ListMahasiswaActivity.this, "Anda memilih = " + items[i], Toast.LENGTH_SHORT).show();
                }
            });
        }

        public void GoToCreate(View view) {
            Intent intent = new Intent(ListMahasiswaActivity.this, CreateMhsActivity.class);
            startActivity(intent);
        }

        public void GoToUpdate(View view) {
            Intent intent = new Intent(ListMahasiswaActivity.this, UpdateMhsActivity.class);
            startActivity(intent);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == R.id.proteintracker) {
                Toast.makeText(getApplicationContext(), "ini menu pertama yang diklik", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.proteintracker) {
                Toast.makeText(getApplicationContext(), "ini menu kedua yang diklik", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.proteintracker) {
                Toast.makeText(getApplicationContext(), "ini menu ketiga yang diklik", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
            super.onCreateContextMenu(menu, v, menuInfo );
            menu.setHeaderTitle("Silakan Pilih");
            menu.add(0, v.getId(), 0, ("simpan"));
            menu.add(0, v.getId(), 0,("Tidak"));
        }
        public boolean onContextItemSelected (MenuItem item) {
            if (item.getTitle() == "Simpan") {
                Toast.makeText(getApplicationContext(), "item disimpan ke DB", Toast.LENGTH_SHORT).show();
            } else if (item.getTitle() == "Tidak") {
                Toast.makeText(getApplicationContext(), "Tidak disimpan ke DB", Toast.LENGTH_SHORT).show();
            } else {
                return true;
            }
            return false;
        }
        @Override
        protected void onCreateOptionsMenu(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_coba_menu);

            String CountMenu[] = {"Ayam", "Bebek", "Kuda", "Kodok", "Ular"};
            ListView lv = (ListView) findViewById(R.id.ListView1);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    this, android.R.layout.simple_list_item_1, CountMenu);
            lv.setAdapter(adapter);
            registerForContextMenu(lv);
            }
        }
    }



