package com.lujing.springbootexample.controller;

import com.lujing.springbootexample.config.MealProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Author: luman
 * Date: 2018/11/30
 * Description: default description
 * Modify By: who am i
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${type}")
    private String type;

    @Value("${count}")
    private Integer count;

    @Value("${content}")
    private String content;

    @Autowired
    private MealProperties mealProperties;

    //如果不加method的话,get和post请求都可请求,但安全起见不建议去掉
    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public String say(
            @PathVariable(value = "id") Long id,
            @RequestParam(value = "name", defaultValue = "lulu", required = false) String name
    ) {
        return "Hello!" + id + name + type + count + ",Hi!" + content;
    }

    @RequestMapping(value = "/meal", method = RequestMethod.GET)
    public String meal() {
        return "Your Meal is type" + mealProperties.getType() + " and have " + mealProperties.getCount() + " dishes.";
    }

    @GetMapping(value = "/{id}/mealcopy")
//    @PostMapping
//    @PutMapping
    public String mealCopy(
            @PathVariable("id") Long id,
            @RequestParam(value = "name", defaultValue = "lulu", required = false) String name
    ) {
        return "Hello!" + id + name + type + count + ",Hi!" + content;
    }
}
