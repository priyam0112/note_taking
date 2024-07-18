package com.notetaking.simple_note_taking_api.service;

import com.notetaking.simple_note_taking_api.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteService {
    private final List<Note> notes = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes);
    }

    public Optional<Note> getNoteById(Long id) {
        return notes.stream().filter(note -> note.getId().equals(id)).findFirst();
    }

    public Note createNote(Note note) {
        note.setId(counter.incrementAndGet());
        notes.add(note);
        return note;
    }

    public Optional<Note> updateNote(Long id, Note noteDetails) {
        return getNoteById(id).map(note -> {
            note.setTitle(noteDetails.getTitle());
            note.setContent(noteDetails.getContent());
            return note;
        });
    }

    public boolean deleteNoteById(Long id) {
        return notes.removeIf(note -> note.getId().equals(id));
    }
}
