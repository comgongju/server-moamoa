package com.comgongju.moamoa.spending.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comgongju.moamoa.spending.entity.SpendingVO;
import com.comgongju.moamoa.spending.service.SpendingService;

@RestController
@RequestMapping(value="/spending")
public class SpendingController {
	private SpendingService spendingService;
	
	public SpendingController(SpendingService spendingService) {
		this.spendingService = spendingService;
	}
	
    @GetMapping("/{spendingIdx}")
    public ResponseEntity<List<SpendingVO>> getTitle(@PathVariable(value = "spendingIdx") int spendingIdx){
        HashMap<String, Object> spendingMap = new HashMap<>();

        spendingMap.put("spendingName", spendingService.getName(spendingIdx));

        return new ResponseEntity(spendingMap, HttpStatus.OK);
      // return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
