# Electricity Billing System

## Problem Statement

The manual system is suffering from a series of drawbacks. Since the entire billing process is maintained manually, it becomes a tedious and lengthy process for the customer. It is time-consuming and laborious for the staff as they need to visit the customer's place every month to give the bills and receive payments. Additionally, the existing system is partially automated but still requires entering the same information at different places.

## Solution

This project system eliminates the need for maintaining paper electricity bills, as all the electricity bill records are managed electronically. The administrator doesn't have to keep a manual track of the users. The system automatically calculates fines, and users don't have to visit the office for bill payment. There is no need for a delivery boy to deliver bills to the user's place. Thus, it saves human efforts and resources.

## Contents

1) [Introduction](#introduction)
2) [Requirements](#requirements)
3) [Project Setup](#project-setup)
4) [Components](#components)
5) [Output](#output)
6) [Contributing](#contributing)
7) [License](#license)

## Introduction

Electricity Billing System is a software-based application.
- This project aims at serving the department of electricity by computerizing the billing system.
- It mainly focuses on the calculation of units consumed during the specified time and the money to be charged by the electricity offices.
- This computerized system will make the overall billing system easy, accessible, comfortable, and effective for consumers.

## Requirements

- Microsoft SQL Server
- Java core/swing 
- NetBeans IDE (Preffered)
- MySQL

## Project Setup

1. Fork this repository.
2. Clone the repository to your local machine.
   ```bash
   git clone https://github.com/Pankaj-Bind/electricity-billing-system.git
3. Install MySQL if not installed.
4. Open MySQL Command line client
      1. At first, Create a database in MySQL named as "ebs".
      2. Then create tables named as "bill", "customer" "login", "meter_info", "tax".
      3. Insert values of the tax table.
      Or (open text file Query.txt and copy all queries).
7. Install NetBeans IDE.
8. Create new project>Java with Ant>Java Application
9. In Libraries folder add this two jar files
   1. MySQL connector (mysql-connector-j-8.2.jar)
      ```bash
      https://cdn.mysql.com//Downloads/Connector-J/mysql-connector-j-8.2.0.zip
      ```
      extract then choose mysql-connector-j-8.2.0.jar
   
   2. rs2xml.jar
      ```bash
      https://webwerks.dl.sourceforge.net/project/finalangelsanddemons/rs2xml.jar
10. Create a new project named as "Electricity Billing system" and start coding the java classes.

## Components

1. MySQL Database -: "ebs"
2. Java Files -: Named as "About", "BillDetails", "CalculateBill", "Conn", "GenerateBills", "NewCustomer", "CustomerDetails", "LastBill", "DepositDetails", "Login", "MeterInfo", "Paytm", "project", "Signup", "PayBill", "UpdateInformation", "ViewInformation".
3. Image icons used in java files.
4. Libraries -: MySQL java connector, JDK17+, rs2xml.

## Output

- Screenshot1
- Screenshot2
- Screenshot3
- Screenshot5

## Contributing

Contributions are welcome! Please open an issue or submit a pull request with any improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
