package info.borek.springtutorial;

import info.borek.springtutorial.api.Logger;
import info.borek.springtutorial.api.UsersRepository;
import info.borek.springtutorial.domain.User;
import info.borek.springtutorial.implementations.LoggerImpl;
import info.borek.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);

		User user = usersRepository.createUser("Janek");

	}

}
