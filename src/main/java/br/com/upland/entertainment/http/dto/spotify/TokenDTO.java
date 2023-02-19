package br.com.upland.entertainment.http.dto.spotify;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TokenDTO {

    private String access_token;
    private String token_type;
    private Long expires_in;

}
