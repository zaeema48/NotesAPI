package com.example.notes.entities;

import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notesList")
@DynamicUpdate
public class Notes {
    @Id
    private String title;
    @NonNull
    private String text;

    public Notes() {
    }

    public Notes(String title, @NonNull String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
