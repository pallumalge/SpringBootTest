package in.pallu.pack.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Test implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is first app in github");
	}

}
