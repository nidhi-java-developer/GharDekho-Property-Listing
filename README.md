# 🏡 GharDekho – Property Listing Web Portal

GharDekho is a full-stack web application where users can **view, add, update, delete** property listings.  
It works as a small real-estate portal that helps users browse properties based on their needs.

---

## 🚀 Features

### 🔹 Admin Features
- Add new property
- Update property details
- Delete property
- View all property listings
- Manage users (optional)

### 🔹 User Features
- View properties with details (price, area, images, location)
- Search property by name / location
- Filter properties based on category (Rent/Sale)
- Contact/Inquiry feature (optional)

---

## 🛠️ Tech Stack Used

### **Frontend**
- HTML  
- CSS  
- JavaScript  

### **Backend**
- Java  
- JSP / Servlet  
- JDBC  

### **Database**
- MySQL  

---

## 📂 Project Structure
/GharDekho
├── index.jsp
├── addProperty.jsp
├── viewProperties.jsp
├── updateProperty.jsp
├── deleteProperty.jsp
├── PropertyServlet.java
├── DBConnection.java
└── property.sql

---

## 💡 How to Run the Project
1. Import the project in **Eclipse/IntelliJ**  
2. Configure **Apache Tomcat Server**  
3. Create a MySQL database and import `property.sql`  
4. Update database username/password in `DBConnection.java`  
5. Run the project on server  
6. Open:  
http://localhost:8080/GharDekho/
