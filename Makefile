.PHONY: .gradle .idea app build docs etc gradle

docker:
	docker-compose up -d

app:
	./gradlew clean build && \
	./gradlew bootRun

stop:
	docker-compose stop

clean:
	docker-compose down