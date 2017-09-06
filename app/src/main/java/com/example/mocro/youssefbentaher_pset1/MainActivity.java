package com.example.mocro.youssefbentaher_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ihat, ieyes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ihat = (ImageView) findViewById(R.id.imageHat);
        ieyes = (ImageView) findViewById(R.id.imageEyes);

    }

    public void hatClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            ihat.setVisibility(View.VISIBLE);
        }
        else{
            ihat.setVisibility(View.INVISIBLE);
        }
    }

    public void eyesClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            ieyes.setVisibility(View.VISIBLE);
        }
        else{
            ieyes.setVisibility(View.INVISIBLE);
        }
    }

}
