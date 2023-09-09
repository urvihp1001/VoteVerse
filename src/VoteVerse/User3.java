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
class User3 {

   private final String voterid,name,middlename,address,sex,surname;
    int age;
    
    public User3 (String voterid,String name,String middlename,String surname,String address,String sex,int age)
            {
            this.voterid=voterid;
           
         
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
