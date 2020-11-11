# ATMProject_CS19B031
This project was made in NetBeans IDE 12.0 JDK 14

This project is a GUI such that people would find it easy to use it.
There would be additional .form files besides the normal class java files as Netbeans uses form files besides Java files for storing and editing GUI components.

Features provided by the ATM are:
  1. Deposit
  2. Withdraw
  3. View balance
  4. Transfer Funds between accounts
  5. Change PIN 
  6. View Cash remaining in the ATM

The code starts running from the WelcomePage.java class

In the Users.csv file the first column is the Account Number, the second column is the PIN and the third column is the balance

The Cash Dispenser begins with Rs 100000

NOTE: Please don't open the Users.csv file when you press the transfer funds button and the logout button as during that time changes would be made in the file and keeping them    open might cause unexpected errors
NOTE: Also if you are interested in changing the values of the Users.csv File please use notepad++ to ensure the [cr]and[lf] i.e. ('\r' and '\n') are present at the end of each line

# EDIT:
Common Constraints implemented are:
1. OTP functionality added 
2. Password encryption done
3. Mini Statement can be viewed

Mini Statement can be viewed by clicking the view MiniStatement button. The mini statement is displayed in a text area. It shows the transactions of the user till the user presses the logout button after which the statement will reset. (As it is a ministatement)

NOTE: Please don't close the Your Phone frame that pops up while changing PIN. Doing so might lead to unexpected errors. When you click the change PIN button it will close by itself. 

NOTE: PIN is stored in the encrypted format (To prevent the owners of the banks to know what is the user's password). To see the original pin check Original_PIN_and_Encrypted.txt file present. The first column is the account number and the second column is the unencrypted PIN number.
