package controllers;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UsersPost,Long> {
}
