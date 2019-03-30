package com.hn.registration.rest.api;

import com.hn.registration.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationApiController {




    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ApiOperation(value = "Hello", notes = "World")
    @ResponseBody
    public UserDTO  getHello(){
        UserDTO user = new UserDTO();
        user.setFirstName("Harish");
        user.setLastName("Naik");

         return user;
    }



}
