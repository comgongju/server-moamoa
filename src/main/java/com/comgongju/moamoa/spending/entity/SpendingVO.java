package com.comgongju.moamoa.spending.entity;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class SpendingVO {
	@NotNull(message = "spendingIdx cannot be null.")
	private int spendingIdx;
	@NotNull(message = "userIdx cannot be null.")
	private int userIdx;
	@NotNull(message = "categoryIdx cannot be null.")
	private int categoryIdx;
	@NotNull(message = "spendingName cannot be null.")
	private String spendingName;
	@NotNull(message = "paymentOption cannot be null.")
	private int paymentOption;
	@NotNull(message = "spendingDate cannot be null.")
	private String spendingDate;
	@NotNull(message = "budgetYN cannot be null.")
	private int budgetYN;
	@NotNull(message = "installmentYN cannot be null.")
	private int installmentYN;
	private int installment;
	
	
}
