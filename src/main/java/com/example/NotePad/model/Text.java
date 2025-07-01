package com.example.NotePad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
public class Text {
    @Id
    private int no;
    private String text;
    private String date;


    public Text(int no, String text, String date) {
        this.no = no;
        this.text = text;
        this.date = date;
    }
    public Text() {}
}
