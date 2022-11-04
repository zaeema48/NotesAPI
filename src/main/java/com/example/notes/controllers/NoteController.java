package com.example.notes.controllers;

import com.example.notes.entities.Notes;
import com.example.notes.services.NoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    private NoteServices services;

    @PostMapping(path = "/add_note")
    public void addNote(@RequestBody Notes notes){
        this.services.addNote(notes);
    }

    @DeleteMapping(path = "/delete_note")
    public void deleteNote(@RequestBody Notes notes){
        String title=notes.getTitle();
        services.deleteNote(title);
    }
//    @DeleteMapping(path="/delete_note/{title}")
//    public void deleteNote(@PathVariable("title") String title ){
//        services.deleteNote(title);
//    }
    @GetMapping(path = "/get_notes")
    public List<Notes> displayNotes(){
        return services.getNotes();
    }

}
