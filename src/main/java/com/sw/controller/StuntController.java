package com.sw.controller;

import com.sw.dao.StuntDao;
import com.sw.eneity.Stunt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
public class StuntController {
    @Resource
    StuntDao stuntDao;



    @RequestMapping("query")
    @ResponseBody
    public List<Stunt> show(@RequestBody Stunt stunt){
        return stuntDao.select(stunt);
    }



    @RequestMapping("updpwd")
    @ResponseBody
    public void updpwd(@RequestBody Stunt stunt){
        System.out.println(stunt);
        stuntDao.updateByPrimaryKey(stunt);
    }




}
