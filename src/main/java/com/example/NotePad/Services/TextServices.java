package com.example.NotePad.Services;

import com.example.NotePad.model.Text;
import com.example.NotePad.repository.TextRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TextServices {
    @Autowired
    TextRepo textRepo;
    public Text addall(int id, String text, String date) {
        Text text1 = new Text(id,text,date);
        textRepo.save(text1);
        return text1;
    }
}
