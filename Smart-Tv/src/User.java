public class User {

    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        System.out.println("Power: "+tv.power);
        System.out.println("Channel: "+tv.channel);
        System.out.println("Volume: "+tv.volume); 
    
        tv.power();
        System.out.println("Power: "+tv.power);}
}
