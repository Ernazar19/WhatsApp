package whatsApp.servic;

import whatsApp.enums.Image;
import whatsApp.enums.Status;
import whatsApp.models.Profile;
import whatsApp.models.WhatsApp;

import java.util.List;

public interface WhatsAppRegister {
    Profile instAllWhatsApp(List<Profile> profiles);
    Profile goToProfile(List<Profile>profiles);
    void getAllWhatsAppStatus(List<Status>statusList);
    Image changeProfilePhoto(List<Profile>profiles);
    Status changeWhatsAppStatus(List<Profile>profiles);
    void addNewContact();
    void sendMessage(List<Profile>profiles);
    void deleteWhatsApp(List<WhatsApp>whatsApps);
}
