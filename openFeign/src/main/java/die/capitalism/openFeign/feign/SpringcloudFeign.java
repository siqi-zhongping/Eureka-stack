package die.capitalism.openFeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("my-eureka-client-gateway")
public interface SpringcloudFeign {
	@GetMapping("/springCloud/helloworld")
    String list();
}
