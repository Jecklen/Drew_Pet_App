package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Mike on 2/14/2017.
 */

public final class PetsContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.



    private PetsContract() {}

    /* Inner class that defines the table contents */
    public static final class PetEntry implements BaseColumns {

        /** START OF PET URI TOOLS ---------------- */
        public static final String CONTENT_AUTHORITY = "com.example.android.pets";
        public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
        public static final String PATH_PETS = "pets";
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        // Name of table for pets
        public final static String TABLE_NAME = "pets";

        /** Unique ID of pet
         *
         * INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /** Name of pet
         *
         * TEXT
         */
        public final static String COLUMN_PET_NAME = "name";

        /** Breed of Pet
         *
         * TEXT
         */
        public final static String COLUMN_PET_BREED = "breed";

        /** Gender of Pet
         *
         *  Only three possible values {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE}, {@link #GENDER_FEMALE}
         *
         *  INTEGER
         */
        public final static String COLUMN_PET_GENDER = "gender";

        /** Weight of pet
         *
         *  INTEGER
         */
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for pet gender
         */
        public static final int GENDER_UNKNOWN =0;
        public static final int GENDER_MALE =1;
        public static final int GENDER_FEMALE =2;
    }

}
