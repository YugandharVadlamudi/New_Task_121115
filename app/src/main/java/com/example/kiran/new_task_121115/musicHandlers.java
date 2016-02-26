package com.example.kiran.new_task_121115;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Kiran on 14-11-2015.
 */
public class musicHandlers extends Activity
{
    View includefile;
    int count=1;
    LinearLayout llhRecord,llhCobineSounds,upLoadMusic,LLHshereInspieration;
    Intent combineScreen,llhRecord_screen;
    ImageView IvUpload;
    TextView TvuploadMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_screen);
        includefile=findViewById(R.id.includeFile);
        /*make the layout invible ande effecting the layout*/
        includefile.setVisibility(View.GONE);
        llhRecord=(LinearLayout)findViewById(R.id.LLhRecord);
        llhCobineSounds=(LinearLayout)findViewById(R.id.llhCombineSounds);
        llhRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               llhRecord_screen=new Intent(getApplicationContext(),recordScreen.class);
                startActivity(llhRecord_screen);
            }
        });
        /*onclick for combinesounds*/
        llhCobineSounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                combineScreen = new Intent(getApplicationContext(), combinesound.class);
                startActivity(combineScreen);
            }
        });
        LLHshereInspieration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectTheme=new Intent(getApplicationContext(),SelectTheme.class);
                setIntent(intentSelectTheme);

            }
        });/*LLHshereInspieratinend onclick*/
        /*evnet listent sharing*/
        upLoadMusic.setOnClickListener(new layoutVisibity());
        IvUpload.setOnClickListener(new layoutVisibity());
        TvuploadMusic.setOnClickListener(new layoutVisibity());
    } /*oncreate end*/
    /*
    this is shareble for the TVOnclick IMonClick LLHonClick
    */
    public class layoutVisibity implements View.OnClickListener {
        public void onClick(View args0) {
            includefile.setVisibility(View.VISIBLE);
        }
    }/*onclick listener end*/
 /*public void makeLayoutVisible(View view)
    {
            includefile.setVisibility(view.VISIBLE);
    }*/

}
