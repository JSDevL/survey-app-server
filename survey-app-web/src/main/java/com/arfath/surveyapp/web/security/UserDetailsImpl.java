package com.arfath.surveyapp.web.security;

import com.arfath.surveyapp.data.domain.Role;
import com.arfath.surveyapp.data.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


public class UserDetailsImpl extends User implements UserDetails {

    public UserDetailsImpl(User user) {
        super(user.getUserName(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getRoles());
    }

    public UserDetailsImpl(String userName, String firstName, String lastName, String email, String password, ArrayList<Role> roles) {
        super(userName, firstName, lastName, email, password, roles);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return super.getRoles()
                .stream()
                .map((Role role) -> new SimpleGrantedAuthority("ROLE_" + role.name())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
