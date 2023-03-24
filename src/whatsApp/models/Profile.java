package whatsApp.models;

import whatsApp.enums.Image;
import whatsApp.enums.Status;

import java.util.List;

public class Profile {
    private long id;
    private String phoneNumber;

    private String userName;
    private String password;
    private Image images;
    private Status statusList;
    private List<Message> messages;

    public Profile(long id, String phoneNumber, String userName, String password, Image images, Status statusList, List<Message> messages) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        this.images = images;
        this.statusList = statusList;
        this.messages = messages;
    }

    public Profile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public Status getStatusList() {
        return statusList;
    }

    public void setStatusList(Status statusList) {
        this.statusList = statusList;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", images=" + images +
                ", statusList=" + statusList +
                ", messages=" + messages +
                '}';
    }
}