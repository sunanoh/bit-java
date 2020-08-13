package com.javax.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {

		Song a = new Song();
		Song b = new Song();
		Song c = new Song();
		
		a.setArtist("아이유");
		a.setTitle("좋은날");
		a.setAlbum("Real");
		a.setYear(2010);
		a.setTrack(3);
		a.setComposer("이민수");
		
		a.showInfo();

	}

}
