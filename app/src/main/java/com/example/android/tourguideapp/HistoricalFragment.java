package com.example.android.tourguideapp;

/**
 * Created by mjyatco on 8/11/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class HistoricalFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();
        touristItems.add(new TouristItem(R.string.histortical_moma, R.string.histortical_info_moma,
                R.drawable.moma));
        touristItems.add(new TouristItem(R.string.histortical_statue, R.string.histortical_info_statue,
                R.drawable.statue));
        touristItems.add(new TouristItem(R.string.histortical_marshall, R.string.histortical_info_marshall,
                R.drawable.marshall));
        touristItems.add(new TouristItem(R.string.histortical_empire, R.string.histortical_info_empire,
                R.drawable.empire));
        touristItems.add(new TouristItem(R.string.histortical_bridge, R.string.histortical_info_bridge,
                R.drawable.bridge));
        touristItems.add(new TouristItem(R.string.histortical_south_street, R.string.histortical_info_south_street,
                R.drawable.south_street));
        touristItems.add(new TouristItem(R.string.histortical_central_park, R.string.histortical_info_central_park,
                R.drawable.central_park));
        touristItems.add(new TouristItem(R.string.historical_intrepid, R.string.historical_info_intrepid,
                R.drawable.intrepid));

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