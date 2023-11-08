package cc.andronicus.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRespository extends MongoRepository<Review, ObjectId> {
}
