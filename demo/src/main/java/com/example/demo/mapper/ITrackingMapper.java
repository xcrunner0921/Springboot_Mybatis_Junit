package com.example.demo.mapper;

import com.example.demo.model.TrackingEntity;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by jonghee on 2017-06-02.
 */
//@Mapper
public interface ITrackingMapper {

    void createTracking(TrackingEntity trackingEntity);

    List<TrackingEntity> retrieveTracking();

    void save(TrackingEntity trackingEntity);
}
