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
public class ItemDTO implements Serializable {
    private String audio_preview_url;
    private String description;
    private int duration_ms;
    private boolean explicit;
    private ExternalUrlsDTO external_urls;
    private String href;
    private String html_description;
    private String id;
    private List<ImageDTO> images;
    private boolean is_externally_hosted;
    private boolean is_playable;
    private String language;
    private List<String> languages;
    private String name;
    private String release_date;
    private String release_date_precision;
    private String type;
    private String uri;

}
