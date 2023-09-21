.PHONY: .gradle .idea app build docs etc gradle

docker:
	docker-compose up -d

app:
	./gradlew clean build && \
	./gradlew bootRun

stop:
	docker-compose stop

clean:
	docker-compose db down

keys:
	openssl genrsa  -out src/main/resources/rsa/keypair.pem 2048 && \
	openssl rsa  -in src/main/resources/rsa/keypair.pem  -pubout  -out src/main/resources/rsa/public.pem && \
	openssl pkcs8  -topk8  -inform PEM  -outform PEM  -nocrypt  -in src/main/resources/rsa/keypair.pem  -out src/main/resources/rsa/private.pem

autostart_off:
	docker update --restart=no $$( docker container ls -a -q)