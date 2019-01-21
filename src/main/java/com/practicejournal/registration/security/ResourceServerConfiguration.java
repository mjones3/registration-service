//package com.practicejournal.registration.security;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
//
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception{
//        
//        http.headers().httpStrictTransportSecurity().disable();
//        
//        http
//        .authorizeRequests()
//          .antMatchers(HttpMethod.DELETE, "/v1/registration/**")
//          .hasRole("ADMIN")
//          .anyRequest()
//          .authenticated();
//    }
//    
//    
//    // Authentication : User --> Roles
//    protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.inMemoryAuthentication().withUser("user1").password("secret1")
//                .roles("USER").and().withUser("admin1").password("secret1")
//                .roles("USER", "ADMIN");
//    }

//    // Authorization : Role -> Access
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic().and().authorizeRequests().antMatchers("/students/**")
//                .hasRole("USER").antMatchers("/users/**").hasRole("USER")
//                .antMatchers("/**").hasRole("ADMIN").and().csrf().disable()
//                .headers().frameOptions().disable();
//    }
    
    
//}
