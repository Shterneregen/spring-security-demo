package random.shterneregen.bootjwth2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor // need default constructor for JSON Parsing
@AllArgsConstructor
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 3704219775188752712L;

    private String username;
    private String password;
}
