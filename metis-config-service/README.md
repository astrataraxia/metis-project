# Config Service

Config Service를 사용하면 서버를 중지할 필요 없이 구성 파일(yaml)을 외부에서 관리하고 변경할 수 있습니다.
이때 RabbitMQ를 사용하여 MSA(Microservices Architecture) 서버 전체에 구성 파일을 배포합니다.

## Features
- **외부에서 구성 관리**: 각 서비스를 다시 빌드하지 않고 바로 적용 가능합니다.
- **중앙 집중식 구성**: 하나의 중앙화된 저장소에서 구성요소 관리 가능.
- **환경별 구성**: 다양한 환경(예: 개발, 테스트, 운영)을 위한 다양한 구성 처리를 쉽게 가능합니다.
 
## Technology Stack
- **Java 21**
- **Spring Boot 3.3.2**
- **Spring Cloud Config**
- **RabbitMQ**
- **Spring Cloud Bus**
