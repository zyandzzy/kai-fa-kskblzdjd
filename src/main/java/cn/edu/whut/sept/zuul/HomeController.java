package cn.edu.whut.sept.zuul;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 简单的 REST 控制器，用于验证 Spring Boot 应用正常启动。
 * <p>
 * 访问 {@code http://localhost:8080/} 返回欢迎信息，
 * 访问 {@code http://localhost:8080/health} 返回健康状态。
 * </p>
 *
 * @author sept
 * @since 1.0
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "forward:/index.html";
    }

    @GetMapping("/game")
    public String gamePage() {
        return "forward:/game.html";
    }

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "OK";
    }
}
