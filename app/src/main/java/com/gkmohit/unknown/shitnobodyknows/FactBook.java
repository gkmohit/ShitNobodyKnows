package com.gkmohit.unknown.shitnobodyknows;

import android.util.Log;

import java.util.Random;

/**
 * Created by gkmohit on 15-07-12.
 */
public class FactBook {

    public static final String TAG = FactBook.class.getSimpleName();
    //TODO
    //Implement this into a database for faster and more optimal storage.
    public String[] mFacts = {
            "The human body has about 60,00 miles of blood vessels.",
            "Sloths sneeze slowly and they give birth upside down SLOWLY.",
            "Its illegal to slurp your soup in New Jersey.",
            "Ants stretch when they wake up in the morning.",
            "Women have a keener sense of smell than men.",
            "Benjamin Franklin gave guitar lessons.",
            "One mother shark can give birth up to 70 baby sharks per litter.",
            "The covering on the end of a shoelace is called Aglet.",
            "Ketchup was once sold as a medicine.",
            "In Antarctica the sunsets can be green."
    };

    public String getFact(){
        Log.d(TAG, "getFact() was called.");
        String fact = new String();
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        Log.d(TAG, "Returning fact : " + fact);
        return fact;

    }
}

