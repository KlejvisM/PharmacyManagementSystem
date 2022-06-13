# Pharmacy management system

## Introduction
PMS is all coded in java and it can store medicines information, delete it, update it and search through the database. It can also store regular customer names, ids and their medicine. MySQL is the database used in this project.

## Installation
Technology used in this project

Java, Apache NetBeans IDE 13, MySQL, MySQL Workbench 8.0 CE
### Jar files needed to run the project
[MySQL Connector](https://dev.mysql.com/downloads/connector/j/)

[jCalendar 1.4](http://www.java2s.com/Code/Jar/j/Downloadjcalendar14jar.htm)

[rs2xml (used for jTables)](https://jar-download.com/?search_box=rs2xml)

## Usage

```java

private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    Dashboard db=new Dashboard(); //object for the frame to be opened after 
        if(UsernameTxt.getText().equals("admin")&&(PasswordTxt.getText().equals("admin"))){
        db.setVisible(true);// open next frame if username and password are correct
        this.dispose();// dispose current frame
      }else if(UsernameTxt.getText().isEmpty()){// fieldcheck if it is empty
            JOptionPane.showMessageDialog(null, "Username is empty");
      }else if((PasswordTxt.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Password is empty");
      } else{
          JOptionPane.showMessageDialog(null, "Username or password is incorrect");
      }
        
    }                                        
```

## Contributing
Klejvis Musaraj & Kliand Qoshku

## License
[MIT](https://choosealicense.com/licenses/mit/)
