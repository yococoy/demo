package com.yococoy.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {

	Staff findByName(String name);
	
	@Query(
			value = "{'name' : ?0}",
			fields = "{'_id' : 0, 'name' : 1, 'age' : 1}"
			)
	Staff a(String name);
	
}
