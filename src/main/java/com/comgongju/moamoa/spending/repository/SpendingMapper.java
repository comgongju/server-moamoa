package com.comgongju.moamoa.spending.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SpendingMapper {

	String getName(int spendingIdx);

}
