package com.xavier.web.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xavier.web.domain.Playlist;

@Repository
public interface PlaylistRepositoy extends JpaRepository<Playlist, Integer>{

}
