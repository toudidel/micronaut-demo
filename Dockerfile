FROM oracle/graalvm-ce:21.2.0-java11 as graalvm
COPY . /home/app/basic-app
WORKDIR /home/app/basic-app
RUN gu install native-image
RUN yum install -y libstdc++-static
RUN native-image --no-server --static -cp build/libs/basic-app-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/basic-app/basic-app /app/basic-app
ENTRYPOINT ["/app/basic-app"]