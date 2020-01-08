FROM java
MAINTAINER "kongzheng1993"<kongzheng1993@hotmail.com>

# 环境变量
ENV WORK_PATH /root
ENV APP_NAME @project.build.finalName@.@project.packaging@


ADD $APP_NAME $APP_PATH/app.jar
EXPOSE 8080
CMD java -jar app.jar