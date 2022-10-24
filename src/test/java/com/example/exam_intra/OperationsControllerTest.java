package com.example.exam_intra;

import com.example.exam_intra.model.OperationNumbers;
import com.example.exam_intra.service.OperationsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class OperationsControllerTest {

    @Autowired
    private MockMvc mockMvc ;

    @MockBean
    OperationsService operationsService ;


    @Test
    void additionHappyDay() throws Exception {
        //Arrange
        OperationNumbers operationNumbers = new OperationNumbers(2, 3) ;
        when(operationsService.addition(operationNumbers)).thenReturn(5) ;

        //Act & Assert
        MvcResult mvcResult = mockMvc.perform(post("/operations/addition").content(asJsonString(operationNumbers)).
                contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn() ;

        String actual = mvcResult.getResponse().getContentAsString() ;

        assertThat(actual).isNotBlank().isEqualTo("5") ;
    }

    @Test
    void additionNoBody() throws Exception {
        //Act & Assert
        mockMvc.perform(post("/operations/addition").content("").
                contentType(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest()) ;
    }

    @Test
    void substractionHappyDay() throws Exception {
        //Arrange
        OperationNumbers operationNumbers = new OperationNumbers(5, 2) ;
        when(operationsService.addition(operationNumbers)).thenReturn(3) ;

        //Act & Assert
        MvcResult mvcResult = mockMvc.perform(post("/operations/addition").content(asJsonString(operationNumbers)).
                contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn() ;

        String actual = mvcResult.getResponse().getContentAsString() ;

        assertThat(actual).isNotBlank().isEqualTo("3") ;
    }

    @Test
    void substractionNoBody() throws Exception {
        //Act & Assert
        mockMvc.perform(post("/operations/substraction").content("").
                contentType(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest()) ;
    }


    static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
