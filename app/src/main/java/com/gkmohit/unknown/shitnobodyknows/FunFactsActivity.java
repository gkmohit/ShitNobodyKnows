package com.gkmohit.unknown.shitnobodyknows;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        Log.d(TAG, "OnCreate succesfully Created.");

        //Declaring our view variables and assign them the view from the layout
        final TextView factLable = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "FactButtonClicked");
                int color = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                String fact = mFactBook.getFact();
                Log.d(TAG, "Setting fact to : " + fact);
                factLable.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listner);

        //Toast.makeText(this , "Yay! Our Activity was created" , Toast.LENGTH_LONG).show();
    }
}