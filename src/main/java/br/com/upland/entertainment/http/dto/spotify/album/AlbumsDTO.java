package br.com.upland.entertainment.http.dto.spotify.album;

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
public class AlbumsDTO implements Serializable {

    private List<AlbumDTO> albums;
}
