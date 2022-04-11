package com.relativesoft.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relativesoft.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
