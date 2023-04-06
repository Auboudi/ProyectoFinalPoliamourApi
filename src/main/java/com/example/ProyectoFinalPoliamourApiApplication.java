package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Department;
import com.example.entities.User;
import com.example.entities.Yard;
import com.example.services.DepartmentService;
import com.example.services.UserService;
import com.example.services.YardService;

@SpringBootApplication
public class ProyectoFinalPoliamourApiApplication  implements CommandLineRunner{

	@Autowired
	private UserService userService;

	@Autowired
	private DepartmentService departmentService;

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

		Yard yard1 =  yardService.save(Yard.builder()
			.id(1)
			.name("Yard1")
			.department(departmentService.findbyId(1))
			.build());
		
		Yard yard2 = yardService.save(Yard.builder()
			.id(2)
			.name("Yard2")
			.department(departmentService.findbyId(1))
			.build());

		Yard yard3 = yardService.save(Yard.builder()
			.id(3)
			.name("Yard3")
			.department(departmentService.findbyId(1))
			.build());

		List<Yard> listaYard1 = new ArrayList<>();
		listaYard1.add(yard1);
		listaYard1.add(yard2);

		List<Yard> listaYard2 = new ArrayList<>();
		listaYard2.add(yard3);

		List<String> hobbie = new ArrayList<>();

		
		userService.save(User.builder()
			.id(1)
			.name("Nombre1")
			.surnames("Apellido1")
			.email("correo1")
			.password("password1")
			.city("Murcia")
			.department(departmentService.findbyId(1))
			.yards(listaYard1)
			.phone("677888999")
			.build());

		userService.save(User.builder()
			.id(2)
			.name("Nombre2")
			.surnames("Apellido2")
			.email("correo2")
			.password("password2")
			.city("Valencia")
			.department(departmentService.findbyId(2))
			.phone("654632981")
			.build());

		userService.save(User.builder()
			.id(3)
			.name("Nombre3")
			.surnames("Apellido3")
			.email("correo3")
			.password("password3")
			.city("Murcia")
			.department(departmentService.findbyId(1))
			.yards(listaYard2)
			.build());
		


		
			
	}
}
