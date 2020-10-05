package com.example.mycrud23sept2020.ui.posisi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mycrud23sept2020.PosisiActivity;
import com.example.mycrud23sept2020.R;
import com.example.mycrud23sept2020.RequestHandler;
import com.example.mycrud23sept2020.TampilSemuaPosisi;
import com.example.mycrud23sept2020.konfigurasi;
import com.example.mycrud23sept2020.ui.pegawai.PegawaiFragment;
import com.example.mycrud23sept2020.ui.pegawai.PegawaiViewModel;

import java.util.HashMap;

public class PosisiFragment extends Fragment {
    private PosisiViewModel posisiViewModel;

//    //Dibawah ini merupakan perintah untuk mendefinikan View
//    private EditText editTextPosisiPosisi;
//    private EditText editTextPosisiGajih;
//
//    private Button buttonPosisiAdd;
//    private Button buttonPosisiView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        posisiViewModel =
                ViewModelProviders.of(this).get(PosisiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_posisi, container, false);
        final TextView textView = root.findViewById(R.id.text_posisi);
        posisiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //Inisialisasi dari View
//        editTextPosisiPosisi = (EditText) findViewById((R.id.editTextPosisiPosisi));
//        editTextPosisiGajih = (EditText) findViewById((R.id.editTextPosisiGajih));
//
//        buttonPosisiAdd = (Button) findViewById(R.id.buttonPosisiAdd);
//        buttonPosisiView = (Button) findViewById(R.id.buttonPosisiView);
//
//        //Setting listeners to button
//        buttonPosisiAdd.setOnClickListener(this);
//        buttonPosisiView.setOnClickListener(this);
//    }


//    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
//    private void addPosisi(){
//
//        final String posisiposisi = editTextPosisiPosisi.getText().toString().trim();
//        final String posisigajih = editTextPosisiGajih.getText().toString().trim();
//
//        class AddPosisi extends AsyncTask<Void,Void,String> {
//
//            ProgressDialog loading;
//
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//                loading = ProgressDialog.show(PosisiActivity.this,"Menambahkan...","Tunggu...",false,false);
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                loading.dismiss();
//                Toast.makeText(PosisiActivity.this,s,Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            protected String doInBackground(Void... v) {
//                HashMap<String,String> params = new HashMap<>();
//                params.put(konfigurasi.KEY_POSISI_POSISI,posisiposisi);
//                params.put(konfigurasi.KEY_POSISI_GAJIH,posisigajih);
//                System.out.print(params);
//
//                RequestHandler rh = new RequestHandler();
//                String res = rh.sendPostRequest(konfigurasi.URL_POSISI_ADD, params);
//                return res;
//            }
//        }
//
//        AddPosisi ap = new AddPosisi();
//        ap.execute();
//    }
//
//    @Override
//    public void onClick(View v) {
//        if(v == buttonPosisiAdd){
//            addPosisi();
//        }
//
//        if(v == buttonPosisiView){
//            startActivity(new Intent(this, TampilSemuaPosisi.class));
//        }
//    }
}
