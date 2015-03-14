package info.borek.springtutorial;

import info.borek.springtutorial.api.UsersRepository;
import info.borek.springtutorial.domain.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// uruchamiamy kontext aplikacji
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"konfiguracja.xml");
		// refernacja do bena i mozna go teeraz wykorzystywac
		UsersRepository usersRepository = context.getBean(
				"rezpozytoriumUzytkownikow", UsersRepository.class);
		User janek = usersRepository.createUser("janek");

	}

}
