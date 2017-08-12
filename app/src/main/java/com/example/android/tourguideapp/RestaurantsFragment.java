package com.example.android.tourguideapp;



/**
 * Created by mjyatco on 8/11/17.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link android.support.v4.app.Fragment} that displays a list of color vocabulary words.
 */
public class RestaurantsFragment extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();
        touristItems.add(new TouristItem(R.string.restaurant_katz, R.string.restaurant_info_katz,
                R.drawable.katz));
        touristItems.add(new TouristItem(R.string.restaurant_joes, R.string.restaurant_info_joes,
                R.drawable.joes));
        touristItems.add(new TouristItem(R.string.restaurant_rainbow_room, R.string.restaurant_info_rainbow_room,
                R.drawable.rainbow));
        touristItems.add(new TouristItem(R.string.restaurant_balthazar, R.string.restaurant_info_balthazar,
                R.drawable.balthazar));
        touristItems.add(new TouristItem(R.string.restaurant_ivan_ramen, R.string.restaurant_info_ivan_ramen,
                R.drawable.ramen));
        touristItems.add(new TouristItem(R.string.restaurant_jewel_bako, R.string.restaurant_info_jewel_bako,
                R.drawable.bako));
        touristItems.add(new TouristItem(R.string.restaurant_patsys, R.string.restaurant_info_patsys,
                R.drawable.patsy));
        touristItems.add(new TouristItem(R.string.restaurant_ferrara, R.string.restaurant_info_ferrara,
                R.drawable.ferrara));
        touristItems.add(new TouristItem(R.string.restaurant_jeepney, R.string.restaurant_info_jeepney,
                R.drawable.jeepney));
        touristItems.add(new TouristItem(R.string.restaurant_smac, R.string.restaurant_info_smac,
                R.drawable.smac));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TouristItemAdapter adapter = new TouristItemAdapter(getActivity(), touristItems, R.color.category_historical);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
