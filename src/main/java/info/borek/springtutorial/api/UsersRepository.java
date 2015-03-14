package info.borek.springtutorial.api;

import info.borek.springtutorial.domain.User;

public interface UsersRepository {
	User createUser(String name);

	void setLogger(Logger logger);
}
