# ==========================================
# STAGE 1: The Build Environment
# ==========================================
# 🌟 FIXED: Bumped to 8.14 to clear the minimum requirement restriction
FROM gradle:8.14-jdk21-alpine AS builder
WORKDIR /build

COPY build.gradle settings.gradle ./
COPY src ./src

RUN gradle clean bootJar --no-daemon

# ==========================================
# STAGE 2: The Production Runtime
# ==========================================
FROM eclipse-temurin:21-jre-alpine AS runtime
WORKDIR /app

COPY --from=builder /build/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]