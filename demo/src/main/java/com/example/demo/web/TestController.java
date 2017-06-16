package com.example.demo.web;

import com.example.demo.mapper.ITrackingMapper;
import com.example.demo.model.TrackingEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.Future;

/**
 * context for ContextModel<BR/>
 * <p>
 * Created by uni4love on 2017. 1. 18..
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/test/*")
public class TestController {
    /**
     * logger
     */
    protected Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    ITrackingMapper mapper;

    /**
     * response for request "/context/cm, HTTP-method:POST".<BR/>
     *
     */
    @RequestMapping(value = "/tr", method = RequestMethod.POST)
    public String test(@RequestBody TrackingEntity trackingEntity, HttpServletRequest request) {

        mapper.createTracking(trackingEntity);


        //TODO: 추후 처리 결과를 정의하여 리턴함.
        //return contextModelForMqString;
        return "ok";
    }
}
