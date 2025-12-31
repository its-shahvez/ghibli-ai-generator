# 🎨 GenAI Visual Content Platform (POC)

> **Note:** This project is a **Proof of Concept (POC)** developed to demonstrate the architectural implementation of Generative AI integration using Java & Spring Boot. It reflects the core logic and backend patterns utilized during my tenure as a Backend Developer.

## 🚀 Project Overview

This is a full-stack Enterprise-level application designed to generate high-fidelity visual assets from textual descriptions. The system acts as a secure middleware between the end-user and Large Language Models (LLMs) like **Stability AI**.

While the original implementation at **JPR Technosoft LLP** was strictly backend-focused (Microservices), this repository demonstrates a complete **End-to-End implementation** including a React frontend to showcase full-stack integration capabilities.

### 🔑 Key Highlights for Reviewers
* **External API Integration:** Implemented **Spring Cloud OpenFeign** for declarative REST client communication with Stability AI, replacing legacy `RestTemplate`.
* **Clean Architecture:** strictly follows **DTO (Data Transfer Object)** patterns to decouple the internal domain model from external API consumers.
* **Asynchronous Processing:** Optimized for high-latency AI tasks using non-blocking patterns.
* **Modern Tech Stack:** Built on **Java 21** and **Spring Boot 3.x**.

---

## 🛠️ Technology Stack

### Backend (Core Competency)
* **Framework:** Spring Boot 3.2 (Java 21)
* **Communication:** Spring Cloud OpenFeign
* **Build Tool:** Maven
* **Architecture:** RESTful API, Layered Architecture (Controller-Service-Repository)
* **Utilities:** Lombok, Jackson

### Frontend (User Interface)
* **Framework:** React.js (Vite)
* **Styling:** Tailwind CSS for responsive grid layouts
* **State Management:** React Hooks

---

## ⚙️ Architecture & Data Flow

```mermaid
graph LR
    User[Client / React UI] -- JSON Request --> Controller[Spring Boot Controller]
    Controller -- DTO --> Service[Business Logic Layer]
    Service -- Feign Client --> AI_Engine[Stability AI Engine]
    AI_Engine -- Base64 Image --> Service
    Service -- Response DTO --> User
Request Handling: The client sends a prompt via a secure REST endpoint.

Validation: The service layer validates the prompt constraints and credit availability.

Feign Client Negotiation: The application constructs a secure request to the Stability AI provider.

Transformation: The raw binary/Base64 response is processed and mapped to a clean JSON response format for the frontend.

💻 Installation & Setup
Prerequisites
Java JDK 21 or higher

Node.js (v18+)

Maven

1. Backend Setup
Bash

# Navigate to the backend directory
cd ghibliaibackend

# Configure API Keys in application.properties
# stability.api.key=YOUR_API_KEY_HERE

# Build and Run
mvn clean install
mvn spring-boot:run
Server starts at: http://localhost:8080

2. Frontend Setup
Bash

# Navigate to the frontend directory
cd client

# Install dependencies
npm install

# Run development server
npm run dev
Client starts at: http://localhost:5173

📌 Implementation Notes (Interview Context)
This project solves specific challenges encountered in production environments:

Latency Management: Handling API timeouts when generating high-resolution images.

DTO Mapping: preventing over-fetching of data by exposing only necessary fields to the UI.

Scalability: The backend is designed to be stateless, allowing it to be horizontally scaled in a containerized (Docker) environment.

📝 License
This project is open-sourced for educational and portfolio demonstration purposes.


