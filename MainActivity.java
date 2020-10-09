package com.example.bbi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	EditText berat,tinggi,hasil;
	Button proses;
	double nilaiBerat, NilaiTinggi, nilaiHasil;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        berat=(EditText)findViewById(R.id.text1);
        tinggi=(EditText)findViewById(R.id.text2);
        hasil=(EditText)findViewById(R.id.text3);
        proses=(Button)findViewById(R.id.button1);
    }
    
    public void proses(View view){
    	nilaiBerat=Double.parseDouble(berat.getText().toString());
    	NilaiTinggi=Double.parseDouble(tinggi.getText().toString());
    	nilaiHasil=nilaiBerat/((NilaiTinggi/100)*(NilaiTinggi/100));
    	
    	if(nilaiHasil<=18.5){
    		hasil.setText("underwight / berat badan kurang");
    	}else if(nilaiHasil>18.5 && nilaiHasil<24.99){
    		hasil.setText("Normal");
    	}else if(nilaiHasil>25 && nilaiHasil<29.99){
    		hasil.setText("Overwight / berat badan lebih");
    	}else{
    		hasil.setText("Obesitas / kegemukan");
    		
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
