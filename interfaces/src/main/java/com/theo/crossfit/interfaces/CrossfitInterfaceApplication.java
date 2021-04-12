package com.theo.crossfit.interfaces;

import com.theo.crossfit.core.CoreContextConfiguration;
import com.theo.crossfit.interfaces.application.Application;
import com.theo.crossfit.interfaces.configuration.InterfaceContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {InterfaceContextConfiguration.class, Application.class,
        CoreContextConfiguration.class})
public class CrossfitInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrossfitInterfaceApplication.class, args);
    }
}