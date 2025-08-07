# ghibli-ai-generator
AI Art Generator using React and Spring Boot


🎨 Ghibli AI Art Generator
A full-stack web application that leverages the power of Stability AI to transform your text descriptions and images into beautiful Ghibli-style art. This project is built using React (Vite), Tailwind CSS, Spring Boot, and Spring Cloud OpenFeign.



🚀 Features
Text-to-Image Generation: Describe your ideas in detail and watch them turn into Ghibli-style art.

Image-to-Image Generation: Upload any image and transform it into a new Ghibli art piece with the help of AI.

Responsive Design: Works beautifully on both mobile and desktop.

Style Selection: Choose from different art styles to give your image a unique look.

💻 Tech Stack
Frontend:

Framework: React (Vite)

Styling: Tailwind CSS

Icons: Lucide React

Backend:

Framework: Spring Boot

Language: Java 21

API Communication: Spring Cloud OpenFeign

Build Tool: Maven

External Services:

AI Model: Stability AI

Deployment: Render

🛠️ Local Setup and Installation
Follow the steps below to run this project on your local machine:

1. Clone the Repository:

git clone https://github.com/your-username/ghibli-ai-generator.git
cd ghibli-ai-generator

2. Backend Setup:

# Navigate to the backend folder
cd ghibliaibackend

# Important: Add your Stability AI key to the application.properties file
# stability.api.key = sk-xxxxxxxxxxxxxxxx

# Run the application
mvn spring-boot:run

The backend will start on localhost:8080.

3. Frontend Setup:

# Open a new terminal and navigate to the frontend folder
cd frontend

# Install all packages
npm install

# Start the development server
npm run dev

The frontend will start on localhost:5173.

📄 License
This project is licensed under the MIT License.
