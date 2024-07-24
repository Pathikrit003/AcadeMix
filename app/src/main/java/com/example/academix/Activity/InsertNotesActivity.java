package com.example.academix.Activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.academix.Model.Notes;
import com.example.academix.R;
import com.example.academix.ViewModel.NotesViewModel;
import com.example.academix.databinding.ActivityInsertNotesBinding;

import java.text.DateFormat;
import java.util.Date;

public class InsertNotesActivity extends AppCompatActivity {

    ActivityInsertNotesBinding binding;
    String title, notes;
    NotesViewModel notesViewModel;
    String priority = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInsertNotesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        notesViewModel = ViewModelProviders.of(this).get(NotesViewModel.class);


        binding.greenPriority.setOnClickListener(v -> {
            priority = "1";
            binding.greenPriority.setImageResource(R.drawable.baseline_done_24);
            binding.yellowPriority.setImageResource(0);
            binding.redPriority.setImageResource(0);
        });

        binding.yellowPriority.setOnClickListener(v -> {
            priority = "2";
            binding.greenPriority.setImageResource(0);
            binding.yellowPriority.setImageResource(R.drawable.baseline_done_24);
            binding.redPriority.setImageResource(0);
        });

        binding.redPriority.setOnClickListener(v -> {
            priority = "3";
            binding.greenPriority.setImageResource(0);
            binding.yellowPriority.setImageResource(0);
            binding.redPriority.setImageResource(R.drawable.baseline_done_24);
        });

        binding.doneNotesBtn.setOnClickListener(v -> {
            title = binding.notesTitle.getText().toString();
            notes = binding.notesData.getText().toString();
            CreateNotes(title, notes);
        });
    }

    private void CreateNotes(String title, String notes) {
        Date date = new Date();
        CharSequence sequence = DateFormat.getDateInstance().format(date);

        Notes notes1 = new Notes();
        notes1.notesTitle = title;
        notes1.notes = notes;
        notes1.notesDate = sequence.toString();
        notes1.notesPriority = priority;

        notesViewModel.insetNote(notes1);

        Toast.makeText(this, "Notes Created Successfully!", Toast.LENGTH_SHORT).show();

        finish();
    }
}

