# fmchan Spring Data ElasticSearch Demo

## You will learn
- Connecting to the Elasticsearch Instance
- Representing the Document
- Indexing and Searching with a Spring Data Repository ([Doc](https://docs.spring.io/spring-data/elasticsearch/docs/current/api/org/springframework/data/elasticsearch/repository/ElasticsearchRepository.html))
- Indexing and Searching with ```ElasticsearchRestTemplate``` ([Doc](https://docs.spring.io/spring-data/elasticsearch/docs/current/api/org/springframework/data/elasticsearch/core/ElasticsearchRestTemplate.html))
    - NativeQuery
    - StringQuery
    - CriteriaQuery
- Building a Search Application
    - Building the Product Search Index
    - Searching Products with Multi-Field and Fuzzy Search
    - Fetching Suggestions with Wildcard Search

### web console
```http://localhost:8080/search```

## Environment
- JDK 17
- Spring Boot 2.6.1
- Spring Data Elasticsearch
- lombok
- Gradle 7.2