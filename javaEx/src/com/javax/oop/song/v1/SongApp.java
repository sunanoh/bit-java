package com.javax.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {

		Song a = new Song();
		Song b = new Song();
		Song c = new Song();
		
		a.setArtist("������");
		a.setTitle("������");
		a.setAlbum("Real");
		a.setYear(2010);
		a.setTrack(3);
		a.setComposer("�̹μ�");
		
		a.showInfo();

	}

}
