package ro.unibuc.hello.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserDto {
    private String username;
    private String bio;
    private String profilePicture;
    private Date dateOfBirth;
}
