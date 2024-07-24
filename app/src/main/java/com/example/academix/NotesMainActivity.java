package com.example.academix;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.academix.Activity.InsertNotesActivity;
import com.example.academix.Adapter.NotesAdapter;
import com.example.academix.ViewModel.NotesViewModel;
import com.example.academix.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NotesMainActivity extends AppCompatActivity {

    FloatingActionButton newNotesBtn;
    NotesViewModel notesViewModel;
    RecyclerView notesRecycler;
    NotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_main);

        newNotesBtn=findViewById(R.id.newNotesBtn);
        notesRecycler=findViewById(R.id.notesRecycler);

        notesViewModel= ViewModelProviders.of(this).get(NotesViewModel.class);


        newNotesBtn.setOnClickListener(v -> {
            startActivity(new Intent(NotesMainActivity.this, InsertNotesActivity.class));
        } );

        notesViewModel.getAllNotes.observe(this,notes -> {
            notesRecycler.setLayoutManager(new GridLayoutManager(this,2));
            adapter=new NotesAdapter(NotesMainActivity.this,notes);
            notesRecycler.setAdapter(adapter);

    });
}

}