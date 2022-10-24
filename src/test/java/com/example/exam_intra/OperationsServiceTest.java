package com.example.exam_intra;

import com.example.exam_intra.model.OperationNumbers;
import com.example.exam_intra.service.OperationsServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class OperationsServiceTest {

    @InjectMocks
    private OperationsServiceImpl operationsService ;

    @Test
    void additionHappyDay() {
        //Arrange
        OperationNumbers operationNumbers = mock(OperationNumbers.class) ;
        when(operationNumbers.getFirstNumber()).thenReturn(1) ;
        when(operationNumbers.getSecondNumber()).thenReturn(2) ;

        //Act
        int result = operationsService.addition(operationNumbers) ;

        //Assert
        assertEquals(3, result);
    }

    @Test
    void additionZeroZero() {
        //Arrange
        OperationNumbers operationNumbers = mock(OperationNumbers.class) ;
        when(operationNumbers.getFirstNumber()).thenReturn(0) ;
        when(operationNumbers.getSecondNumber()).thenReturn(0) ;

        //Act
        int result = operationsService.addition(operationNumbers) ;

        //Assert
        assertEquals(0, result);
    }

    @Test
    void substractionHappyDay() {
        //Arrange
        OperationNumbers operationNumbers = mock(OperationNumbers.class) ;
        when(operationNumbers.getFirstNumber()).thenReturn(3) ;
        when(operationNumbers.getSecondNumber()).thenReturn(1) ;

        //Act

        int result = operationsService.substraction(operationNumbers) ;

        //Assert
        assertEquals(2, result);
    }

    @Test
    void substractionZeroZero() {
        //Arrange
        OperationNumbers operationNumbers = mock(OperationNumbers.class) ;
        when(operationNumbers.getFirstNumber()).thenReturn(0) ;
        when(operationNumbers.getSecondNumber()).thenReturn(0) ;

        //Act
        int result = operationsService.substraction(operationNumbers) ;

        //Assert
        assertEquals(0, result);
    }
}
