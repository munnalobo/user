package com.munna.ecommerce.user;

import com.munna.ecommerce.user.modelsAndEntities.User;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBuilder {

//    @Autowired User user;
//    @Bean
    public static User tetsUserBuilder(){
        User user=new User.UserBuilder()
                .id(1L)
                .userName("munnaTest")
                .password("testPassword")
                .firstName("munna")
                .lastName("Gunturu")
                .dateOfBirth("06/06/1999")
                .eMail("m@yahoo.com")
                .gender("Male")
                .build();
        return user;
    }
}
