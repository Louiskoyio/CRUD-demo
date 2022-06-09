package com.louiskoyio.cruddemo.fixture;

import org.springframework.data.repository.CrudRepository;

public interface FixtureRepository extends CrudRepository<Fixture, Integer> {
    Long countById(Integer id);
}
