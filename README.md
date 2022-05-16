# gRPC
My First Test Using gRPC And Trying To Figure It Out Differences Between REST Comunication In Performance Way 

sudo apt install -y protobuf-compiler
protoc --version  # Ensure compiler version is 3+

protoc -I=./ --java_out=./ message.proto
