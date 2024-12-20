# SpringCloud MSA - Catalog Service
> 스프링클라우드를 통한 MSA 구축 - 상품/재고 서비스

<br/>

## ⚙️ 개발 환경
- JDK 17
- Spring Boot 3.2.1
- Spring Cloud Eureka Client 4.1.3
- Spring Date JPA
- Lombok
- H2 DB
- Gradle 8.10
- MapStruct

<br/>

## 📌 서비스 설명

### 프로파일
> `test`
- VM Option = `-Dspring.profiles.active={profile}`

### 엔드포인트
#### 헬스체크 - (GET)   /franc/api/catalogs/health_check
#### 상품/재고 전체조회 - (GET) franc/api/catalogs

