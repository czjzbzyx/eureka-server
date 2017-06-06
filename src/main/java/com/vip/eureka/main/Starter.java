/**
 * 
 */
package com.vip.eureka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fang08.li
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(Starter.class, args);
	}

}
