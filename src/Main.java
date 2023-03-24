import whatsApp.dao.WhatsAppRegisterDaoService;
import whatsApp.enums.Status;
import whatsApp.models.Message;
import whatsApp.models.Profile;
import whatsApp.servic.WhatsAppRegister;
import whatsApp.servic.impl.WhatsAppServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<WhatsAppServiceImpl> whatsAppRegisters = new ArrayList<>();
        List<Profile> profiles = new ArrayList<>();
        List<Message> messages = new ArrayList<>();
        List<Status> status = new ArrayList<>();
        WhatsAppServiceImpl whatsAppRegister = new WhatsAppServiceImpl();
        while (true) {
            System.out.print("press : ");
            switch (scanner.nextInt()) {
                case 1 -> whatsAppRegister.instAllWhatsApp(profiles);
                case 2 -> whatsAppRegister.goToProfile(profiles);
                case 3 -> whatsAppRegister.getAllWhatsAppStatus(status);
            }
        }
    }
}