package com.theo.crossfit.interfaces;

import com.theo.crossfit.core.CoreContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackageClasses = {CoreContextConfiguration.class})
public class CrossfitInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrossfitInterfaceApplication.class, args);
    }


}