package sarebApp.com.sareb.dto.responses;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {

    private Long id;
    private String name;
    private String email;
    private String jwt;

}
