# ⚽️ Premier Stats 🔥

A **Java** application for managing detailed **Premier League football player** statistics on an analytics platform. 🚀

---

## 👀 Overview

Premier Stats is a **backend service** built with **Spring Boot** that provides an easy-to-manage platform for storing and querying comprehensive stats of Premier League football players.  
Powered by JPA (Jakarta Persistence API) & Hibernate ORM, backed by PostgreSQL. 🎯

---

## 🚀 Features

- ⚡️ Store & manage player stats: goals, assists, matches, cards & more!
- 🔍 Efficient DB schema designed for football analytics.
- 🛠 CRUD operations via Spring Data JPA.
- 🤝 Easy to extend or connect with frontend apps.

---

## 🛠 Technologies

| Tech              | Version      |  
|-------------------|--------------|  
| Java              | 21           |  
| Spring Boot       | 3.5.4        |  
| JPA / Hibernate   | Latest       |  
| PostgreSQL        | 14+          |  
| Maven             | 3.8+         |  

---

## 🎉 Getting Started

### Prerequisites

- ☕️ Java 21 installed  
- ⚙️ Maven installed  
- 🐘 PostgreSQL installed & running  
- 🧑‍💻 IDE like IntelliJ or VSCode recommended  

---

### 🔧 Setup

```bash
git clone https://github.com/emi-mem/premier-stats.git
cd premier-stats
```

```Configure your database connection in src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

# Build and run the app 
```
mvn clean install
mvn spring-boot:run
```

Your backend server will be live at:
🎉 http://localhost:8080 🎉

