package com.example.achndrs4.plantme;

/**
 * Created by achndrs4 on 10/13/17.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "plantsinfo";
    private static final String TABLE_PLANTS = "plants";
    private static final String KEY_ID = "sci_name";
    private static final String KEY_COMMON_NAME = "common_name";
    private static final String KEY_STATES_FOUND = "states_found";
    private static final String KEY_DURATION = "duration";
    private static final String KEY_GROWTH_R = "growth_r";
    private static final String KEY_LIFESPAN = "lifespan";
    private static final String KEY_MIN_PH = "min_ph";
    private static final String KEY_MAX_PH = "max_ph";
    private static final String KEY_PRECIP_MIN = "precip_min";
    private static final String KEY_PRECIP_MAX = "precip_max";
    private static final String KEY_SHADE_TOLERANCE = "shade_tolerance";
    private static final String KEY_CHRISTMAS = "isChristmasTreeProduct";
    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_PLANTS + "("
        + KEY_ID + " TEXT PRIMARY KEY," + KEY_COMMON_NAME + " TEXT,"
        + KEY_STATES_FOUND + " TEXT" + KEY_DURATION + " TEXT,"+KEY_GROWTH_R + " TEXT,"+KEY_LIFESPAN + " TEXT," + KEY_MIN_PH + " INTEGER,"+ KEY_MAX_PH + " INTEGER,"+KEY_PRECIP_MIN + " INTEGER,"+KEY_PRECIP_MAX + " INTEGER,"+KEY_SHADE_TOLERANCE +"TEXT,"+")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PLANTS);
        onCreate(db);
    }

    public void addPlant(Plant plant) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, plant.getSci_name());
        values.put(KEY_COMMON_NAME,plant.getCommon_name());
        values.put(KEY_STATES_FOUND,plant.getStates_found());
        values.put(KEY_DURATION, plant.getDuration());
        values.put(KEY_GROWTH_R,plant.getGrowth_r());
        values.put(KEY_MIN_PH,plant.getMin_ph());
        values.put(KEY_MAX_PH,plant.getMax_ph());
        values.put(KEY_PRECIP_MIN,plant.getPrecip_min());
        values.put(KEY_PRECIP_MAX,plant.getPrecip_max());
        values.put(KEY_SHADE_TOLERANCE, plant.getShade_tolerance());
        values.put(KEY_CHRISTMAS,plant.getIsChristmasTreeProduct());
        db.insert(TABLE_PLANTS, null, values);
        db.close();
    }
    public Plant getPlant(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_PLANTS, new String[]{KEY_ID,
                        KEY_COMMON_NAME, KEY_STATES_FOUND,KEY_DURATION,
                        KEY_GROWTH_R,KEY_MIN_PH,KEY_MAX_PH,KEY_PRECIP_MIN,KEY_PRECIP_MAX,KEY_SHADE_TOLERANCE,
                        KEY_CHRISTMAS}, KEY_ID + "=?",
        new String[]{id}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
        Plant contact = new Plant(cursor.getString(0),
                cursor.getString(1), cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5), cursor.getInt(6),cursor.getInt(7),cursor.getInt(8),cursor.getInt(9),cursor.getString(10),cursor.getString(11));
        return contact;
    }
}