package com.example.exam_intra.service;

import com.example.exam_intra.model.OperationNumbers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperationsServiceImpl implements OperationsService{
    @Override
    public Integer addition(OperationNumbers operationNumbers) {
        return operationNumbers.getFirstNumber() + operationNumbers.getSecondNumber() ;
    }

    @Override
    public Integer substraction(OperationNumbers operationNumbers) {
        return operationNumbers.getFirstNumber() - operationNumbers.getSecondNumber() ;
    }
}
