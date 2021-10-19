package com.example.songr;
//
//import com.example.songr.model.Album;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SongrApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//
//	@Test
//	void testing(){
//		Album album = new Album("king of the road","alshater",12,43,"https://f4.bcbits.com/img/a1117732318_16.jpg");
//		album.setTitle("king of the road");
//		Assertions.assertEquals("king of the road", album.getTitle());
//		album.setArtist("alshater");
//		Assertions.assertEquals("alshater", album.getArtist());
//		album.setSongCount(12);
//		Assertions.assertEquals(12, album.getSongCount());
//		album.getLength(43);
//		Assertions.assertEquals(43, album.getLength(43));
//		album.setImgUrl("https://f4.bcbits.com/img/a1117732318_16.jpg");
//		Assertions.assertEquals("https://f4.bcbits.com/img/a1117732318_16.jpg", album.getImgUrl());
//
//	}
//
//
//
//}



import com.example.songr.model.Album;
import com.example.songr.model.Song;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SongrApplicationTests {
    Album testAlbum;
    @Test
    public void constructorAlbum(){


        Album testAlbum = new Album("hello" , "unknown",10,2500,"https://img.freepik.com/free-vector/electro-music-album_53876-67223.jpg?size=338&ext=jpg");
        assertTrue(true);


        testAlbum.setTitle("hello");
        assertEquals("hello" , testAlbum.getTitle());


        testAlbum.setArtist("sara");
        assertEquals("sara" , testAlbum.getArtist());


        testAlbum.setSongCount(15);
        assertEquals(15, testAlbum.getSongCount());



        testAlbum.setLength(10000);
        assertEquals(10000, testAlbum.getLength());

//		testAlbum.setImageUrl("unknown");
//		assertEquals("unknown", testAlbum.getImageUrl());
    }

    @Test public void songConstructor(){

        Song testSong = new Song("hello" ,  200 , 1 ,testAlbum );

        /* Test Constructor */
        assertTrue(testSong instanceof Song);


        testSong.setTitle("newSong");
        assertEquals("newSong", testSong.getTitle());

        testSong.setLength(150);
        assertEquals( 150 , testSong.getLength());


        testSong.setTrackNumber(2);
        assertEquals(2, testSong.getTrackNumber());

    }


}
