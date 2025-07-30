// File: src/main/java/com/example/demo/HelloController.java

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = "text/html")
    public String hello() {
        return "<html><body>" +
               "<img src='https://media.licdn.com/dms/image/v2/D4D12AQHFnWsqtTvJRA/article-cover_image-shrink_720_1280/article-cover_image-shrink_720_1280/0/1735213222529?e=1759363200&v=beta&t=YWt1-ieh3t9OalOgDkChBsQnUWUoWS1_nkanyFli6Ls' " +
               "style='max-width:100%; height:auto;' alt='Cover Image'>" +
               "<p><b>Hello, Sanket for Pune</b></p>" +
               "</body></html>";
    }
}
