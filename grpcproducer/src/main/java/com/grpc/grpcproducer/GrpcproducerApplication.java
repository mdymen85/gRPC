package com.grpc.grpcproducer;

import com.grpc.grpcconsumer.MessageRequest;
import com.grpc.grpcconsumer.MessageResponse;
import com.grpc.grpcconsumer.MessageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcproducerApplication {

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8070)
				.usePlaintext()
				.build();

		MessageServiceGrpc.MessageServiceBlockingStub stub
				= MessageServiceGrpc.newBlockingStub(channel);

		MessageResponse helloResponse = stub.hello(MessageRequest.newBuilder()
				.setMessage("TESTE DE TESTE")
				.build());

		channel.shutdown();

//		SpringApplication.run(GrpcproducerApplication.class, args);

	}

}
