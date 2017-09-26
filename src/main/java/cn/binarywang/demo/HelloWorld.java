package cn.binarywang.demo;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.start(7000);
        app.get("/", ctx -> {
            System.out.println(ctx.attributeMap());
            ctx.result("Hello World");
        });
    }
}
