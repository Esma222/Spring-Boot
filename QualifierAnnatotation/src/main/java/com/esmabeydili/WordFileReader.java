package com.esmabeydili;

import org.springframework.context.annotation.Primary;


public class WordFileReader implements Reader{
    @Override
    public String readFile() {
        return "Word File";
    }
}
