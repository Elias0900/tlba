package org.tlba.JWT;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.tlba.entities.LoginRequest;

@Data
public class JwtResponse {

    private String jwtToken;

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;

    }

    // getter et setter
}
