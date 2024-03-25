package message_block;

public class MessageBlock2Output {
    private String ID, msgType, inputTime, senderDate, LTAddress, sessionNumber, sequenceNumber, outputDate, outputTime, priority;

    public MessageBlock2Output() {
    }

    public String getID() {
        return ID;
    }

    public String getMsgType() {
        return msgType;
    }

    public String getInputTime() {
        return inputTime;
    }

    public String getSenderDate() {
        return senderDate;
    }

    public String getLTAddress() {
        return LTAddress;
    }

    public String getSessionNumber() {
        return sessionNumber;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public String getOutputDate() {
        return outputDate;
    }

    public String getOutputTime() {
        return outputTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public void setSenderDate(String senderDate) {
        this.senderDate = senderDate;
    }

    public void setLTAddress(String LTAddress) {
        this.LTAddress = LTAddress;
    }

    public void setSessionNumber(String sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setOutputDate(String outputDate) {
        this.outputDate = outputDate;
    }

    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
