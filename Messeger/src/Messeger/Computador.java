package Messeger;

public class Computador {
    public static void main(String[] args) {
        
        //Msn msn = new Msn();
        //msn.envierMsg();
        //msn.receberMsg();
        
        //Facebook facebook = new Facebook();
        //facebook.envierMsg();
        //facebook.receberMsg();
        
        Telegram telegram = new Telegram();
        telegram.envierMsg();
        telegram.receberMsg();

        
    }

}
