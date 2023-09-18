package com.emirates.intenseperformanceapp.controller;

import com.emirates.intenseperformanceapp.service.IntensePerformanceService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/intense")
@RequiredArgsConstructor
public class IntensePerformanceController {
    private final IntensePerformanceService intensePerformanceService;

    @GetMapping("/count/{id}")
    public List<Long> getCount(@PathVariable long id) {
        System.out.println("Id " + id);
        return intensePerformanceService.getWholeNumberList(id);
    }
}
