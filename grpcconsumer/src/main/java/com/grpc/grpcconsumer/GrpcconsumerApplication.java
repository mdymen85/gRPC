package com.grpc.grpcconsumer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.IOException;

@SpringBootApplication
@Slf4j
public class GrpcconsumerApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder
				.forPort(8070)
				.addService(new MessageServiceImpl()).build();

		server.start();
		server.awaitTermination();
		//SpringApplication.run(GrpcconsumerApplication.class, args);
	}

}
