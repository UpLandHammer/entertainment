package br.com.upland.entertainment.http.dto.spotify.album;

import br.com.upland.entertainment.http.dto.spotify.ExternalUrlsDTO;
import br.com.upland.entertainment.http.dto.spotify.ImageDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlbumDTO implements Serializable {

    private String album_type;

    private List<ArtistDTO> artists;
    private List<String> available_markets;
    private List<CopyrightDTO> copyrights;
    private ExternalIdsDTO external_ids;
    private ExternalUrlsDTO external_urls;
    private List<Object> genres;
    private String href;
    private String id;
    private List<ImageDTO> images;
    private String label;
    private String name;
    private int popularity;
    private String release_date;
    private String release_date_precision;
    private int total_tracks;
    private TracksDTO tracks;
    private String type;
    private String uri;
}
