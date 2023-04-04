package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Department;
import com.example.services.DepartmentService;
import com.example.services.HobbieService;
import com.example.services.PhoneService;
import com.example.services.UserService;
import com.example.services.YardService;

@SpringBootApplication
public class ProyectoFinalPoliamourApiApplication  implements CommandLineRunner{

	@Autowired
	private UserService userService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private PhoneService phoneService;

	@Autowired
	private HobbieService hobbieService;

	@Autowired
	private YardService yardService;





	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalPoliamourApiApplication.class, args);


		
	

}

	@Override
	public void run(String... args) throws Exception {
		
		departmentService.save(Department.builder()
			.name("Informatica")
			.build());
		
		
		

		departmentService.save(Department.builder()
			.name("RRHH")
			.build());

		
			
	}
}
