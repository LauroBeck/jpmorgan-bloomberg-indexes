# JPMorgan Bloomberg Market Intelligence Dashboard v1.1.0

![Build Status](https://img.shields.io/badge/Build-Passing-089981?style=flat-square&logo=github)
![Java Version](https://img.shields.io/badge/Java-8%20%2F%2021-ED8B00?style=flat-square&logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.8.1-C71A36?style=flat-square&logo=apache-maven)
![Jetty](https://img.shields.io/badge/Server-Jetty%209.4-005C9C?style=flat-square&logo=eclipse-jetty)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)

## 🚀 Project Overview
A high-performance Java EE web application designed to simulate a **Bloomberg Terminal** interface for tracking JPMorgan and Global Market Indexes. Built with a focus on clean architecture, the system utilizes a decoupled Service Layer and a JSP-driven front end.


# JPMorgan Bloomberg Market Intelligence Dashboard v1.1.0

## 🚀 Project Overview
A high-performance Java EE web application designed to simulate a **Bloomberg Terminal** interface for tracking JPMorgan and Global Market Indexes. Built with a focus on clean architecture, the system utilizes a decoupled Service Layer and a JSP-driven front end.

## 🛠️ Technical Stack
* **Backend:** Java 8 / Java 21 (Ubuntu Linux optimized)
* **Server:** Jetty 9.4 (WebAppContext)
* **Build Tool:** Maven 3.8.1
* **Frontend:** JSP, JSTL 1.2, CSS3 (High-Contrast Terminal UI)

## 🏗️ Architecture
The project follows a classic **MVC (Model-View-Controller)** pattern:
* **Model:** `Index.java` - Handles financial data points including Tickers, Prices, and Percent Changes.
* **View:** `index.jsp` - A protected resource within `WEB-INF` for secure rendering.
* **Controller:** `HomeServlet.java` - Manages data flow and request forwarding.

## 🚦 Getting Started
1. **Clone the repository:**
   ```bash
   git clone <your-repo-url>
   ```
2. **Compile and Run:**
   ```bash
   mvn clean jetty:run
   ```
3. **Access the Dashboard:**
   Navigate to `http://localhost:8080/home`

## 📊 Market Coverage
* **BCOM:** Bloomberg Commodity Index
* **JPM-EMBI:** J.P. Morgan Emerging Markets Bond Index
* **SPX:** S&P 500 Index
* **CCMP:** Nasdaq Composite
