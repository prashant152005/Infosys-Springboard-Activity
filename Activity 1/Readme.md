## Activity 1

## Intelligent Inventory Management System

### Alert Module using Stack with Role-Based Authentication


## 🔹 Problem Statement

In an inventory system, alerts are generated whenever stock levels cross predefined limits such as minimum stock, reorder level, or overstock conditions.
Since the **most recent alert reflects the current inventory problem**, the system prioritizes the **latest alert**.

To ensure **security**, only **ADMIN users** are allowed to view and manage these alerts.

## 🔹 Why Stack is Used
A **Stack** follows the **Last In First Out (LIFO)** principle.

* The **latest alert** is pushed last
* The **latest alert** is accessed first
* This perfectly matches real-time inventory alert requirements


## 🔹 Role-Based Authentication
The system supports **role-based access control**:

| Role              | Permission                           |
| ----------------- | ------------------------------------ |
| ADMIN             | Can view and acknowledge alerts      |
| STAFF             | Login allowed but cannot view alerts |
| User/Invalid User | Access denied                        |

This ensures that **sensitive inventory information** is visible only to authorized users.


## 🔹 Working of the Program

### 1️⃣ User Authentication

* The system accepts **username and password**
* Credentials are verified
* User role is identified

### 2️⃣ Authorization Check

* If the role is **ADMIN**, access to alerts is granted
* If not, access is denied with an appropriate message

### 3️⃣ Alert Management using Stack

* Inventory alerts are stored using `Stack<String>`
* New alerts are added using `push()`
* Latest alert is viewed using `peek()` (without removal)
* Alerts can be acknowledged using `pop()`


## 🔹 Stack Operations Used

| Method      | Purpose                   |
| ----------- | ------------------------- |
| `push()`    | Add new inventory alert   |
| `peek()`    | View most recent alert    |
| `pop()`     | Remove acknowledged alert |
| `isEmpty()` | Check if alerts exist     |


## 🔹 Key Advantages of This Design

* Ensures **latest alert priority**
* Implements **secure role-based access**
* Avoids unnecessary data structures
* Easy to extend for logging or notifications
* Suitable for **real-time inventory monitoring**


## 🔹 Real-World Relevance

This approach is commonly used in:

* Warehouses
* Retail inventory systems
* Manufacturing stock control
* Automated alert and monitoring systems


## 🔹 Conclusion

The program efficiently combines **Stack data structure** and **role-based authentication** to manage inventory alerts.
By allowing only administrators to view and handle alerts, the system maintains **security, accuracy, and operational control**.

