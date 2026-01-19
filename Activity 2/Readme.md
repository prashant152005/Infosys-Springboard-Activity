## Activity 2

## Intelligent Inventory Management System

### Role-Based Login and Access Control Module

## Problem Statement

In an Intelligent Inventory Management System, it is essential to ensure that only authorized users can access system features. Different users such as administrators, managers, and staff have different responsibilities and permissions.
Therefore, the system must authenticate users, identify their roles, and provide access strictly according to those roles.

This program implements a secure login mechanism that validates user credentials, handles invalid login attempts, restricts unauthorized users, and displays role-based access options after successful login.


## Purpose of the Login Module

The login module is designed to:

* Verify the identity of users
* Prevent unauthorized access
* Restrict system functionality based on user roles
* Improve system security using account locking

## Role-Based Access Control

The system supports multiple user roles with different permissions:

| Role         | Access Level and Permissions                      |
| ------------ | ------------------------------------------------- |
| ADMIN        | Full access including user management and reports |
| MANAGER      | Inventory viewing and stock updates               |
| STAFF        | Limited access to inventory viewing               |
| Invalid User | Access denied                                     |

This ensures that sensitive inventory operations are accessible only to authorized roles.


## Working of the Program

### 1. User Authentication

* The system prompts the user to enter a username.
* The entered username is checked against predefined users.
* If the username does not exist, the system immediately denies access.


### 2. Account Lock Verification

* Before accepting the password, the system checks whether the account is already locked.
* If the account is locked due to previous failed attempts, login is denied and the user is advised to contact the administrator.


### 3. Password Validation and Attempt Handling

* The user is allowed a limited number of password attempts.
* Each incorrect password increases the failed attempt counter.
* Once the maximum number of attempts is reached, the account is locked automatically.
* This prevents brute-force attacks and improves system security.


### 4. Successful Login and Role Identification

* If the correct password is entered within the allowed attempts, login is successful.
* The system identifies the role associated with the user.
* A role-specific menu is displayed based on the user’s permissions.


### 5. Role-Based Menu Display

* Administrators receive full system options.
* Managers receive limited operational options.
* Staff members receive minimal access.
* A logout option is provided to safely exit the system.

## Security Features Implemented

* Username validation to prevent unauthorized users
* Limited password attempts
* Automatic account locking
* Role-based authorization
* Controlled access to system features


## Key Advantages of This Design

* Ensures secure authentication and authorization
* Prevents unauthorized access to inventory data
* Implements real-world security practices
* Easy to extend for databases or enterprise systems
* Suitable for intelligent inventory applications


## Real-World Relevance

This login and access control approach is widely used in:

* Inventory management systems
* Warehouse management software
* Retail and e-commerce platforms
* Enterprise resource planning systems


## Conclusion

The role-based login module effectively secures the Intelligent Inventory Management System by validating user credentials, enforcing authorization rules, and restricting access based on roles. By incorporating account locking and role-specific menus, the system ensures security, reliability, and controlled access to inventory operations.
