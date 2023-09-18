package com.emirates.intenseperformanceapp.service;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IntensePerformanceServiceImpl implements IntensePerformanceService{

    @Override public List<Long> getWholeNumberList(Long count) {
        List<Long> result = new ArrayList<>();
        log.info("Count number till : {}", count);
        for(long i = 1; i <= count; i++){
            result.add(i);
        }
        log.info("Numbers counted successfully");
        return result;
    }
}
