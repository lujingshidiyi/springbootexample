package com.lujing.springbootexample.service;

import com.lujing.springbootexample.dao.MealRepository;
import com.lujing.springbootexample.entity.Combo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author: luman
 * Date: 2018/11/30
 * Description: default description
 * Modify By: who am i
 */
@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    @Transactional(rollbackFor = Exception.class)
    public void comboAddTwo() {
        Combo combo = new Combo();
        combo.setType("O");
        combo.setCount(1);
        mealRepository.save(combo);

        Combo combo1 = new Combo();
        combo1.setType("P");
        combo1.setCount(1);
        mealRepository.save(combo1);
    }

}
