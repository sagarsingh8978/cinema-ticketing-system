# ==========================================
# STAGE 1: The Build Environment
# ==========================================
FROM gradle:8.14-jdk21-alpine AS builder
WORKDIR /build

# Copy root Gradle configurations if you share dependencies,
# or copy the module-specific files.
COPY settings.gradle build.gradle ./
COPY movie-service/build.gradle ./movie-service/
COPY movie-service/src ./movie-service/src

# Build only the specific module jar
RUN gradle :movie-service:bootJar --no-daemon

# ==========================================
# STAGE 2: The Production Runtime
# ==========================================
FROM eclipse-temurin:21-jre-alpine AS runtime
WORKDIR /app

# Explicitly target the specific service jar instead of using a wildcard
COPY --from=builder /build/movie-service/build/libs/movie-service-*.jar app.jar

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]