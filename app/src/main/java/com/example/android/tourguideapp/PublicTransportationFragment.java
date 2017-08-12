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
public class PublicTransportationFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();
        touristItems.add(new TouristItem(R.string.public_transportation_subway, R.string.public_transportation_info_subway,
                R.drawable.subway));
        touristItems.add(new TouristItem(R.string.public_transportation_bus, R.string.public_transportation_info_bus,
                R.drawable.bus));
        touristItems.add(new TouristItem(R.string.public_transportation_lirr, R.string.public_transportation_info_lirr,
                R.drawable.lirr));
        touristItems.add(new TouristItem(R.string.public_transportation_amtrak, R.string.public_transportation_info_amtrak,
                R.drawable.amtrak));
        touristItems.add(new TouristItem(R.string.public_transportation_nj_transit, R.string.public_transportation_info_nj_transit,
                R.drawable.nj_transit));
        touristItems.add(new TouristItem(R.string.public_transportation_taxi, R.string.public_transportation_info_taxi,
                R.drawable.taxi));
        touristItems.add(new TouristItem(R.string.public_transportation_ferry, R.string.public_transportation_info_ferry,
                R.drawable.ferry));
        touristItems.add(new TouristItem(R.string.public_transportation_jfk, R.string.public_transportation_info_jfk,
                R.drawable.jfk));
        touristItems.add(new TouristItem(R.string.public_transportation_laguardia, R.string.public_transportation_info_laguardia,
                R.drawable.laguardia));
        touristItems.add(new TouristItem(R.string.public_transportation_horse, R.string.public_transportation_info_horse,
                R.drawable.horse));

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