# Getting Started

## requirements

* Java 17
* gradle
* openssl
*

## Links

* [Swagger UI](http://localhost:8080/swagger-ui/index.html#/)
* [prometheus](http://localhost:9090/)
* [Grafana](http://localhost:3000/d/be504e73-4abb-41e7-9377-5387382d1e47/jvm-micrometer?orgId=1&refresh=10s&from=now-15m&to=now&viewPanel=111)

### make commands

* make docker
* make app
* make stop
* make clean
* make keys

### Init env
```bash
make docker && \
make keys
```

### Start app

```bash
make app
```

### Stop app

```bash
make stop
```

### Clean database

```bash
make clean
```