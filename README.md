# Todo Application

A simple Todo application with CRUD (Create, Read, Update, Delete) functionality, powered by an H2 database.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)


## Prerequisites

- Java 11 or higher
- Maven
- Git
- An integrated development environment (IDE) of your choice (e.g., IntelliJ IDEA, Eclipse)
- Postman or a similar tool for testing API endpoints

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/nistha/todo-crud
   cd todo-application
   ## API Endpoints

The Todo application provides the following RESTful API endpoints for managing todos:

- **List All Todos**

  - **URL:** `/todos`
  - **Method:** GET
  - **Description:** Retrieve a list of all todos.
  - **Response:** A JSON array of todos.

- **Get Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** GET
  - **Description:** Retrieve a specific todo by its unique ID.
  - **Response:** A JSON object representing the todo.

- **Create a New Todo**

  - **URL:** `/todos`
  - **Method:** POST
  - **Description:** Create a new todo.
  - **Request Body:** A JSON object representing the new todo.
  - **Response:** A JSON object representing the newly created todo.

- **Update a Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** PUT
  - **Description:** Update an existing todo by its ID.
  - **Request Body:** A JSON object representing the updated todo.
  - **Response:** A JSON object representing the updated todo.

- **Delete a Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** DELETE
  - **Description:** Delete a todo by its ID.
  - **Response:** No content.

### Todo JSON Structure

A JSON representation of a todo object typically includes the following fields:

- `id` (integer): Unique identifier for the todo.
- `title` (string): Title of the todo.
- `done` (boolean): Indicates whether the todo is completed (true) or not (false).

### Example Usage

Here's an example of how you can interact with these endpoints using cURL:

**Create a New Todo:**

## API Endpoints

The Todo application provides the following RESTful API endpoints for managing todos:

- **List All Todos**

  - **URL:** `/todos`
  - **Method:** GET
  - **Description:** Retrieve a list of all todos.
  - **Response:** A JSON array of todos.

- **Get Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** GET
  - **Description:** Retrieve a specific todo by its unique ID.
  - **Response:** A JSON object representing the todo.

- **Create a New Todo**

  - **URL:** `/todos`
  - **Method:** POST
  - **Description:** Create a new todo.
  - **Request Body:** A JSON object representing the new todo.
  - **Response:** A JSON object representing the newly created todo.

- **Update a Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** PUT
  - **Description:** Update an existing todo by its ID.
  - **Request Body:** A JSON object representing the updated todo.
  - **Response:** A JSON object representing the updated todo.

- **Delete a Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** DELETE
  - **Description:** Delete a todo by its ID.
  - **Response:** No content.

### Todo JSON Structure

A JSON representation of a todo object typically includes the following fields:

- `id` (integer): Unique identifier for the todo.
- `title` (string): Title of the todo.
- `done` (boolean): Indicates whether the todo is completed (true) or not (false).

### Example Usage

Here's an example of how you can interact with these endpoints using cURL:

**Create a New Todo:**

## API Endpoints

The Todo application provides the following RESTful API endpoints for managing todos:

- **List All Todos**

  - **URL:** `/todos`
  - **Method:** GET
  - **Description:** Retrieve a list of all todos.
  - **Response:** A JSON array of todos.

- **Get Todo by ID**
-  - **URL:** `/todos/{id}`
  - **Method:** GET
  - **Description:** Retrieve a specific todo by its unique ID.
  - **Response:** A JSON object representing the todo.

- **Create a New Todo**

  - **URL:** `/todos`
  - **Method:** POST
  - **Description:** Create a new todo.
  - **Request Body:** A JSON object representing the new todo.
  - **Response:** A JSON object representing the newly created todo.

- **Update a Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** PUT
  - **Description:** Update an existing todo by its ID.
  - **Request Body:** A JSON object representing the updated todo.
  - **Response:** A JSON object representing the updated todo.

- **Delete a Todo by ID**

  - **URL:** `/todos/{id}`
  - **Method:** DELETE
  - **Description:** Delete a todo by its ID.
  - **Response:** No content.

### Todo JSON Structure

A JSON representation of a todo object typically includes the following fields:

- `id` (integer): Unique identifier for the todo.
- `title` (string): Title of the todo.
- `done` (boolean): Indicates whether the todo is completed (true) or not (false).

### Example Usage

Here's an example of how you can interact with these endpoints using cURL:

**Create a New Todo:**









