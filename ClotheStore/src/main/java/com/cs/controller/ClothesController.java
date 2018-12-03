package com.cs.controller;


import com.cs.service.ClothesInformationService;
import com.cs.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClothesController {
    @Autowired
    private ClothesInformationService clothesInformationService;

    @Autowired
    private ClothesService clothesService;

    @GetMapping(value = "/clothes",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(clothesInformationService.selectAll());
    }

    @GetMapping(value = "/ClotheSelectAll/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResponseEntity ClotheSelectAll(@PathVariable("id") int id){
        return ResponseEntity.ok(clothesService.selectAllPrimaryKey(id));
    }
}
