package com.discardpast.discardpastbackend.controller;

import com.discardpast.discardpastbackend.Repository.TypeRepository;
import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.util.TypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TypeController {

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping(value = "/type")
    private List<Type> getType()
    {
        return typeRepository.findAll();
    }

    @PostMapping(value = "/type")
    private List<Type> typeAdd()
    {
        return typeRepository.save(TypeUtil.getAllTypeList());
    }
}
