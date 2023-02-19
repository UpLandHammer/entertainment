package br.com.upland.entertainment.http.dto.spotify.album;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExternalIdsDTO implements Serializable {

    private String upc;
}
