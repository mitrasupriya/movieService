package com.movie.movieService.dao;

import com.movie.movieService.controller.MovieServiceController;
import com.movie.movieService.entity.ActorInfo;
import com.movie.movieService.repository.ActorInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Component
@Transactional
public class ActorInfoDAO {
    Logger logger = LoggerFactory.getLogger(MovieServiceController.class);
    @Autowired
    private ActorInfoRepository actorInfoRepository;

    public Optional<ActorInfo> getActorInfo(int id){
        logger.info("ActorInfoDAO.getActorInfo");
        logger.info("id = " + id);
        return actorInfoRepository.findById(id);
    }
}
