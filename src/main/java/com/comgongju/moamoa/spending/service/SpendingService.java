package com.comgongju.moamoa.spending.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.comgongju.moamoa.spending.entity.SpendingVO;
import com.comgongju.moamoa.spending.repository.SpendingMapper;

@Service
public class SpendingService {
	private final SpendingMapper spendingMapper;
	
	public SpendingService(SpendingMapper mapper) {
		this.spendingMapper = mapper;
	}
	
	public String getName(int spendingIdx) {
		String spendingTitle = spendingMapper.getName(spendingIdx);
		
		return spendingTitle;
	}

}
