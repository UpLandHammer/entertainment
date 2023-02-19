package br.com.upland.entertainment.http.dto.spotify.album;

import br.com.upland.entertainment.http.dto.spotify.ExternalUrlsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDTO implements Serializable {

    private ExternalUrlsDTO external_urls;
    private String href;
    private String id;
    private String name;
    private String type;
    private String uri;

}
