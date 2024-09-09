package com.holamundo.adres.holamundo;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("timer:myTimer?period=1s")
            .log("¡Hola Mundo!");

        from("timer:holaAdres?period=3s")
            .log("¡Hola Adres, este container funciona!");

    }

}
