package com.muflihun.sqliteexample;

import com.muflihun.sqliteexample.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
