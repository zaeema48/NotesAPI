package com.example.notes.dao;

import com.example.notes.entities.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Notes,Integer> {
    public Notes findByTitle(String title);   //should be in primitive data type
    public Notes deleteByTitle(String title);
}
