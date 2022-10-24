package com.example.exam_intra.controller;

import com.example.exam_intra.model.OperationNumbers;
import com.example.exam_intra.service.OperationsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/operations")
public class OperationsController {

    OperationsService operationsService ;

    @PostMapping("/addition")
    public ResponseEntity<Integer> addition(@RequestBody OperationNumbers operationNumbers) {
        return ResponseEntity.ok(operationsService.addition(operationNumbers)) ;
    }

    @PostMapping("/substraction")
    public ResponseEntity<Integer> substraction(@RequestBody OperationNumbers operationNumbers) {
        return ResponseEntity.ok(operationsService.substraction(operationNumbers)) ;
    }
}
