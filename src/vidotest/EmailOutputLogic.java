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
public class EmailOutputLogic {
    
    public static void main(String[] args) {
        String input = "Charlie,Zoe,charlie.zoe@example.com;Andre,Xavier,andre.xavier@example.com;Charlie,Xyz,charlie.zoe@example.com;Jean,Summers,jean.summers@example.com";
        String[] stringEmailList = input.split(";");
        Email email = new Email();
        System.out.println("====OUTPUT START=====");
        System.out.println("Log :");
        for(String stringLoop : stringEmailList){
            String splitted[] = stringLoop.split(",");
            
            VoEmailList emailList = new VoEmailList(splitted[0], splitted[1], splitted[2]);
            email.add(emailList);
        }
        
        System.out.println("");
        email.print();
        System.out.println("=== Output END ===");

        
    }
    
    
}



//karena kita mempunyai string yang panjang dan kita ingin memisahkannya dan menyusunya sesuai output yang diatas, maka jalan keluarnya kita mendefinisikan String tersebut dengan type data Array List lalu kita membagi string value index tersebut menggunakan split(regex) dengan akhiran setiap karakter ; dengan begitu kita akan mempunyai data yang sudah terbagi tiap index splitnya dan membungkusnya dengan POJO (getter setter) setelah itu kita merangkai tiap data yg sudah dibungkus dengan POJO tersebut agar sesuai dengan tampilan log diatas 