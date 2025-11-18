package com.example.task07;

import java.util.Random;

public class Processor {

    public Object process() throws Exception {
        switch (new Random().nextInt(3)) {
            case 0:
                throw new Exception("Exception");
            case 1:
                throw new RuntimeException("RuntimeException");
            default:
                return null;
        }
    }

}
