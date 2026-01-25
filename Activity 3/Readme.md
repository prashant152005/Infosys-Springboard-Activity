## Activity 3

## Intelligent Inventory Management System

### Sports Equipment Store – Role-Based Inventory Management


## Problem Statement
A sports equipment store deals with multiple products such as cricket bats, footballs, badminton rackets, and helmets. These products are supplied in multiple shipments at different times, and the store manager must always know the current available stock.
At the same time, inventory data is sensitive and should not be accessible to all users. Therefore, the system must ensure that only authorized users, particularly administrators, can manage inventory operations.
This system integrates **secure role-based login** with **product and inventory management** to ensure controlled access and accurate stock tracking.


## Purpose of the Integrated System
The system is designed to:
* Authenticate users securely
* Identify user roles
* Restrict inventory access based on roles
* Manage sports equipment inventory efficiently
* Track stock received through multiple shipments
* Display real-time stock availability


## Role-Based Access Control
The system supports different user roles with clearly defined permissions:

| Role         | Access Level and Permissions              |
| ------------ | ----------------------------------------- |
| ADMIN        | Full access to inventory management       |
| STAFF        | Login allowed but inventory access denied |
| Invalid User | Access denied                             |

This ensures that only authorized personnel can modify or view inventory data.


## Working of the Program

### 1. User Authentication
* The system prompts the user to enter a username and password.
* The entered credentials are validated against predefined user records.
* If the credentials are invalid, the system denies access.

### 2. Authorization and Re-Login Control
* After successful login, the system identifies the user’s role.
* If the user is not an administrator:
  * Inventory access is denied.
  * The user is given two options:
                        * Login again
                        * Exit the system
* This prevents unauthorized users from accessing inventory operations while maintaining user-friendly control flow.

### 3. Successful Admin Login
* When an administrator logs in successfully:
    * Access to the inventory management module is granted.
    * The inventory menu is displayed.


## Inventory Management Module

### Product Representation
Each sports item in the inventory is represented with:
* A unique product code
* Product name
* Available stock quantity
This ensures clear identification and tracking of each item.


### Inventory Storage Mechanism
* Inventory data is stored using a key-value structure.
* The product code acts as the key.
* The product object stores product details and stock.
* This allows fast access, updates, and retrieval of stock information.


## Inventory Menu Operations
Once the administrator accesses the system, the following operations are available:

### 1. Add Shipment
* The administrator selects a product using its product code.
* A shipment quantity is entered.
* The quantity is added to the existing stock.
* This supports multiple shipments for the same product.
### 2. View All Products
* Displays a complete list of products.
* Shows product code, product name, and total available stock.
* Helps the store manager monitor overall inventory status.
### 3. View Stock of a Specific Product
* Allows the administrator to check stock for a particular product.
* Useful for quick stock verification and decision-making.
### 4. Exit Inventory Menu
* Safely exits the inventory module.
* Ensures proper termination of system execution.


## Security and Control Features Implemented

* Role-based authentication
* Restricted inventory access
* Re-login or exit option for unauthorized users
* Controlled menu-driven operations
* Prevention of accidental or unauthorized inventory modification


## Key Advantages of This Design

* Ensures secure access to inventory data
* Supports real-world inventory workflows
* Allows accurate tracking of multiple shipments
* Easy to understand and extend
* Suitable for academic and practical evaluation


## Real-World Relevance
This system design is applicable to:
* Sports equipment stores
* Retail inventory systems
* Warehouse stock management
* Supplier-based inventory tracking
* Small and medium-scale business applications


## Conclusion
The Sports Equipment Store Inventory System effectively integrates **role-based authentication** with **inventory management**. By allowing only administrators to access inventory operations and supporting multiple shipments with real-time stock calculation, the system ensures security, accuracy, and operational efficiency. This design reflects real-world inventory management practices and is well-suited for intelligent inventory applications.
