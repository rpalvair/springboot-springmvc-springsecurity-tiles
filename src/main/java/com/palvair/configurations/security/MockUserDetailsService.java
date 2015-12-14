package com.palvair.configurations.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ruddy on 18/06/15.
 */

public class MockUserDetailsService implements UserDetailsService {
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        @SuppressWarnings("unchecked")
        final Collection<GrantedAuthority> authorities = new ArrayList() {{
            add(new SimpleGrantedAuthority("ROLE_BOSS"));
        }};
        final UserDetails user = new User("widdy", "123456", true, true, true, true, authorities);
        return user;
    }
}
