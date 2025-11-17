package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {

    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<Track> tracks;

    private static int nextId() {
        return ++nbCompactDiscs;
    }

    public CompactDisc(String title, String category, double cost, List<Track> tracks) {
        this.id = nextId();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.tracks = new ArrayList<>(tracks);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public List<Track> getTracks() {
        return new ArrayList<>(tracks);
    }

    @Override
    public String toString() {
        return "CompactDisc[" + this.id + "]["
                + this.title + "]["
                + this.cost + "]["
                + this.category + "]"
                + "\nTracks: " + this.tracks;
    }

    public int totalLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }
}
