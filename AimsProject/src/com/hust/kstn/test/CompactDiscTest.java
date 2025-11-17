package com.hust.kstn.test;

import com.hust.kstn.models.Track;
import com.hust.kstn.models.CompactDisc;

import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {

    public static void main(String[] args) {
        Track track1 = new Track("Thriller", 417);
        Track track2 = new Track("Billie Jean", 294);
        Track track3 = new Track("Beat It", 258);
        List<Track> tracks = new ArrayList<>();
        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        CompactDisc cd = new CompactDisc("Thriller", "Pop", 15.50, tracks);
        System.out.println(cd.toString());
        cd.removeTrack(track2);
        System.out.println(cd.toString());
    }
}
