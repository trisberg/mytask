package com.springdeveloper.task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"management.metrics.export.prometheus.rsocket.enabled=false"})
class MytaskApplicationTests {

	@Test
	void contextLoads() {
	}

}
