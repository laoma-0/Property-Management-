//package com.propertymanagement.controller;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class SwaggerRedirectController {
//
//    // 重定向根路径到 Swagger UI
//    @GetMapping("/")
//    public String redirectRootToSwagger() {
//        return "redirect:/swagger-ui/index.html";
//    }
//
//    // 重定向旧路径到新路径
//    @GetMapping("/swagger-ui.html")
//    public String redirectLegacyPath() {
//        return "redirect:/swagger-ui/index.html";
//    }
//
//    // 处理 Chrome 开发者工具请求
//    @GetMapping("/.well-known/appspecific/com.chrome.devtools.json")
//    public String handleChromeDevTools() {
//        return "forward:/index.html"; // 或返回空响应
//    }
//}