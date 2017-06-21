package com.example.shafayat.cardapplication;

import java.util.ArrayList;

/**
 * Created by Shafayat on 6/21/2017.
 */

public class Data {
    public static ArrayList<Infrormation> getData(){
        ArrayList<Infrormation> data = new ArrayList<>();
        int[] images = {R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card,R.drawable.card};

        String[] categories = {"Trump","Trump","Trump","Trump","Trump","Trump","Trump","Trump","Trump","Trump",};

        for (int i = 0; i < images.length; i++) {
            Infrormation current = new Infrormation();
            current.title = categories[i];
            current.imageId = images[i];

            data.add(current);
        }

        return  data;
    }
}
