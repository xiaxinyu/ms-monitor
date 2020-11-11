# Build Docker Image
 - 生成jar：mvn clean package
 - 构建镜像：mvn docker:build
 
# 创建网络
docker network create ms-sailfish
 
# 启动容器
docker run -d  --name ms-monitor-dashboard -p 8760:8760 ms-sailfish/ms-monitor-dashboard:v0.0.1

# 启动容器集成网络并指定Eureka注册中心
docker run -d  --name ms-monitor-dashboard --network ms-sailfish  --env EUREKA_CLIENT_SERVICEURL_DEFAULTZONE="http://ms-register-center:8761/eureka/"  -p 8760:8760 ms-sailfish/ms-monitor-dashboard:v0.0.1
 
  
