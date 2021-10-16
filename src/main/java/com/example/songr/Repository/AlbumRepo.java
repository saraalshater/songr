package com.example.songr.Repository;

import com.example.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepo extends JpaRepository<Album, Long> {
}
