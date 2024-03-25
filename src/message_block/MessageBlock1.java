package message_block;

public class MessageBlock1 {
    public MessageBlock1() {
    }

    private String AppID, ServiceID, LTAddress, SessionNumber, SequenceNumber;

    public String getAppID() {
        return AppID;
    }

    public String getServiceID() {
        return ServiceID;
    }

    public String getLTAddress() {
        return LTAddress;
    }

    public String getSessionNumber() {
        return SessionNumber;
    }

    public String getSequenceNumber() {
        return SequenceNumber;
    }

    public void setAppID(String appID) {
        AppID = appID;
    }

    public void setServiceID(String serviceID) {
        ServiceID = serviceID;
    }

    public void setLTAddress(String LTAddress) {
        this.LTAddress = LTAddress;
    }

    public void setSessionNumber(String sessionNumber) {
        SessionNumber = sessionNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        SequenceNumber = sequenceNumber;
    }
}
