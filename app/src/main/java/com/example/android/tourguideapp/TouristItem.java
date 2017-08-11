package com.example.android.tourguideapp;

/**
 * Created by mjyatco on 8/11/17.
 */

/**
 * {@link TouristItem} represents a tourist item that the user wants to learn about.
 * It contains resource IDs for the tourist item, audio file, and
 * optional image file for that word.
 */
public class TouristItem {

    /** String resource ID for the tourist item */
    private int mTouristItemId;

    /** String resource ID for the tourist item info */
    private int mTouristItemInfoId;

    /** Image resource ID for the tourist item */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this tourist item */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param touristItemId is the string resource ID for the tourist item
     * @param touristItemInfoId is the string resource ID for the tourist item info
     */
    public TouristItem(int touristItemId, int touristItemInfoId) {
        mTouristItemId = touristItemId;
        mTouristItemInfoId = touristItemInfoId;
    }

    /**
     * Create a new Word object.
     *
     * @param touristItemId is the string resource ID for the tourist item
     * @param touristItemInfoId is the string resource ID for the tourist item info
     * @param imageResourceId is the resource ID for the image file associate with this tourist item
     */
    public TouristItem(int touristItemId, int touristItemInfoId, int imageResourceId) {
        mTouristItemId = touristItemId;
        mTouristItemInfoId = touristItemInfoId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the tourist item.
     */
    public int getTouristItemId() {
        return mTouristItemId;
    }

    /**
     * Get the string resource ID for the tourist item info.
     */
    public int getTouristItemInfoId() {
        return mTouristItemInfoId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}