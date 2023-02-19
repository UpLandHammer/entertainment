package br.com.upland.entertainment.http.dto.spotify;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO implements Serializable {

    private int height;
    private String url;
    private int width;
}
