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
public class SportsFragment extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();
        touristItems.add(new TouristItem(R.string.sports_yankees, R.string.sports_info_yankees,
                R.drawable.yankees));
        touristItems.add(new TouristItem(R.string.sports_mets, R.string.sports_info_mets,
                R.drawable.mets));
        touristItems.add(new TouristItem(R.string.sports_giants, R.string.sports_info_giants,
                R.drawable.giants));
        touristItems.add(new TouristItem(R.string.sports_jets, R.string.sports_info_jets,
                R.drawable.jets));
        touristItems.add(new TouristItem(R.string.sports_rangers, R.string.sports_info_rangers,
                R.drawable.rangers));
        touristItems.add(new TouristItem(R.string.sports_islanders, R.string.sports_info_islanders,
                R.drawable.islanders));
        touristItems.add(new TouristItem(R.string.sports_knicks, R.string.sports_info_knicks,
                R.drawable.knicks));
        touristItems.add(new TouristItem(R.string.sports_nets, R.string.sports_info_nets,
                R.drawable.nets));
        touristItems.add(new TouristItem(R.string.sports_nycfc, R.string.sports_info_nycfc,
                R.drawable.nycfc));
        touristItems.add(new TouristItem(R.string.sports_red_bulls, R.string.sports_info_red_bulls,
                R.drawable.redbulls));

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
