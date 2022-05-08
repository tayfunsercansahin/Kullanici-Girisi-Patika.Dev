import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris yaptiniz...");
        }
        else{
            if(userName.equals("patika")){
                System.out.println("Sifreniz yanlis!");
                System.out.println("Sifrenizi sifirlamak ister misiniz?");
                System.out.println("1.Evet | 2.Hayir");
                select = input.nextInt();

                if (select == 1){
                    System.out.print("Yeni sifrenizi giriniz: ");
                    newPassword = input2.nextLine();

                    if (newPassword.equals("java123")){
                        System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz!");
                    }
                    else{
                        password = newPassword;
                        System.out.println("Sifre olusturuldu...");
                        System.out.println("Yeni sifreniz: " + password);
                    }
                }
                else if (select == 2){
                    System.out.println("Sifrenizi degistirmek istemiyorsunuz!");
                }
                else {
                    System.out.println("Lutfen 1 veya 2'yi seciniz!");
                }

            }
            else if(password.equals("java123")){
                System.out.println("Kullanici adiniz yanlis!");
            }
            else{
                System.out.println("Hem kullanici adi, hem de sifreniz yanlis!");
            }
        }

    }
}
