//package com.practicejournal.registration.controller;
//
//import java.util.Date;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.practicejournal.registration.controllers.RegistrationServiceController;
//import com.practicejournal.registration.model.User;
//import com.practicejournal.registration.services.RegistrationService;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = RegistrationServiceController.class, secure = false)
//
//public class RegistrationServiceControllerTest {
    
//    @Autowired private MockMvc mockMvc;
//    
//    @MockBean private RegistrationService registrationService;
//    
//    
//    User mockUser = new User("832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4",
//                              "testuser@domain.com",
//                              "$2y$12$6RWieyxxCTnaSwRrVZp67.Lko96QFcefAweiEXtlriQ8lJxX5h/Qy",
//                              "6a8e4a82-7226-4eee-9e20-f65ff0f5457b",
//                              true);
//    
//    
//    @Test
//    public void retrieveUser() throws Exception {
//        
//        Mockito.when(registrationService.getUserById(Mockito.anyString())).thenReturn(mockUser);
//        
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
//                "/api/registration/v1/user/832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4").accept(
//                MediaType.APPLICATION_JSON);
//        
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        
//        System.out.println(result.getResponse());
//        String expected = "{userId:832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4, userName:mjones3@gmail.com,password:$2y$12$2idGkq.eQyEBbrmXF6nL3Of90S4mrtZwfMgv/gBJBjarFbLLTSLuG, roleId:6a8e4a82-7226-4eee-9e20-f65ff0f5457b, enabled:true, createdDate:2018-11-25}";
//        
//        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
//    }
    
 
    

//}
