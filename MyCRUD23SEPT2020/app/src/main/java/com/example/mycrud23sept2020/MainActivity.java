package com.example.mycrud23sept2020;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

import java.util.HashMap;

/**
 * Created by muhammadyusuf on 01/19/2017.
 * kodingindonesia
 */



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Dibawah ini merupakan perintah untuk mendefinikan View
//    private EditText editTextName;
//    private EditText editTextDesg;
//    private EditText editTextSal;
//    private EditText editTextName2;
//
//    private Button buttonAdd;
//    private Button buttonView;
//    private Button buttonFind;
//
//    ArrayList<String> list = new ArrayList<String>();
//    ArrayAdapter<String> adapter;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //Inisialisasi dari View
//        editTextName = (EditText) findViewById(R.id.editTextName);
//        editTextDesg = (EditText) findViewById(R.id.editTextDesg);
//        editTextSal = (EditText) findViewById(R.id.editTextSalary);
//        editTextName2 = (EditText) findViewById(R.id.editTextName2);
//
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
//        Spinner spinner = (Spinner) findViewById((R.id.spinnerDesg));
//        spinner.setAdapter(adapter);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        buttonAdd = (Button) findViewById(R.id.buttonAdd);
//        buttonView = (Button) findViewById(R.id.buttonView);
//        buttonFind = (Button) findViewById(R.id.buttonFind);
//
//        //Setting listeners to button
//        buttonAdd.setOnClickListener(this);
//        buttonView.setOnClickListener(this);
//        buttonFind.setOnClickListener(this);

        // menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_pegawai, R.id.nav_posisi)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addEmployee(){

//        final String name = editTextName.getText().toString().trim();
//        final String desg = editTextDesg.getText().toString().trim();
//        final String sal = editTextSal.getText().toString().trim();
//
//        class AddEmployee extends AsyncTask<Void,Void,String>{
//
//            ProgressDialog loading;
//
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//                loading = ProgressDialog.show(MainActivity.this,"Menambahkan...","Tunggu...",false,false);
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                loading.dismiss();
//                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            protected String doInBackground(Void... v) {
//                HashMap<String,String> params = new HashMap<>();
//                params.put(konfigurasi.KEY_EMP_NAMA,name);
//                params.put(konfigurasi.KEY_EMP_POSISI,desg);
//                params.put(konfigurasi.KEY_EMP_GAJIH,sal);
//                System.out.print(params);
//
//                RequestHandler rh = new RequestHandler();
//                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
//                return res;
//            }
//        }
//
//        AddEmployee ae = new AddEmployee();
//        ae.execute();
    }

    @Override
    public void onClick(View v) {
//        if(v == buttonAdd){
//            addEmployee();
//        }
//
//        if(v == buttonView){
//            startActivity(new Intent(this,TampilSemuaPgw.class));
//        }
//
//        if(v == buttonFind){
////            startActivity(new Intent(this,TampilSebagianPgw.class));
//            Intent intent = new Intent(this, TampilSebagianPgw.class);
//            Bundle b = new Bundle();
//            final String name2 = editTextName2.getText().toString().trim();
//            b.putString("key", name2);
//            intent.putExtras(b);
//            startActivity(intent);
//            finish();
//        }
    }
}

