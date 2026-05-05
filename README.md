# 🏭 Inventory Management System (IMS)

<p align="center">
  <img src="images/logo.png" width="180"/>
</p>

## 📌 Project Description

Inventory Management System (IMS) is a web-based application designed to manage stock efficiently. It provides real-time tracking of products, stock movement, and low inventory alerts to avoid shortages or overstocking.

---

## 🚀 Key Features

✔ Product Management (Add, Delete, View)
✔ Stock In / Stock Out operations
✔ Low Stock Detection
✔ Dashboard with real-time data
✔ Transaction-based inventory updates

---

## 🧱 System Architecture

* **Frontend**: HTML, CSS, JavaScript
* **Backend**: Spring Boot (REST APIs)
* **Database**: MySQL

---

## 📁 Project Structure

```
backend/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/

src/main/resources/static/
 ├── index.html
 ├── css/
 ├── js/
 └── images/
```

---

## 🔗 API Endpoints

| Method | Endpoint          | Description      |
| ------ | ----------------- | ---------------- |
| GET    | /products         | Get all products |
| POST   | /products         | Add new product  |
| DELETE | /products/{id}    | Delete product   |
| POST   | /transactions/in  | Stock In         |
| POST   | /transactions/out | Stock Out        |

---

## ▶️ How to Run

1. Start backend server
2. Open browser

```
http://localhost:8080
```

---

## 📊 Dashboard Highlights

* Total Products Count
* Low Stock Alert System
* Dynamic Table Rendering

---

## 🎯 Future Enhancements

* Authentication (JWT)
* Email Alerts
* Advanced Reporting
* Charts & Analytics

---

## ⭐ Conclusion

This project demonstrates a scalable and modular approach to inventory management using modern web technologies.
