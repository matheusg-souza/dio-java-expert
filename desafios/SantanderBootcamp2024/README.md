# Santander Bootcamp 2024
RESTful API do Santander Bootcamp 2024 construída em Java 17 com Spring Boot 3.

# Diagrama de Classes
```mermaid
classDiagram
  class User {
    -int id
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -int id
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -int id
    -String icon
    -String description
  }

  class Card {
    -int id
    -String number
    -Number limit
  }

  class News {
    -int id
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News

```
