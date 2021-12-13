package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album( 0, "Disco Tex", "Disco", "Example");
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album: albumList){
            if(album.getAlbumId() == albumId){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album u:albumList){
            if(u.getAlbumId() == albumId){
                u.setName(album.getName());
                u.setDescription(album.getDescription());
                u.setCoverPicUrl(album.getCoverPicUrl());

                return u;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;

        for(Album u:albumList){
            if(u.getAlbumId() == albumId){
                deletedAlbum = u;
                albumList.remove(u);
                return deletedAlbum;
            }

        }
        return deletedAlbum;
    }
}
