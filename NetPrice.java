public class NetPrice{
    public static float calculateNet(float brutto,float tax){
        if(tax>0&&tax<1){
            return (brutto/(1+tax))*100;
        } else {
            return 0;
        }
    }
}
