package com.movie.movieService.repository;

import com.movie.movieService.entity.ActorInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorInfoRepository extends CrudRepository<ActorInfo,Integer> {

}
