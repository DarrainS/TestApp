/*
 * // package com.socialapp.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.authentication.BadCredentialsException; import
 * org.springframework.security.authentication.DisabledException; import
 * org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * com.socialapp.model.JwtRequest; import com.socialapp.model.JwtResponse;
 * import com.socialapp.model.User; import com.socialapp.config.JwtTokenUtil;
 * import com.socialapp.service.UserService;
 * 
 * public class UserController {
 * 
 * @Autowired private AuthenticationManager authenticationManager;
 * 
 * @Autowired private JwtTokenUtil jwtTokenUtil;
 * 
 * @Autowired private UserService userService;
 * 
 * @RequestMapping(value = "/auth", method = RequestMethod.POST) public
 * ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest
 * authenticationRequest) throws Exception {
 * 
 * authenticate(authenticationRequest.getUserName(),
 * authenticationRequest.getPassword());
 * 
 * final User user = userService
 * .loadUserByUsername(authenticationRequest.getUserName());
 * 
 * final String token = jwtTokenUtil.generateToken(user);
 * 
 * return ResponseEntity.ok(new JwtResponse(token)); }
 * 
 * 
 * @RequestMapping(value = "auth/register", method = RequestMethod.POST) public
 * ResponseEntity<?> saveUser(@RequestBody User user) throws Exception { return
 * ResponseEntity.ok(userService.save(user)); }
 * 
 * 
 * private void authenticate(String username, String password) throws Exception
 * { try { authenticationManager.authenticate(new
 * UsernamePasswordAuthenticationToken(username, password)); } catch
 * (DisabledException e) { throw new Exception("USER_DISABLED", e); } catch
 * (BadCredentialsException e) { throw new Exception("INVALID_CREDENTIALS", e);
 * } } }
 */