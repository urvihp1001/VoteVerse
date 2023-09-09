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
public class Castopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash sp=new Splash();
        admin h=new admin();
        sp.setVisible(true);
        try
        {
            for(int i =0;i<101;i++){
            Thread.sleep(36);
            sp.loadingnum.setText(Integer.toString(i)+"%");
            sp.loadingbar.setValue(i);
            if(i==100)
            {
                sp.setVisible(false);
                h.setVisible(true);
            }
            }
            
        }
        catch(Exception e)
        {
            System.out.print("Welcome Page Not Found");
        }
    }
}
