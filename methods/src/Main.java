public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();





    }
    public  static void   sayiBulmaca(){
         int [] sayilar = new int[]{1,2,5,7,9,0};
         int aranacak = 6;
         boolean varMi = false;

         for (int sayi : sayilar){
             if (sayi==aranacak){
                 varMi = true;
                 break;
             }
         }
         
         if (varMi){
             mesajVer("Sayı vardır:"+aranacak);

         }else {
             mesajVer("Sayı yoktur:"+aranacak);
         }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);


    }

}
