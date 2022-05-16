package com.grpc.grpcconsumer;

import lombok.extern.slf4j.Slf4j;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@Slf4j
public class MessageServiceImpl extends com.grpc.grpcconsumer.MessageServiceGrpc.MessageServiceImplBase {

    @Override
    public void hello(com.grpc.grpcconsumer.MessageRequest request,
                      io.grpc.stub.StreamObserver<com.grpc.grpcconsumer.MessageResponse> responseObserver) {
        MessageResponse response = MessageResponse
                .newBuilder()
                .setMessageResponse("resposta 1")
                .build();

        log.info("chegou {}", request.getMessage());

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

}
