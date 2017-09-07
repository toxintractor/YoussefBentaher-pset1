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

    ImageView ihat, iglasses, iears, ieyebrows, ieyes, iarms, inose, imustache, imouth, ishoes ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ihat = (ImageView) findViewById(R.id.imageHat);
        iglasses = (ImageView) findViewById(R.id.imageGlases);
        iears = (ImageView) findViewById(R.id.imageEars);
        ieyebrows = (ImageView) findViewById(R.id.imageEyebrows);
        ieyes = (ImageView) findViewById(R.id.imageEyes);

        iarms = (ImageView) findViewById(R.id.imageArms);
        inose = (ImageView) findViewById(R.id.imageNose);
        imustache = (ImageView) findViewById(R.id.imageMustache);
        imouth = (ImageView) findViewById(R.id.imageMouth);
        ishoes = (ImageView) findViewById(R.id.imageShoes);


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
    public void glassesClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            iglasses.setVisibility(View.VISIBLE);
        }
        else{
            iglasses.setVisibility(View.INVISIBLE);
        }
    }
    public void earsClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            iears.setVisibility(View.VISIBLE);
        }
        else{
            iears.setVisibility(View.INVISIBLE);
        }
    }
    public void eyebrowsClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            ieyebrows.setVisibility(View.VISIBLE);
        }
        else{
            ieyebrows.setVisibility(View.INVISIBLE);
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

    public void armsClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            iarms.setVisibility(View.VISIBLE);
        }
        else{
            iarms.setVisibility(View.INVISIBLE);
        }
    }

    public void noseClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            inose.setVisibility(View.VISIBLE);
        }
        else{
            inose.setVisibility(View.INVISIBLE);
        }
    }

    public void mustacheClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            imustache.setVisibility(View.VISIBLE);
        }
        else{
            imustache.setVisibility(View.INVISIBLE);
        }
    }

    public void mouthClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            imouth.setVisibility(View.VISIBLE);
        }
        else{
            imouth.setVisibility(View.INVISIBLE);
        }
    }

    public void shoesClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked == true){
            ishoes.setVisibility(View.VISIBLE);
        }
        else{
            ishoes.setVisibility(View.INVISIBLE);
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int hatValue = ihat.getVisibility();
        if(hatValue == View.VISIBLE){
            outState.putInt("hat", 1);
        }

        int glassesValue = iglasses.getVisibility();
        if(glassesValue == View.VISIBLE){
            outState.putInt("glasses", 1);
        }

        int earsValue = iears.getVisibility();
        if(earsValue == View.VISIBLE){
            outState.putInt("ears", 1);
        }

        int eyebrowsValue = ieyebrows.getVisibility();
        if(eyebrowsValue == View.VISIBLE){
            outState.putInt("eyebrows", 1);
        }

        int eyesValue = ieyes.getVisibility();
        if(eyesValue == View.VISIBLE){
            outState.putInt("eyes", 1);
        }

        int armsValue = iarms.getVisibility();
        if(armsValue == View.VISIBLE){
            outState.putInt("arms", 1);
        }

        int noseValue = inose.getVisibility();
        if(noseValue == View.VISIBLE){
            outState.putInt("nose", 1);
        }

        int mustacheValue = imustache.getVisibility();
        if(mustacheValue == View.VISIBLE){
            outState.putInt("mustache", 1);
        }

        int mouthValue = imouth.getVisibility();
        if(mouthValue == View.VISIBLE){
            outState.putInt("mouth", 1);
        }

        int shoesValue = ishoes.getVisibility();
        if(shoesValue == View.VISIBLE){
            outState.putInt("shoes", 1);
        }
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

        int glassesInt = savedInstanceState.getInt("glasses", 0);
        if(glassesInt == 1){
            iglasses.setVisibility(View.VISIBLE);
        }
        else{
            iglasses.setVisibility(View.INVISIBLE);
        }

        int earsInt = savedInstanceState.getInt("ears", 0);
        if(earsInt == 1){
            iears.setVisibility(View.VISIBLE);
        }
        else{
            iears.setVisibility(View.INVISIBLE);
        }

        int eyebrowsInt = savedInstanceState.getInt("eyebrows", 0);
        if(eyebrowsInt == 1){
            ieyebrows.setVisibility(View.VISIBLE);
        }
        else{
            ieyebrows.setVisibility(View.INVISIBLE);
        }

        int eyesInt = savedInstanceState.getInt("eyes", 0);
        if(eyesInt == 1){
            ieyes.setVisibility(View.VISIBLE);
        }
        else{
            ieyes.setVisibility(View.INVISIBLE);
        }

        int armsInt = savedInstanceState.getInt("arms", 0);
        if(armsInt == 1){
            iarms.setVisibility(View.VISIBLE);
        }
        else{
            iarms.setVisibility(View.INVISIBLE);
        }

        int noseInt = savedInstanceState.getInt("nose", 0);
        if(noseInt == 1){
            inose.setVisibility(View.VISIBLE);
        }
        else{
            inose.setVisibility(View.INVISIBLE);
        }

        int mustacheInt = savedInstanceState.getInt("mustache", 0);
        if(mustacheInt == 1){
            imustache.setVisibility(View.VISIBLE);
        }
        else{
            imustache.setVisibility(View.INVISIBLE);
        }

        int mouthInt = savedInstanceState.getInt("mouth", 0);
        if(mouthInt == 1){
            imouth.setVisibility(View.VISIBLE);
        }
        else{
            imouth.setVisibility(View.INVISIBLE);
        }

        int shoesInt = savedInstanceState.getInt("shoes", 0);
        if(shoesInt == 1){
            ishoes.setVisibility(View.VISIBLE);
        }
        else{
            ishoes.setVisibility(View.INVISIBLE);
        }

    }

}
