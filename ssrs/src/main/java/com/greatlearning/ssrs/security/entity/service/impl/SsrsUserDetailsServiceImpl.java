package com.greatlearning.ssrs.security.entity.service.impl;

import com.greatlearning.ssrs.security.entity.SsrsUserDetails;
import com.greatlearning.ssrs.security.entity.User;
import com.greatlearning.ssrs.security.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class SsrsUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.getUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new SsrsUserDetails(user);
    }
}
