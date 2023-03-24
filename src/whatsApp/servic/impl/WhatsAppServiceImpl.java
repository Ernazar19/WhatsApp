package whatsApp.servic.impl;

import whatsApp.dao.daoImpl.WhatsAppDaoImpl;
import whatsApp.enums.Image;
import whatsApp.enums.Status;
import whatsApp.models.Profile;
import whatsApp.models.WhatsApp;
import whatsApp.servic.WhatsAppRegister;

import java.util.List;

public class WhatsAppServiceImpl implements WhatsAppRegister {
    private WhatsAppDaoImpl whatsAppDao = new WhatsAppDaoImpl();
    @Override
    public Profile instAllWhatsApp(List<Profile> profiles) {
      return whatsAppDao.instAllWhatsApp(profiles);
    }

    @Override
    public Profile goToProfile(List<Profile> profiles) {
        return  whatsAppDao.goToProfile(profiles);
    }

    @Override
    public void getAllWhatsAppStatus(List<Status> statusList) {
        whatsAppDao.getAllWhatsAppStatus(statusList);
    }

    @Override
    public Image changeProfilePhoto(List<Profile> profiles) {
        return null;
    }

    @Override
    public Status changeWhatsAppStatus(List<Profile> profilestatusList) {
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
