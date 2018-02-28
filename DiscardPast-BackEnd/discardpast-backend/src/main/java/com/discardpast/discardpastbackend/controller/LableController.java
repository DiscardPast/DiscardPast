package com.discardpast.discardpastbackend.controller;

import com.discardpast.discardpastbackend.Repository.LableRepository;
import com.discardpast.discardpastbackend.bean.view.Lable;
import com.discardpast.discardpastbackend.util.LableUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LableController {

    @Autowired
    private LableRepository lableRepository;

    @GetMapping(value = "/lable")
    private List<Lable> getLableList()
    {
        return lableRepository.findAll();
    }

    @PostMapping(value = "/lable")
    private List<Lable> addLableList()
    {
        return lableRepository.save(LableUtil.getLableList());
    }
}
