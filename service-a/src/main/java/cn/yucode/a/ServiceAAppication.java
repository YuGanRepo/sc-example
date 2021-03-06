package cn.yucode.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * Created by Gan on 2017/7/10.
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableOAuth2Client
@EnableFeignClients
@EnableDiscoveryClient
public class ServiceAAppication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAAppication.class, args);
    }

}
