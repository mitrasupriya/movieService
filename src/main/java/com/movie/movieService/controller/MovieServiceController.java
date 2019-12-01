package com.movie.movieService.controller;

import com.movie.movieService.entity.ActorInfo;
import com.movie.movieService.service.ActorInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/movie")
public class MovieServiceController {
    Logger logger = LoggerFactory.getLogger(MovieServiceController.class);
@Autowired
private ActorInfoService actorInfoService;

    @GetMapping(value = "/getActorInfo/{id}")
    public Optional<ActorInfo> getActorInfo(@PathVariable("id") int id) {
        logger.info("MovieServiceController.getActorInfo starts");
        logger.info("id = " + id);
        Optional<ActorInfo> actorInfos = actorInfoService.getActorDetail(id);
        logger.info("MovieServiceController.getActorInfo ends");
        return actorInfos;
    }
}
