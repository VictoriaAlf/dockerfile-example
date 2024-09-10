install:
	mvn clean install

test:
	mvn test

lint:
	# Linting not usually required for Java; add any linting steps here if needed.

build:
	mvn clean package

docker-build:
	docker build -t my-java-service .

docker-push:
	docker push my-java-service
