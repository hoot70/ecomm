package ecomm.example.ecomm.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
public class User implements UserDetails{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @NotEmpty(message = "Username can be empty")
    private String username;

    @NotEmpty(message = "password can't be empty")
    private String password;

    @Transient
    private boolean accountNonExpired = true;
    @Transient
    private boolean accountNonLocked = true;
    @Transient
    private boolean credentialsNonExpired = true;
    @Transient
    private boolean enabled = true;
    @Transient
    private Collection<GrantedAuthority> authorities = null;

    @ElementCollection
    Map<Product, Integer> cart = new HashMap<>();
}
