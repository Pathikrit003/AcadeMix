package com.example.academix.Database;

import android.content.Context;

import androidx.room.RoomDatabase;
import androidx.room.Room;
import androidx.room.Database;

import com.example.academix.Model.Notes;
import com.example.academix.Dao.NotesDAO;

@Database(entities = {Notes.class}, version = 1)
public abstract class NotesDatabase extends RoomDatabase {

    public abstract NotesDAO notesDAO();

    public  static NotesDatabase INSTANCE;

    public static NotesDatabase getDatabaseInstance(Context context){

        if (INSTANCE == null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(), NotesDatabase.class, "Notes_Database").allowMainThreadQueries().build();
        }
        return INSTANCE;

}
}