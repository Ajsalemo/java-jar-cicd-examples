# java-jar-devops-examples
Various examples using Maven and Gradle with CI/CD, for both jar based deployments

Steps to run locally:
1. Clone this repository
2. For Maven based examples, run `./mvnw spring-boot:run`. For Gradle examples, run `./gradlew bootRun`.
3. For deployment, use and change the `.yml` under the `.github/<appname>.yml` folder to target your application being deployed to. Ensure to update the Publish Profile credentials.
