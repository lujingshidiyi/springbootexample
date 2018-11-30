package com.lujing.springbootexample.controller;

import com.lujing.springbootexample.dao.MealRepository;
import com.lujing.springbootexample.entity.Combo;
import com.lujing.springbootexample.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Author: luman
 * Date: 2018/11/30
 * Description: default description
 * Modify By: who am i
 */
@RestController
@RequestMapping(value = "/meal")
public class MealController {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private MealService mealService;

    /**
     * 获取combos列表
     *
     * @return
     */
    @GetMapping(value = "/combos")
    public List<Combo> comboList() {
        return mealRepository.findAll();
    }

    /**
     * 添加一个套餐
     *
     * @param type
     * @param count
     * @return
     */
    @PostMapping(value = "/combo")
    public Combo comboAdd(
            @RequestParam("type") String type,
            @RequestParam("count") Integer count
    ) {
        Combo combo = new Combo();
        combo.setType(type);
        combo.setCount(count);

        return mealRepository.save(combo);
    }

    /**
     * 查询一个套餐
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/combo/{id}")
    public Combo comboFindOne(
            @PathVariable("id") Long id
    ) {
        Optional optional = mealRepository.findById(id);
        return (Combo) optional.get();
    }

    /**
     * 更新
     *
     * @param id
     * @param type
     * @param count
     * @return
     */
    @PutMapping(value = "/combo/{id}")
    public Combo comboUpdate(
            @PathVariable("id") Long id,
            @RequestParam("type") String type,
            @RequestParam("count") Integer count
    ) {
        Combo combo = new Combo();
        combo.setId(id);
        combo.setType(type);
        combo.setCount(count);

        return mealRepository.save(combo);
    }

    /**
     * 删除
     *
     * @param id
     */
    @DeleteMapping(value = "/combo/{id}")
    public void comboDelete(
            @PathVariable("id") Long id
    ) {
        mealRepository.deleteById(id);
    }

    /**
     * 通过count数查询
     *
     * @param count
     * @return
     */
    @GetMapping(value = "/combo/count")
    public List<Combo> ComboByCount(
            @RequestParam(value = "count") Integer count
    ) {
        return mealRepository.findByCount(count);
    }

    /**
     * 添加两个套餐(事务管理)
     *
     * @return
     */
    @PostMapping(value = "/combo/two")
    public void comboAdd() {
        mealService.comboAddTwo();
    }

}
