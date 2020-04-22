package OfficeHours;

public class OfficeHours {
    public static void main(String[] args) {
        boolean exit=false;
        while(!exit)
        {
            for (int i = 1; i<=20; i++)
            {
                if (i>=20)
                {
                    exit= true;
                    break;
                }
                if(i%3==0){
                    System.out.println(i+" ");
                }
            }
        }
    }
}
