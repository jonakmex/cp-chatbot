package com.chatfuel.port.request;

import lombok.Data;

@Data
public class Request {
    public String messengerUserId;
    public String firstName;
    public String lastName;
    public String gender;
    public String profilePicUrl;
    public String timezone;
    public String locale;
    public String source;
    public String lastSeen;
    public String signedUp;
    public String sessions;
    public String lastVisitedBlockName;
    public String lastVisitedBlockId;
    public String lastClickedButtonName;

    public String getMessengerUserId() {
        return messengerUserId;
    }

    public void setMessengerUserId(String messengerUserId) {
        this.messengerUserId = messengerUserId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getSignedUp() {
        return signedUp;
    }

    public void setSignedUp(String signedUp) {
        this.signedUp = signedUp;
    }

    public String getSessions() {
        return sessions;
    }

    public void setSessions(String sessions) {
        this.sessions = sessions;
    }

    public String getLastVisitedBlockName() {
        return lastVisitedBlockName;
    }

    public void setLastVisitedBlockName(String lastVisitedBlockName) {
        this.lastVisitedBlockName = lastVisitedBlockName;
    }

    public String getLastVisitedBlockId() {
        return lastVisitedBlockId;
    }

    public void setLastVisitedBlockId(String lastVisitedBlockId) {
        this.lastVisitedBlockId = lastVisitedBlockId;
    }

    public String getLastClickedButtonName() {
        return lastClickedButtonName;
    }

    public void setLastClickedButtonName(String lastClickedButtonName) {
        this.lastClickedButtonName = lastClickedButtonName;
    }
}
