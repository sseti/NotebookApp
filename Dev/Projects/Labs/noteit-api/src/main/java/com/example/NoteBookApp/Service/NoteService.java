//package com.example.NoteBookApp.Service;
//
//import com.example.NoteBookApp.db.NoteRepository;
//import com.example.NoteBookApp.model.Note;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//import java.util.UUID;
//
//@Service
//public class NoteService {
//
//    NoteRepository noteRepository;
//
//    @Autowired
//    public NoteService(NoteRepository noteRepository) {
//        this.noteRepository = noteRepository;
//    }
//    public Optional<Note> findNoteById(UUID id) {
//        return noteRepository.findById(id);
//    }
//
//    public Note saveNote(Note note) {
//        return noteRepository.save(note);
//    }
//    public Optional<Note> updateNote(Note note, UUID id) {
//        Optional<Note> currentNote = noteRepository.findById(id);
//        if (currentNote.isPresent()) {
//            currentNote.get().setText(note.getText());
//            noteRepository.save(currentNote.get());
//        }
//        return currentNote;
//    }
//    public boolean deleteNote(UUID id) {
//        Optional<Note> currentNote = noteRepository.findById(id);
//        if (currentNote.isPresent()) {
//           noteRepository.deleteById(id);
//           return true;
//        }
//        return false;
//    }
//}
