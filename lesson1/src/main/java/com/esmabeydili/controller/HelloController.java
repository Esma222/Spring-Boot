package com.esmabeydili.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class HelloController {

    //localhost:8080/api/hello

    // GET : Veri görüntülemek için @GetMapping
    // POST : Veri kaydetmek için   @PostMapping
    // DELETE : Veri silmek için    @DeleteMapping
    // PATCH : Verinin bir kısmını Güncellemek için @PatchMapping
    // PUT : veri güncellemek için  @PutMapping

    //@GetMapping(path="/hello")
    @RequestMapping(path="/hello",method= RequestMethod.GET)
    public String sayHello(){
        return "Hello Worldd!";
    }

    @PostMapping("/save")
    public String save(){
        return "Data savedd!";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deletedd!";
    }
}
