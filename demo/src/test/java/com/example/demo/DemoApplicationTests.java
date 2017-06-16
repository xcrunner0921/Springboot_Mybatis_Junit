package com.example.demo;

import com.example.demo.mapper.ITrackingMapper;
import com.example.demo.model.TrackingEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value = {"com.example.demo.mapper"})
public class DemoApplicationTests {

	@Autowired
	ITrackingMapper mapper;

	@Test
	public void mapperTest() {
		TrackingEntity tracking = new TrackingEntity();
		tracking.setSessionId("test");
		tracking.setUri("test");
		tracking.setMethod("test");
		tracking.setRemoteAddr("test");
		tracking.setRemoteHost("test");
		tracking.setProcess("test");

		mapper.createTracking(tracking);
	}

}
