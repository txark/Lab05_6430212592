# 🍵Coffee Menu Management API (Spring Boot)

### โปรเจกต์ REST API จัดการเมนูกาแฟอย่างง่ายด้วย **Spring Boot (Java)** 
#### **Prerequisites :**
* Java JDK 21
* Maven
  
---
## 🛠️ วิธีการรันโปรเจกต์ (How to Run)

1. **Clone Repository :**
   ```bash
   git clone https://github.com/txark/Lab05_6430212592.git
   cd coffeemenu
   ```
2. เปิด **Terminal** ใน โฟลเดอร์โปรเจกต์
3. พิมพ์คำสั่ง **run server**
   * **Windows :**
     ```powershell
     .\mvnw.cmd spring-boot:run
     ```
   * **macOS / Linux :**
     ```bash
     ./mvnw spring-boot:run
     ```
4. เซิร์ฟเวอร์จะเริ่มทำงานที่ `http://localhost:8080`

---
## 📡 สรุป API Endpoints

| Method | Endpoint Path | หน้าที่ |
| :---: | :--- | :--- |
| **GET** | `/coffees` | ดึงรายการเมนูกาแฟทั้งหมด |
| **GET** | `/coffees/{id}` | ดึงข้อมูลเมนูกาแฟตาม ID |
| **POST** | `/coffees` | เพิ่มเมนูกาแฟใหม่ |
| **PUT** | `/coffees/{id}` | แก้ไขข้อมูลเมนูกาแฟตาม ID |
| **DELETE** | `/coffees/{id}` | ลบเมนูกาแฟตาม ID |

---
## 💻 Expected Result

### 1. **Get All** *(ดูเมนูกาแฟทั้งหมด)*
  * *URL :* `http://localhost:8080/coffees`
  * *Response (`200 OK`) :*
    ```json
    [
      { "id": 1, "name": "Espresso", "price": 45.0 },
      { "id": 2, "name": "Latte", "price": 55.0 }
    ]
    ```
### 2. **GET By ID** *(ดูเมนูตาม ID)*
  * **กรณีที่ 1 :** หา `id` เจอ
    * *URL :* `http://localhost:8080/coffees/1`
    * *Response (`200 OK`) :*
      ```json
      [
        { "id": 1, "name": "Espresso", "price": 45.0 }
      ]
      ```
  * **กรณีที่ 2 :** หา `id` ไม่เจอ
    * *URL :* `http://localhost:8080/coffees/3`
    * *Response (`404 Not Found`) :*
### 3. **POST** *(เพิ่มเมนูใหม่)* 
  * *URL :* `http://localhost:8080/coffees`
  * *Body (JSON) :*
    ```json
    [
      {
        "name": "Cappuccino",
        "price": 60.0  
      }
    ]
    ```
  * *Response (`201 Created`) :*
    ```json
    [
      { "id": 3, "name": "Cappuccino", "price": 60.0 }
    ]
    ```
### 4. **PUT** *(แก้ไขเมนู)*
  * *URL :* `http://localhost:8080/coffees/2`
  * *Body (JSON) :*
    ```json
    [
      {
        "name": "latte",
        "price": 50.0  
      }
    ]
    ```
  * *Response (`200 OK`) :*
    ```json
    [
      { "id": 2, "name": "Latte", "price": 50.0 }
    ]
    ```
### 5. **DELETE** *(ลบเมนู)*
  * *URL :* `http://localhost:8080/coffees/3`
  * *Response (`200 OK`) :*
    ```
    (Empty Body)
    
    ```
