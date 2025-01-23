package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/sample")
	public String main() {
<<<<<<< HEAD
		return "sample local update";
=======
		return "update";
>>>>>>> d422f85b464ea4484bca0737f0fc4ccf20877871
	}
}
