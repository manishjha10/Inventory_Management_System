
📦 Supplier Management Module

🌿 Branch

"feature/supplier-management"

---

📌 Overview

This module implements Supplier Management for the Inventory Management System (IMS).
It enables efficient handling of supplier data, which is essential for inventory tracking and stock-in operations.

📌 Simple:

«This feature allows adding, viewing, updating, and deleting suppliers in the system.»

---

🎯 Features Implemented

✅ CRUD Operations

- ➕ Add Supplier
- 📄 View All Suppliers
- ✏️ Update Supplier
- ❌ Delete Supplier

---

🏗️ Architecture

The module follows Spring Boot layered architecture:

Controller → Service → Repository → Database

---

📁 Folder Structure

com.ims
│
├── controller/
│   └── SupplierController.java
│
├── service/
│   └── SupplierService.java
│
├── repository/
│   └── SupplierRepository.java
│
├── entity/
│   └── Supplier.java

---

⚙️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- REST API
- MySQL / PostgreSQL

---

🔌 API Endpoints

Method| Endpoint| Description
POST| "/api/suppliers"| Add new supplier
GET| "/api/suppliers"| Get all suppliers
PUT| "/api/suppliers/{id}"| Update supplier
DELETE| "/api/suppliers/{id}"| Delete supplier

---

🧪 How to Test

Use Postman / Thunder Client

Example Request (POST)

{
  "name": "ABC Traders",
  "email": "abc@gmail.com",
  "phone": "9876543210",
  "address": "Delhi"
}

---

🔗 Integration in IMS

This module is used in:

- 📦 Stock In Process (Suppliers provide inventory)
- 🏢 Supplier Database Management
- 🔄 Future Inventory Analytics

---

🚀 Impact

- Improves supplier tracking
- Reduces manual errors
- Supports real-time inventory updates

---

📌 Future Enhancements

- Supplier-Product Relationship
- Validation & Exception Handling
- Role-based Access (Admin only)
- Search & Filtering
