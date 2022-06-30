package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.get(id);
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        list.get(s.getId()).setNome(s.getNome());
    }

    public void removeSong(Song s) {
        list.remove(s);
    }
}