# endsemskill

Spring Boot sample microservice for the Docker containerization practical.

## Import into STS
1. Extract this ZIP file.
2. In STS choose File > Import > Maven > Existing Maven Projects.
3. Browse to the extracted `endsemskill` folder (the folder containing `pom.xml`).
4. Select the discovered project and click Finish.
5. Right-click the project > Maven > Update Project if dependencies do not load.

## Run without Docker
Right-click `EndsemskillApplication.java` > Run As > Spring Boot App.
Open:
- http://localhost:8080/
- http://localhost:8080/health

## Docker
Run these commands in a terminal opened in the folder containing the Dockerfile:

```bash
docker build -t endsemskill:1.0 .
docker images
docker run -d --name endsemskill-container -p 8080:8080 endsemskill:1.0
docker ps
docker logs endsemskill-container
```

Test http://localhost:8080/ and http://localhost:8080/health.

To stop and remove:
```bash
docker stop endsemskill-container
docker rm endsemskill-container
```

## Push to GitHub
Create an empty GitHub repository named `endsemskill`, then run from this project folder:

```bash
git init
git add .
git commit -m "Add Dockerized Spring Boot microservice"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/endsemskill.git
git push -u origin main
```
Replace `YOUR-USERNAME` with your GitHub username.
