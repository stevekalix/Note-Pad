package com.example.NotePad.repository;

import com.example.NotePad.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepo extends JpaRepository<Text,Integer> {
}
