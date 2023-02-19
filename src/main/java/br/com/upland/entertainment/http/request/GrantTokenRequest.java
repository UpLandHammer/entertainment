package br.com.upland.entertainment.http.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GrantTokenRequest implements Serializable {
    private String grantType;
    private String credentialDescription;

}
