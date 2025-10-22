package in.siva;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

	@GetMapping("/")
	public String index()
	{
		return "<h1> HI ....Hello welcome to Devops Practice</h1>";
	}
}
