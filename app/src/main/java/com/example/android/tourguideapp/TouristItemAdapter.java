package com.example.android.tourguideapp;

/**
 * Created by mjyatco on 8/11/17.
 */

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link TouristItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link TouristItem} objects.
 */
public class TouristItemAdapter extends ArrayAdapter<TouristItem>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link TouristItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param touristItems is the list of {@link TouristItem}s to be displayed
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public TouristItemAdapter(Context context, ArrayList<TouristItem> touristItems, int colorResourceId) {
        super(context, 0, touristItems);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        TouristItem currentTouristItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tourist_item_text_view.
        TextView touristItemTextView = (TextView) listItemView.findViewById(R.id.tourist_item_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        touristItemTextView.setText(currentTouristItem.getTouristItemId());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        infoTextView.setText(currentTouristItem.getTouristItemInfoId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentTouristItem.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTouristItem.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
