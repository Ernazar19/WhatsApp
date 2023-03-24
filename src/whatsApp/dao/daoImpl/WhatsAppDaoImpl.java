package whatsApp.dao.daoImpl;

import whatsApp.dao.WhatsAppRegisterDaoService;
import whatsApp.enums.Image;
import whatsApp.enums.Status;
import whatsApp.exceptions.Exceptions;
import whatsApp.models.Profile;
import whatsApp.models.WhatsApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsAppDaoImpl implements WhatsAppRegisterDaoService {
    static long idCount;

    @Override
    public Profile instAllWhatsApp(List<Profile> profiles) {
        boolean isTrue = true;
        try {
            System.out.print("Enter phone number: ");
            String phoneNumber = new Scanner(System.in).nextLine();
            for (int i = 0; i < profiles.size(); i++) {
                if (profiles.get(i).getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                    throw new Exceptions("This number is already registered!");
                }
            }
            if (!phoneNumber.startsWith("+996")) {
                throw new Exceptions("Number should start +996");
            } else if (phoneNumber.length() <= 12) {
                throw new Exceptions("number must be at least 12 numbers!");
            } else {
                System.out.print("Enter UserName: ");
                String name = new Scanner(System.in).nextLine();
                if (name.matches("-?\\d+")) {
                    throw new Exceptions("UserName cannot contain numbers!");
                } else {
                    System.out.print("Enter password: ");
                    String pass = new Scanner(System.in).nextLine();
                    if (pass.length() < 7) {
                        throw new Exceptions("number must be at least 7 numbers");
                    }
                    Profile profile = new Profile(++idCount, phoneNumber, name, pass, Image.My_PHOTO, Status.HEY_THERE_I_AM_USING_WHATSAPP, new ArrayList<>());
                    profiles.add(profile);
                    System.out.println(profile);
                    isTrue = false;
                }
            }

        } catch (Exceptions a) {
            System.out.println(a.getMessage());
        }
        return null;
    }

    @Override
    public Profile goToProfile(List<Profile> profiles) {
        Profile profile = new Profile();
        try {
            System.out.print("Enter user name: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Enter password: ");
            String pass = new Scanner(System.in).nextLine();
            for (int i = 0; i < profiles.size(); i++) {
                if (profiles.get(i).getUserName().equalsIgnoreCase(name) || profiles.get(i).getPassword().equals(pass)) {
                    profiles.add(profile);
                    System.out.println(profiles);
                } else {
                    throw new Exceptions("User is not found");
                }
            }

        }catch (Exceptions a) {
            System.out.println(a.getMessage());
        }return null;
    }
    @Override
    public void getAllWhatsAppStatus(List<Status> statusList) {
        System.out.println(List.of(Status.values()));
    }

    @Override
    public Image changeProfilePhoto(List<Profile> profiles) {
        try {
            System.out.print("Enter user name: ");
            String name = new Scanner(System.in).nextLine();
            for (int i = 0; i <profiles.size(); i++) {
                if (profiles.get(i).getUserName().equalsIgnoreCase(name)) {
                    System.out.println(profiles.get(i));
                }else {
                    throw new Exceptions("Contact with this name not found");
                }
            }
            System.out.print("Enter password: ");
            String password = new Scanner(System.in).nextLine();
            for (int i = 0; i <profiles.size(); i++) {
                if (profiles.get(i).getPassword().equalsIgnoreCase(password)){
                    System.out.println(profiles.get(i));
                }else {
                    throw new Exceptions("Password false");
                }
            }
            Scanner scanner =new Scanner(System.in);
            System.out.println("""
                    |-------------------------|
                    | Select a profile photo  |
                    |-------------------------|
                    | 1.My_photo              |
                    | 2.Car                   |
                    | 3.Painting              |
                    |_________________________|
                    """);
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(Image.My_PHOTO);
                    break;
                case 2:
                    System.out.println(Image.CAR);
                    break;
                case 3:
                    System.out.println(Image.PAINTING);
                    break;
                default:
                    System.err.println("Error");
            }
            System.out.println(profiles);

        }catch (Exceptions a){
            System.out.println(a.getMessage());
        }
        return null;
    }
    @Override
    public Status changeWhatsAppStatus(List<Profile> profiles) {
        return null;
    }

    @Override
    public void addNewContact() {

    }

    @Override
    public void sendMessage(List<Profile> profiles) {

    }

    @Override
    public void deleteWhatsApp(List<WhatsApp> whatsApps) {

    }
}

