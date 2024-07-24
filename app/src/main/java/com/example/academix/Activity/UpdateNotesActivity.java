package com.example.academix.Activity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.academix.Model.Notes;
import com.example.academix.R;
import com.example.academix.ViewModel.NotesViewModel;
import com.example.academix.databinding.ActivityUpdateNotesBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.text.DateFormat;
import java.util.Date;

public class UpdateNotesActivity extends AppCompatActivity {

    ActivityUpdateNotesBinding binding;
    String priority="1";
    NotesViewModel notesViewModel;

    String stitle, snotes, spriority;
    int iid;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUpdateNotesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        iid= getIntent().getIntExtra("id",0);
        stitle= getIntent().getStringExtra("title");
        snotes= getIntent().getStringExtra("notes");
        spriority= getIntent().getStringExtra("priority");

        binding.upTitle.setText(stitle);
        binding.upNotes.setText(snotes);

        //setContentView(R.layout.activity_main);

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        if (spriority.equals("1")){
            binding.greenPriority.setImageResource(R.drawable.baseline_done_24);
        } else if (spriority.equals("2")) {
            binding.yellowPriority.setImageResource(R.drawable.baseline_done_24);
        } else if(spriority.equals("3")){
            binding.redPriority.setImageResource(R.drawable.baseline_done_24);
        }

        notesViewModel= ViewModelProviders.of( this).get(NotesViewModel.class);

        binding.greenPriority.setOnClickListener(v -> {
            priority="1";
            binding.greenPriority.setImageResource(R.drawable.baseline_done_24);
            binding.yellowPriority.setImageResource(0);
            binding.redPriority.setImageResource(0);

        });

        binding.yellowPriority.setOnClickListener(v -> {
            priority="2";
            binding.greenPriority.setImageResource(0);
            binding.yellowPriority.setImageResource(R.drawable.baseline_done_24);
            binding.redPriority.setImageResource(0);

        });

        binding.redPriority.setOnClickListener(v -> {
            priority="3";
            binding.greenPriority.setImageResource(0);
            binding.yellowPriority.setImageResource(0);
            binding.redPriority.setImageResource(R.drawable.baseline_done_24);


        });

        binding.updateNotesBtn.setOnClickListener(v ->{
            String title=binding.upTitle.getText().toString();
            String notes=binding.upNotes.getText().toString();

            UpdateNotes(title,notes);
        });

    }

    private void UpdateNotes(String title, String notes) {
        Date date= new Date();
        CharSequence sequence= DateFormat.getDateInstance().format(date);
        Notes updateNotes=new Notes();

        updateNotes.id=iid;
        updateNotes.notesTitle=title;
        updateNotes.notes=notes;
        updateNotes.notesDate=sequence.toString();
        updateNotes.notesPriority=priority;

        notesViewModel.updateNote(updateNotes);

        Toast.makeText(this,"Notes Updated Successfully!", Toast.LENGTH_SHORT).show();

        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.delete_menu, menu);
        return true;
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable View parent, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);

    }



    public void setSupportActionBar(Toolbar toolbar) {
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.ic_delete){
            BottomSheetDialog sheetDialog= new BottomSheetDialog(UpdateNotesActivity.this,R.style.BottomSheetStyle);

            View view= LayoutInflater.from(UpdateNotesActivity.this).inflate(R.layout.delete_bottom_sheet,(LinearLayout)findViewById(R.id.bottomSheet));

            sheetDialog.setContentView(view);

            TextView yes, no;

            yes=view.findViewById(R.id.delete_yes);
            no=view.findViewById(R.id.delete_no);

            yes.setOnClickListener(v ->{
                notesViewModel.deleteNote(iid);
                finish();

            });

            no.setOnClickListener(v ->{
                sheetDialog.dismiss();
            });

            sheetDialog.show();


        }

        return true;
}
}