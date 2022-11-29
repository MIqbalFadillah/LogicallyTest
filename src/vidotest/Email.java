/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidotest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fadil
 */
public class Email {
    
    public List<VoEmailList> emailLists;
    
    public Email(){
        this.emailLists = new ArrayList<VoEmailList>();
    }
    
    public void add(VoEmailList emailList){
        boolean isNumberExists = this.isExists(emailList.getEmailName());
        if(!isNumberExists){
            this.emailLists.add(emailList);
        }
        System.out.println(emailList.getFullName() + " - " + emailList.getEmailName() + " : " + (isNumberExists ? "duplicate email" : "insert success"));
    }
    
    public void print(){
        System.out.println("Email :");
        int i = 1;
        for(VoEmailList emailList : emailLists){
            System.out.println("" + (i++) + ". " + emailList.getInfo());
        }
    }

    protected boolean isExists(String emailName) {
        for(VoEmailList voEmailList : emailLists){
            if(voEmailList.getEmailName().equals(emailName)){
                return true;
            }
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }
    
}
