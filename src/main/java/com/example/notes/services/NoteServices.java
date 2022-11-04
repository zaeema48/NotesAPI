package com.example.notes.services;

import com.example.notes.dao.NoteRepository;
import com.example.notes.entities.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServices {
    @Autowired
    public NoteRepository repository;

    public void addNote(Notes note){
        repository.save(note);
    }

    public void deleteNote(String title){
//        repository.deleteById(id);
        Notes note=repository.findByTitle(title);
        repository.delete(note);
    }
    public List<Notes> getNotes(){
        List<Notes> notes=new ArrayList<>();
        notes=repository.findAll();
        return notes;
    }
}
