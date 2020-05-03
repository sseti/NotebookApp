package com.example.NoteBookApp.Controller;

import com.example.NoteBookApp.Service.NoteService;
import com.example.NoteBookApp.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class NoteController {
    NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> findNoteById(@RequestParam UUID id) {
        return new ResponseEntity<Note>(noteService.findNoteById(id).get(),HttpStatus.OK);
    }
}
