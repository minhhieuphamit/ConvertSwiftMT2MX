package message_block;

public class MessageBlock2Input {
    private String ID, msgType, destinationAddress, priority, deliveryMonitoring, obsolescencePeriod;

    public MessageBlock2Input() {
    }

    public String getID() {
        return ID;
    }

    public String getMsgType() {
        return msgType;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeliveryMonitoring() {
        return deliveryMonitoring;
    }

    public String getObsolescencePeriod() {
        return obsolescencePeriod;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDeliveryMonitoring(String deliveryMonitoring) {
        this.deliveryMonitoring = deliveryMonitoring;
    }

    public void setObsolescencePeriod(String obsolescencePeriod) {
        this.obsolescencePeriod = obsolescencePeriod;
    }
}
