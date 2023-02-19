package br.com.upland.entertainment.http.dto.spotify.album;

import br.com.upland.entertainment.http.dto.spotify.show.ItemDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TracksDTO {
    private String href;
    private List<ItemDTO> items;
    private int limit;
    private Object next;
    private int offset;
    private Object previous;
    private int total;

}
