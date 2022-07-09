/*
 * package com.socialapp.service;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * com.socialapp.model.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * 
 * import com.socialapp.repository.UserRepository;
 * 
 * public class UserService {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Autowired private PasswordEncoder bcryptEncoder;
 * 
 * //@Override public User loadUserByUsername(String email) throws
 * UsernameNotFoundException { User user = userRepository.findByEmail(email); if
 * (user == null) { throw new
 * UsernameNotFoundException("User not found with email: " + email); } return
 * new User(user.getEmail(), user.getPassword()); }
 * 
 * public User save(User user) { User newUser = new User();
 * newUser.setUserName(user.getUserName());
 * newUser.setPassword(bcryptEncoder.encode(user.getPassword())); return
 * userRepository.save(newUser); } }
 */