package com.example.q_notesapp;

import androidx.cardview.widget.CardView;

import com.example.q_notesapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);

    void onLongClick(Notes notes, CardView cardView);



}
