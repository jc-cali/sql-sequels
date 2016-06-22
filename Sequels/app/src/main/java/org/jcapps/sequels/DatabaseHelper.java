package org.jcapps.sequels;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JC on 6/22/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1; // change as we upgrade
    public static final String DB_NAME = "ReallyBadSequels.db"; // name of your db
    public static final String CREATE_TABLE = "CREATE TABLE sequels ( id INT PRIMARY KEY, name TEXT);";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS sequels;";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE); // create table
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE); // drop table
        onCreate(db); // create table
    }

    // NOT an override
    public void seedDatabase() {
        insertSequel(1, "Empire Strikes Back");
        insertSequel(2, "Toy Story 2");
        insertSequel(3, "Raiders of the Lost Ark");
        insertSequel(4, "Halloween 2");
        insertSequel(5, "Moulan 2");
        insertSequel(6, "Taken 2");
        insertSequel(7, "Jaws 2");
        insertSequel(8, "Deathwish 2");
        insertSequel(9, "Zoolander 2");
        insertSequel(10, "Die Harder with a Vengence");
    }

    public void insertSequel(int id, String name) {
        // insert into table_name values (1, "Blah");
        SQLiteDatabase db = getReadableDatabase();
        // special type of hashmap for Datbase values
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("name", name);
        // protin: great place to put in a breakpoint
        db.insert("sequels", null, values);
        // insert into TABLE, null, VALUES
    }

}

