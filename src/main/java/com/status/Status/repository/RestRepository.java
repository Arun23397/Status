package com.status.Status.repository;

import com.status.Status.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRepository extends MongoRepository<Statusy, String> {
    public Statusy findByStatusId(int statusid);
}
