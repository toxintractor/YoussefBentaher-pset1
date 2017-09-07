package com.example.mocro.youssefbentaher_pset1;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

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


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        int hatValue = ihat.getVisibility();
        if(hatValue == View.VISIBLE){
            outState.putInt("hat", 1);
        }
        Log.d("patato", "head");

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int hatInt = savedInstanceState.getInt("hat", 0);
        if(hatInt == 1){
            ihat.setVisibility(View.VISIBLE);
        }
        else{
            ihat.setVisibility(View.INVISIBLE);
        }

    }

}
