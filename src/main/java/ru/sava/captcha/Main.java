package ru.sava.captcha;

import org.opencv.core.Core;

import java.io.IOException;

public class Main {

    static {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

    }

    public static void main(String[] args) throws IOException {


        System.out.println(Core.getVersionString());


    }

}
