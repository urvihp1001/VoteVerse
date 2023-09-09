/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteVerse;

/**
 *
 * @author lenovo
 */
class User1 {
    
    private String partyname;
    int id,count;
    
    public User1(int id,String partyname,int count)
    {
    this.id=id;
     this.partyname=partyname;
    this.count=count;
    
    }
    
    
    
    public int getid()
    {
    return id;}
    public String getpartyname()
    {
    return partyname;}
    
    public int getcount()
    {
    return count;}
    
    
}
