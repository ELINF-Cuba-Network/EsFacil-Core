package cu.vlired.esFacilCore.payload;

import cu.vlired.esFacilCore.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Setter @Getter
@ToString
public class UserStatusResponse {

    private UUID id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private boolean isActive;
    private List<String> roles;

    public static UserStatusResponse create(User user ){

        UserStatusResponse usr = new UserStatusResponse();
        usr.setId( user.getId() );
        usr.setUsername( user.getUsername() );
        usr.setFirstname( user.getFirstname() );
        usr.setLastname( user.getLastname() );
        usr.setEmail( user.getEmail() );
        usr.setActive( user.isActive() );
        usr.setRoles( user.getRoles() );

        return usr;
    }
}
