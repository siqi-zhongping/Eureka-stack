package die.capitalism.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("springCloud")
public class IndexController {
	@GetMapping("/helloworld")
	public String doSpringCloud() {
		System.out.println("======================================");
		System.out.println("我去你大爷");
		System.out.println("======================================");
		return "Hello World";
	}
}
