package com.example.playground;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

	@GetMapping("/info")
	public playEntity getInfo() {
		return new playEntity("Arul", 20, "Thanjavur");
	}
	
	@GetMapping("/datas")
	public List<playEntity> getInfos() {
		List<playEntity> datas = new ArrayList<>();
		datas.add(new playEntity("Naveen", 21, "CBE"));
		datas.add(new playEntity("BUddy", 31, "Tj"));
		datas.add(new playEntity("Nagan", 61, "CE"));
		datas.add(new playEntity("flender", 29, "CBE"));
		datas.add(new playEntity("regan", 25, "CBE"));
		datas.add(new playEntity("Noras", 14, "CBE"));
		datas.add(new playEntity("Flem", 32, "CBE"));
		
		return datas;
		
	}
	
	@GetMapping("{name}/{age}/{city}")
	public playEntity dataPathVar(@PathVariable("name") String name, @PathVariable("age") int age,
			@PathVariable("city") String city) {
		return new playEntity(name, age, city);
	}
	
	@GetMapping("/query")
	public playEntity reqParam(@RequestParam(name = "name") String name,
			@RequestParam(name = "age") int age,
			@RequestParam(name = "city") String city) {
		return new playEntity(name, age, city);
	}
}
