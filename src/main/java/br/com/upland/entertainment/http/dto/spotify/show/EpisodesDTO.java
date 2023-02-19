package br.com.upland.entertainment.http.dto.spotify.show;

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
public class EpisodesDTO implements Serializable {
    private String href;
    private List<ItemDTO> items;
    private int limit;
    private String next;
    private int offset;
    private Object previous;
    private int total;
}
