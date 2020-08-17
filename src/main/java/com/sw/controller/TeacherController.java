package com.sw.controller;

import com.sw.dao.TeacherDao;
import com.sw.eneity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
public class TeacherController {
    @Resource
    TeacherDao teacherDao;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Teacher> show(){
        System.out.println(teacherDao.selectAll());
        return teacherDao.selectAll();
    }


    @RequestMapping("add")
    @ResponseBody
    public void add(@RequestBody Teacher teacher){
        System.out.println(teacher);
        teacherDao.insert(teacher);
    }

    @RequestMapping("gai")
    @ResponseBody
    public int upd(@RequestBody Teacher tea){
        System.out.println(tea);
        return teacherDao.updateByPrimaryKey(tea);
    }

    @RequestMapping("shan")
    public List<Teacher> shan(String tid){
        System.out.println(tid);
        teacherDao.deleteByPrimaryKey(tid);
        return show();
    }

    

}
