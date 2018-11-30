package com.lujing.springbootexample.dao;

import com.lujing.springbootexample.entity.Combo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Author: luman
 * Date: 2018/11/30
 * Description: default description
 * Modify By: who am i
 */
public interface MealRepository extends JpaRepository<Combo, Long> {

    /**
     * 通过菜品数来查询
     *
     * @param count
     * @return
     */
    List<Combo> findByCount(Integer count);

}
