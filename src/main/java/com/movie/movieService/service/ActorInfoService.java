package com.movie.movieService.service;

import com.movie.movieService.controller.MovieServiceController;
import com.movie.movieService.dao.ActorInfoDAO;
import com.movie.movieService.entity.ActorInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActorInfoService {
    Logger logger = LoggerFactory.getLogger(MovieServiceController.class);
    @Autowired
    private ActorInfoDAO actorInfoDAO;

    public Optional<ActorInfo>getActorDetail(int id){
        logger.info("ActorInfoService.getActorDetail");
        logger.info("id = " + id);
        return actorInfoDAO.getActorInfo(id);

    }
}
