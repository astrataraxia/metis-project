# Discovery Service

Discovery Service는 다른 서비스 검색 및 등록을 담당하는 마이크로서비스 아키텍처의 핵심 구성 요소입니다. 
다른 서비스가 서로를 찾고 통신 수 있도록 도와줍니다. 또한 과도한 트레픽이 몰릴 경우 로드 벨런싱 기능으로
트래픽을 분산하여 주는 기능을 갖추고 있습니다.

## 역할
- Service registration and discovery
- Health checks
- Load balancing

## 사용 기술
- Java 21
- Spring Boot 3.3.2
- Spring Cloud Netflix Eureka Server
