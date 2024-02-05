package com.example.app.service;

import java.time.LocalDate;
import java.util.List;

import com.example.app.domain.WeightBmi;

public interface WeightService {

//登録
	//体重・BMIの登録
	void insertWeightBmi(WeightBmi userWeight) throws Exception;

//表示
	//体重表示
	List<WeightBmi> getSelectBeforeWeightbmi(int userId, LocalDate date) throws Exception;

}
