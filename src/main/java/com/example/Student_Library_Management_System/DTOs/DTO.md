# **What is DTOs?**
=> DTOs (Data Transfer Objects) are objects specifically designed to transfer data between different layers of an application.
   They are commonly used to send data across the network or between applications. 
   They are also used to carry data within the application layers, such as between the business and the data access layers.   
   DTOs are especially useful for transferring data in distributed applications, such as web applications.
   
# **Can we bind attributes from different layers in dto?** 
=> Yes, it is possible to bind attributes from different layers in a Data Transfer Object (DTO). 
   DTOs can contain any type of data, including data from multiple layers, such as business layer data, 
   data access layer data, and presentation layer data.   

# **Can we bind attributes from different Models/Entity in dto?** 
=> Yes, it is possible to bind attributes from different entities in a DTO.
This can be done by using a combination of getter and setter methods in the DTO class. 
The getter and setter methods can then be used to access the attributes from the different entities, and
the DTO can be used to transfer the data between different layers of the application.

# **How to write a dto class give a small example?**
A DTO (Data Transfer Object) is an object used to transfer data between two components. 
It acts as a data container, allowing the two components to communicate without sharing the actual data.

Here is an example of a simple DTO class:

public class UserDto { 
      private String firstName; 
      private String lastName; 
      private int age;

      public String getFirstName() {return firstName;}

      public void setFirstName(String firstName){this.firstName = firstName;}
      
      public String getLastName() {return lastName;}      

      public void setLastName(String lastName) {this.lastName = lastName;   

      public int getAge() {return age;}      

      public void setAge(int age) {this.age = age;}
}