package random.shterneregen.bootjwth2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = 4296125021242121887L;

    @Getter
    private final String jwtToken;
}
