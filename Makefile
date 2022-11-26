default: build

run-local:
	docker login
	docker build --target="frontend" --tag frontend .
	# docker build --target="backend" --tag backend .
	docker-compose -f docker-compose.yml build
	docker-compose -f docker-compose.yml up

clean:
	docker login
	docker-compose down --remove-orphans
	docker iamge prune -a
	docker network prune