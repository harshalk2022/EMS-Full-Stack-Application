# Employee Management System (EMS) - Full Stack Application

This project is a full-stack Employee Management System (EMS) built using Angular for the frontend and Spring Boot for the backend, with MySQL for data storage. It provides functionalities to manage employee records, such as creating, updating, viewing, and deleting employee details.

## Features

- Add new employees
- Update employee details
- View employee information
- Delete employee records
- Responsive and user-friendly interface

## Technologies Used

- **Frontend**: Angular, Bootstrap, HTML, CSS
- **Backend**: Spring Boot, Hibernate, JPA, MySQL
- **Database**: MySQL
- **Build Tools**: Maven

## Installation and Setup

### Prerequisites

- Java: 17 or higher
- MySQL Server
- Maven
- Angular CLI: 15.2.11
- Node: 20.18.0
- Node Package Manager: npm 9.2.0
- OS: win32 x64
- Spring Tool Suite 4

### Backend Setup

1. Clone the repository:

   ```sh
    git clone https://github.com/harshalk2022/EMS-Full-Stack-Application.git
    cd EMS-Full-Stack-Application
   ```

2. Configure the database:

   - Open the `application.properties` file located in the `src/main/resources` folder.
   - Update the following lines with your MySQL configuration:

   ```properties
   # Database Configuration:MySQL
    spring.datasource.url=jdbc:mysql://localhost:3306/<your-database-name>
    spring.datasource.username=<your-username>
    spring.datasource.password=<your-password>
   ```

3. Build and run the Spring Boot backend:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   The backend server will start at `http://localhost:8181`.

### Frontend Setup

1. Navigate to the frontend directory:

   ```bash
   cd ../EMS_Frontend
   ```

2. Install the dependencies:

   ```bash
   npm install
   ```

3. Run the Angular application:

   ```bash
   ng serve
   ```

   The frontend will be available at `http://localhost:4200`.

### Running the Full Application

1. Ensure both the backend and frontend servers are running.
2. Open a browser and go to `http://localhost:4200` to start using the EMS application.

<!-- ## Screenshots

**1. Home Page**

<img src="Screenshots\home_page.png" width="700px"/><br>

**2. Add New Page**

<img src="Screenshots\add_new_page.png" width="700px"/><br>

**3. View Page**

<img src="Screenshots\view_page.png" width="700px"/><br>

**4. Update Page**

<img src="Screenshots\update_page.png" width="700px"/><br>

**5. API Documentation Page**

<img src="Screenshots\api_documentation_page.png" width="700px"/><br> -->

## API Documentation

The backend provides a RESTful API to interact with EMS. The base URL for all API endpoints is `http://localhost:8080/api`.

### 1. Get All Employees

- **Endpoint**: `/employees`
- **Method**: `GET`
- **Description**: Fetches all employee records.
- **Response**:

  ```json
  [
    {
      "id": 1,
      "name": "Harshal Khndalkar",
      "email": "harshal@example.com",
      "role": "Engineer"
    },
    {
      "id": 1,
      "name": "John Doe",
      "email": "john.doe@example.com",
      "role": "Developer"
    }
  ]
  ```

### 2. Get Employee by ID

- **Endpoint**: `/employees/{id}`
- **Method**: `GET`
- **Description**: Fetches an employee by their ID.
- **Response**:

  ```json
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "role": "Developer"
  }
  ```

### 3. Add New Employee

- **Endpoint**: `/employees`
- **Method**: `POST`
- **Description**: Adds a new employee record.
- **Request Body**:

  ```json
  {
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "role": "Manager"
  }
  ```

- **Response**:

  ```json
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "role": "Manager"
  }
  ```

### 4. Update Employee

- **Endpoint**: `/employees/{id}`

  - **Method**: PUT
  - **Description**: Updates an existing employee record.
  - **Request Body**:

    ```json
    {
      "name": "Jane Smith",
      "email": "jane.smith@example.com",
      "role": "Senior Manager"
    }
    ```

### 5. Delete Employee

- **Endpoint**: `/employees/{id}`
- **Method**: DELETE
- **Description**: Deletes an employee by their ID.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request with your enhancements.

## License

This project is licensed under the MIT License.

---
