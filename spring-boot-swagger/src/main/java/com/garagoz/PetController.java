package com.garagoz;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/pet")
@Api(value = "My API Documentaion")
public class PetController {

    List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init() {
        petList.add(new Pet(1, "Garagoz", new Date()));
    }

    @PostMapping
    @ApiOperation(value = "New Pet object add method", notes = "Be carefull while using this method")
    public ResponseEntity<Pet> add(@RequestBody @ApiParam(value = "animal") Pet pet) {
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = "gets All Pet objects", notes = "this method lists all objects you have")
    public ResponseEntity<List<Pet>> getAll() {
        return ResponseEntity.ok(petList);
    }
}
