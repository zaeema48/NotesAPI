package com.example.notes.entities;

import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notesList")
@DynamicUpdate
@Data
@NoArgsComstructor
public class Notes {
    @Id
    private String heading;
    @NonNull
    private String text;

   
}
