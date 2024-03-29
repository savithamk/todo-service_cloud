package org.java.web.todo.data;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.java.web.todo.entity.Activity;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ActivityRepository extends ReactiveCosmosRepository<Activity, String> {
    Flux<Activity> findByStatus(String status);
    Flux<Activity> findByUserId(String userId);
}
