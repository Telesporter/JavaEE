package zebra.example.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/21
 * Time: 14:13
 * Description: No Description
 */
//在SpringBoot中使用，会扫描启动类所在包下所有@Controller类
@ControllerAdvice
public class ExceptionAdvice {
    //如果客户端请求，执行控制器方法抛Exception异常，会执行本方法
    @ExceptionHandler(Exception.class)
    //方法返回值作为响应体
    @ResponseBody
    public Object handle(Exception e){//方法参数即为捕获到的异常
        //构造响应数据
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("code", "ERR000");
        map.put("message", e.getMessage());
        return map;
    }
}
