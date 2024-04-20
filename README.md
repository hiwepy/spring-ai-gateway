# spring-ai-gateway

### Spring AI Gateway 是什么？

> Spring AI Gateway ：高性能 的 LLMs（大模型）、SLMs（小模型）API 网关

### Spring AI Gateway 特点

- 1、高性能：基于 Spring Boot 3.x 开发，性能优越
- 3、高可用：支持集群部署，支持多种AI平台
- 4、高扩展：支持多种AI平台，支持多种向量数据库
- 2、易用性：开箱即用，配置简单
- 5、安全可靠：支持多种安全认证方式
- 6、高监控：支持多种监控方式
- 7、高可靠：支持多种熔断、降级方式
- 8、高效率：支持多种配置读取方式
- 9、高性价比：开源免费，无需额外费用
- 10、高生产力：支持多种开发语言，支持多种开发框架

### 计划模块

- 接口访问代理转发
    - [ ] spring-ai-gateway-router-spring-boot-starter：实现一套接口，多种AI平台的对接
- 向量数据库支持
    - [ ] spring-ai-gateway-vector-spring-boot-starter：实现一套接口，多种向量数据库的切换
- 服务熔断、服务降级
    - [ ] spring-ai-gateway-rateLimit-guava-spring-boot-starter：基于 Guava 的 Token 本地限流实现逻辑
    - [ ] spring-ai-gateway-rateLimit-redis-spring-boot-starter：基于 Redis 的 Token 分布式限流实现逻辑
    - [ ] spring-ai-gateway-rateLimit-hystrix-spring-boot-starter：基于 Guava 的 Token 本地限流实现逻辑
    - [ ] spring-ai-gateway-rateLimit-resilience4j-spring-boot-starter：基于 Guava 的 Token 本地限流实现逻辑
    - [ ] spring-ai-gateway-rateLimit-sentinel-spring-boot-starter：基于 Guava 的 Token 本地限流实现逻辑
- LLM 配置读取实现
    - [ ] spring-ai-gateway-config-spring-boot-starter
    - [ ] spring-ai-gateway-config-r2dbc-spring-boot-starter
    - [ ] spring-ai-gateway-config-nacos-spring-boot-starter
    - [ ] spring-ai-gateway-config-redis-spring-boot-starter
    - [ ] spring-ai-gateway-config-etcd-spring-boot-starter
- LLM 监控分析 - 三方对接
    - [ ] spring-ai-gateway-langfuse-spring-boot-starter
    - [ ] spring-ai-gateway-prometheus-spring-boot-starter
- LLM 监控分析 - 三方对接
    - [ ] spring-ai-gateway-admin：界面
