package br.com.upland.entertainment.http.dto.spotify.show;

import br.com.upland.entertainment.http.dto.spotify.ExternalUrlsDTO;
import br.com.upland.entertainment.http.dto.spotify.ImageDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ShowDTO implements Serializable {
    private List<String> available_markets;
    private List<Object> copyrights;
    private String description;
    private EpisodesDTO episodes;
    private boolean explicit;
    private ExternalUrlsDTO external_urls;
    private String href;
    private String html_description;
    private String id;
    private List<ImageDTO> images;
    private boolean is_externally_hosted;
    private List<String> languages;
    private String media_type;
    private String name;
    private String publisher;
    private int total_episodes;
    private String type;
    private String uri;

}
