package com.munna.ecommerce.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
public class UserServiceTest {

    @Autowired
    private TestBuilder testBuilder;
    @Autowired
    private User user;
    @Mock
    private  UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    // Arrange Act Assert

    @Test
    public void setUser_shouldStoreNewuserInRepository(){

        //Arrange
        ArrayList<User> userList= new ArrayList<>();

        user=testBuilder.tetsUserBuilder();
        user.setId(1L);
        userList.add(user);
        user.setId(2L);
        userList.add(user);

        when(userRepository.findAll()).thenReturn(userList);

        //Act
        userService.setUser(user);

        //Assert
        assertEquals(2,userService.getAllUsers().size());

    }
}
