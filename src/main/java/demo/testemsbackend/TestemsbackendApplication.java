package demo.testemsbackend;

//import demo.testemsbackend.model.Employee;
import demo.testemsbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestemsbackendApplication{

	//public class TestemsbackendApplication implements CommandLineRunner{

		public static void main(String[] args) {
		SpringApplication.run(TestemsbackendApplication.class, args);
	}

//	@Autowired
//	private EmployeeRepository employeeRepository;
//	@Override
//	public void run(String... args) throws Exception{
//
//		Employee employee = new Employee();
//		 employee.setFirstName("Tiyas");
//		 employee.setLastName("Biswas");
//		 employee.setDateOfBirth("20/04/1990");
//		 employee.setDepartment("Development");
//		 employeeRepository.save(employee);
//	}
}
