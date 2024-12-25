# Electronic Devices

## Project Description

This is a Java-based application that models different types of devices using Object-Oriented Programming (OOP) principles. The application includes a graphical user interface (GUI) built with JavaFX, allowing users to add and manage devices of three types: **Smartphone**, **Laptop**, and **Tablet**. Each device has unique attributes, and the program leverages inheritance and encapsulation to model the devices efficiently.

### Features:
- **Device Types**: Smartphone, Laptop, and Tablet
- **Device Attributes**: Name, Price, Weight, and specific attributes for each device type (e.g., screen size for smartphones, RAM size for laptops).
- **Add/Remove Devices**: Users can add devices to a list and remove selected devices.
- **JavaFX GUI**: An intuitive interface with tabs to manage different device types, text fields to input attributes, and a ListView to display the devices.

---

## Technologies Used
- **Java**: The main programming language used for this application.
- **JavaFX**: Used to create the graphical user interface.
- **Object-Oriented Programming**: Concepts of inheritance, encapsulation, and polymorphism are used.

---

## Installation

### Prerequisites

To run this project, you need:
- **Java 8 or higher** installed on your machine.
- **JavaFX SDK** (if using an IDE like IntelliJ IDEA, ensure you have JavaFX configured properly).

### Steps to Run the Application

1. **Clone the repository**:

   Open a terminal or command prompt and run:

2. **Open the Project in an IDE**:
Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse). If you're using IntelliJ IDEA, ensure that JavaFX is correctly set up by adding the necessary SDK and VM options in the run configurations.

3. **Build and Run**:
- In IntelliJ IDEA, right-click `DeviceManagerApp.java` and select **Run**.
- If using a terminal, navigate to the project folder and run the following:
  ```
  javac *.java
  java DeviceManagerApp
  ```

---

## Usage

### 1. **User Interface**:
- **Tabs**: Use the tab pane to select the device type (Smartphone, Laptop, Tablet).
- **Input Fields**: Input the required device details (name, price, weight, etc.) for the selected device type.
  - **Smartphone**: Requires screen size and camera resolution.
  - **Laptop**: Requires RAM size and processor type.
  - **Tablet**: Requires battery life and whether it has a stylus.
- **Add Device**: Click the "Add Device" button to add the device to the list.
- **List View**: Displays all the devices added.
- **Remove Device**: Select a device from the list and click "Remove Device" to delete it from the list.

### 2. **Example Flow**:
1. Select **Smartphone** from the tab.
2. Enter details:
   - Name: `iPhone 15`
   - Price: `999.99`
   - Weight: `0.175`
   - Screen Size: `6.1`
   - Camera Resolution: `12.0`
3. Click **Add Device**.
4. The device appears in the ListView.
5. Select the device from the list and click **Remove Device** to delete it.

---

## Screenshots

### 1. **Smartphone Tab**
![Smartphone Tab Screenshot](https://github.com/user-attachments/assets/b4fdb1e7-3205-4831-bb04-ce8eb77120e5)

---

## Code Explanation

### 1. **Device Class**:
- A base class representing a generic device with attributes like `name`, `price`, and `weight`.
- Contains an `enum` for the device type (Smartphone, Laptop, Tablet).

### 2. **Derived Classes**:
- **Smartphone**: Inherits from `Device` and adds attributes like `screenSize` and `cameraResolution`.
- **Laptop**: Inherits from `Device` and adds attributes like `ramSize` and `processorType`.
- **Tablet**: Inherits from `Device` and adds attributes like `batteryLife` and `hasStylus`.

### 3. **JavaFX GUI**:
- The user interface is built using JavaFX, utilizing components like `TabPane`, `TextField`, `ListView`, and `Button`.
- The application allows users to dynamically add or remove devices from a list using JavaFX controls and updates the UI in real-time.

---

## Example Input/Output
### Input:
1. **Smartphone**:
- Name: `iPhone 15`
- Price: `999.99`
- Weight: `0.175`
- Screen Size: `6.1`
- Camera Resolution: `12.0`

### Output:
- The list now shows a new smartphone device with the above details.


  
### Input:
2. **Laptop**:
 - Name: `MacBook Pro`
 - Price: `1999.99`
 - Weight: `1.4`
 - RAM Size: `16 GB`
 - Processor Type: `Intel i7`

### Output:
- The list now shows a new laptop device with the above details.

---

### Notes:
- **Customization**: You can easily extend the project by adding more device types or additional attributes.
- **Future Improvements**: The application could include saving and loading the device list to/from a file or database.



