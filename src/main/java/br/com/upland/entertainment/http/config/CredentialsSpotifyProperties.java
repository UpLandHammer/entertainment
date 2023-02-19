package br.com.upland.entertainment.http.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "app.spotify")
@PropertySource(value = "classpath:credentials.yml", factory = YamlPropertySourceFactory.class)
public class CredentialsSpotifyProperties {

    private String user;
    private String password;
}
