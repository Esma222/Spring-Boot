package com.esmabeydili;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {


    /*
    IoC Container içinde bulunan ve @Qualifier("") anatasyonu ile  inject edilebilir nesneler
    WORD
    PDF
    EXCEL
     */
    @Autowired
    private Reader reader;
    @Autowired
    private Reader reader2;

    @GetMapping("/read")
    public String read(){
        return this.reader.readFile()+" * "+ this.reader2.readFile();
    }
}
