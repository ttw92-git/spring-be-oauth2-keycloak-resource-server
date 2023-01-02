package ttw.springbe.oauth2_resource_server;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

import java.util.Collection;

@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//    //            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//    //            .cors().and()
//    //            .csrf().disable()
//                .authorizeRequests()
//    //            .antMatchers("/api/**").hasAnyAuthority("ROLE_ANONYMOUS")
//                .antMatchers("/api/**").hasRole("EMPLOYEE")
//                .anyRequest().authenticated()
//                .and()
//                .oauth2ResourceServer()
//                .jwt()
//                .jwtAuthenticationConverter(keycloakJwtAuthenticationConverter);

        http.authorizeRequests(
                authz -> authz.antMatchers(HttpMethod.GET, "/api/**")
                        .authenticated());

//        http.exceptionHandling().authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
        return http.build();
    }

//    @Bean
//    KeycloakJwtAuthenticationConverter keycloakJwtAuthenticationConverter(Converter<Jwt, Collection<GrantedAuthority>> authoritiesConverter) {
//        return new KeycloakJwtAuthenticationConverter(authoritiesConverter);
//    }
}
