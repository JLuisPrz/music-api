package com.relativesoft.api.service;

import java.util.List;

import com.relativesoft.api.entity.Album;

public interface IAlbumService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);

}
