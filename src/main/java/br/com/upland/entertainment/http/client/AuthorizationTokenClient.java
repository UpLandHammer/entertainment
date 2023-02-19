package br.com.upland.entertainment.http.client;

import br.com.upland.entertainment.http.config.CredentialsSpotifyProperties;
import br.com.upland.entertainment.http.config.SpotifyProperties;
import br.com.upland.entertainment.http.dto.spotify.TokenDTO;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class AuthorizationTokenClient {

    private static final String PATH = "/api/token";
    private final RestTemplate restTemplate;

    private final SpotifyProperties spotifyProperties;
    private final CredentialsSpotifyProperties credentialsSpotifyProperties;

    public String getToken() {
        try {
            String url = spotifyProperties.getUrl() + PATH;
            String uriString = UriComponentsBuilder
                    .fromUri(new URI(url))
                    .queryParam("grant_type", "client_credentials")
                    .build()
                    .encode()
                    .toUriString();

            ResponseEntity<TokenDTO> response = restTemplate.exchange(uriString, HttpMethod.POST, getEntity(getHttpHeaders(getEncodedAuth())), TokenDTO.class);
            return response.getBody().getAccess_token();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private static HttpEntity<String> getEntity(HttpHeaders httpHeaders) {
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        return httpEntity;
    }

    private String getEncodedAuth() {

        String password = credentialsSpotifyProperties.getPassword();
        String user = credentialsSpotifyProperties.getUser();

        String auth = user + ":" + password;
        byte[] bytes = Base64.encodeBase64(auth.getBytes(), false);
        String authEncoded = new String(bytes);
        return authEncoded;
    }

    private static HttpHeaders getHttpHeaders(String authEncoded) {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add("Authorization", "Basic " + authEncoded);
        httpHeaders.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        return httpHeaders;
    }
}
