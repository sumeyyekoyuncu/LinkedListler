
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Sehir_turu {
    public static void islemleribastir(){
        System.out.println("0-islemleri goruntule");
        System.out.println("1-Bir sonraki sehre git");
        System.out.println("2-Bir onceki sehre git");
        System.out.println("3-uygulamadan cik...");
                
    }
    public static void sehirleriturla(LinkedList<String> sehirler){
     ListIterator<String> iterator=sehirler.listIterator();
        int islem;
        islemleribastir();
        Scanner scanner=new Scanner(System.in);
        if(!iterator.hasNext()){ //bossa true olacaktir.
            System.out.println("herhangi bir sehir bulunmuyor.");
        }
        boolean cikis=false;
        boolean ileri=true;
        while(!cikis){
            System.out.println("Bir islem seciniz");
            islem=scanner.nextInt();
            if(islem==3){
                System.out.println("sistemden cikiliyor...");
                break;
            }
            else if(islem==0){
                System.out.println("islemler tekrar ekraaniniza geliyor...");
                islemleribastir();
            }
            else if(islem==1){
                if(!ileri){
                    if(iterator.hasNext()){
                        iterator.next();
                        ileri=true;
                    }
                }
                if(iterator.hasNext()){
                    System.out.print("bir sonraki sehre gidiliyor...");
                    System.out.println("sehir:"+iterator.next());
                }
                else{
                    System.out.println("gidilecek sehir kalmadi...");
                }
                
                
            }
            else if(islem==2){
                if(ileri){
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        ileri=false;
                    }
                    
                }
                if(iterator.hasPrevious()){
                System.out.println("bir önceki sehre gidiliyor...");
                    System.out.println("sehir:"+iterator.previous());
                    ileri=true;
                }
                else{
                    System.out.println("sehir turu basladi...");
                }
               
            }
            else {
                System.out.println("gecersiz islem girisi yaptınız...");
            }
        }
            
    }

    public static void main(String[] args) {
        LinkedList<String> sehirler=new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        sehirleriturla(sehirler);
    }
}
