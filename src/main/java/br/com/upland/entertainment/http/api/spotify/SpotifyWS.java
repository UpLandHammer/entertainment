package br.com.upland.entertainment.http.api.spotify;

import br.com.upland.entertainment.http.client.SpotifyClientWS;
import br.com.upland.entertainment.http.dto.spotify.album.AlbumDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/spotify")
public class SpotifyWS {

    private final SpotifyClientWS spotifyClientWS;

    @GetMapping("/{id}")
    public ResponseEntity<List<AlbumDTO>> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(spotifyClientWS.getAlbums(id));
    }
}
