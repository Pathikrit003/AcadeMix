package com.example.academix.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.academix.Activity.UpdateNotesActivity;
import com.example.academix.Model.Notes;
import com.example.academix.NotesMainActivity;

import com.example.academix.R;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.notesViewholder>{

    NotesMainActivity mainActivity;
    List<Notes> notes;



    public NotesAdapter(NotesMainActivity mainActivity, List<Notes> notes) {
        this.mainActivity=mainActivity;
        this.notes=notes;
    }

    @Override
    public notesViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new notesViewholder(LayoutInflater.from(mainActivity).inflate(R.layout.item_notes,parent,false));
    }

    @Override
    public void onBindViewHolder(notesViewholder holder, int position) {
        Notes note=notes.get(position);

        switch (note.notesPriority) {
            case "1":
                holder.notesPriority.setBackgroundResource(R.drawable.green_shape);
                break;
            case "2":
                holder.notesPriority.setBackgroundResource(R.drawable.yellow_shape);
                break;
            default:
                holder.notesPriority.setBackgroundResource(R.drawable.red_shape);
                break;
        }

        holder.title.setText(note.notesTitle);
        holder.notes.setText(note.notes);
        holder.notesDate.setText(note.notesDate);

        holder.itemView.setOnClickListener(v-> {
            Intent intent=new Intent(mainActivity, UpdateNotesActivity.class);
            intent.putExtra("id",note.id);
            intent.putExtra("title",note.notesTitle);
            intent.putExtra("notes",note.notes);
            intent.putExtra("priority",note.notesPriority);

            mainActivity.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    static class notesViewholder extends RecyclerView.ViewHolder {

        TextView title,notes,notesDate;
        View notesPriority;
        public notesViewholder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.notesTitle);
            notes=itemView.findViewById(R.id.notesView);
            notesDate=itemView.findViewById(R.id.notesDate);
            notesPriority=itemView.findViewById(R.id.notesPriority);
}
    }

}