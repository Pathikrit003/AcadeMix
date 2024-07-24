package com.example.academix.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.academix.Dao.NotesDAO;
import com.example.academix.Database.NotesDatabase;
import com.example.academix.Model.Notes;

import java.util.List;

public class NotesRepository {

    public NotesDAO notesDAO;
    public LiveData<List<Notes>> getallNotes;

    public NotesRepository(Application application){
        NotesDatabase database = NotesDatabase.getDatabaseInstance(application);
        notesDAO= database.notesDAO();
        getallNotes=notesDAO.getallNotes();
    }

    public void insertNotes(Notes notes){
        notesDAO.insertNotes(notes);
    }

    public void deleteNotes(int id){
        notesDAO.deleteNotes(id);
    }

    public void updateNotes(Notes notes){
        notesDAO.updateNotes(notes);
}
}