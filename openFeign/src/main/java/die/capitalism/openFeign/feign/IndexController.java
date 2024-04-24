package die.capitalism.openFeign.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("openFeign")
public class IndexController {
	@Resource
    private SpringcloudFeign providerClient;
	
	@GetMapping("/helloworld")
	public String doSpringCloud() {
		return providerClient.list();
	}
}
