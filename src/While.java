public class While {
    public static void main(String[] args) {
        int count = 1;
        while(count< 3)
            if(++count==2)
                break;
        else continue;
        System.out.println(count);
        for(int i = 0; i < 10; i++)
            while(i++<10)
                if(i==5)
                    System.out.println("if");
         for(int i = 0; i < 7; i+=1){
             System.out.println(i);
         }
    }

}
