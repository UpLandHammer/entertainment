package br.com.upland.entertainment.http.client;

import br.com.upland.entertainment.http.dto.spotify.album.AlbumDTO;
import br.com.upland.entertainment.http.dto.spotify.album.AlbumsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SpotifyClientWS {

    private final RestTemplate restTemplate;
    private final AuthorizationTokenClient authorizationTokenClient;
    private static final String URL = "https://api.spotify.com/v1";

    public List<AlbumDTO> getAlbums(String id) {

        try {
            URI uri = new URI(URL + "/albums?ids=" + id);
            String token = authorizationTokenClient.getToken();
            AlbumsDTO albums =  restTemplate.exchange(uri, HttpMethod.GET, buildHttpEntity(token), new ParameterizedTypeReference<AlbumsDTO>(){{}}).getBody();
            return albums.getAlbums();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }



    public HttpEntity buildHttpEntity(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization" , "Bearer " + token);
        return new HttpEntity<>(headers);
    }

}
