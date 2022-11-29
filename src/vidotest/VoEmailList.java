/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidotest;

/**
 *
 * @author fadil
 */
public class VoEmailList {
    private String firstName,lastName, EmailName;

    VoEmailList(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.EmailName = email;

    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailName() {
        return EmailName;
    }

    public void setEmailName(String emailName) {
        EmailName = emailName;
    }

    public VoEmailList (){
        this.firstName = firstName;
        this.lastName = lastName;
        this.EmailName = EmailName;
    }
    
    public String getFullName()
    {
    return this.firstName + " " + this.lastName;
    }
    public String getInfo()
    {
    return this.getFullName() + " - " + this.getEmailName();
    }

}
