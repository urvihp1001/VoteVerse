/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteVerse;

/**
 *
 * @author Niraj
 */
class User {

   private final String voterid,name,middlename,address,sex,surname,password;
    int age;
    
    public User (String voterid,String password,String name,String middlename,String surname,String address,String sex,int age)
            {
            this.voterid=voterid;
            this.password=password;
         
            this.name=name;
            this.middlename=middlename;
            this.surname=surname;
               this.address=address;
            this.sex=sex;
            this.age=age;
            
            }
    public String getvoterid()
    {
    return voterid;}
    public String getpassword()
    {
    return password;}
    public String getname()
    {
    return name;}
    public String getmiddlename()
    {
    return middlename;}
     public String getsurname()
    {
    return surname;
    
    }
    public String getsex()
    {
    return sex;
    
    }
    
    public int getage()
    {
    return age;
    }
    public String getaddress()
    {
    return address;
    
    }

    
    
}
